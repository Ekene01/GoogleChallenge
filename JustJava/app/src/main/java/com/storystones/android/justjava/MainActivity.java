package com.storystones.android.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int quantity = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * This is the increment method to increase quantity of coffee that can be purchased
     */

    public void increment(View view) {
        quantity = quantity + 1;
        displayQuantity(quantity);
    }

    /**
     * This is the increment method to decrease quantity of coffee that can be purchased
     */
    public void decrement(View view) {
        quantity = quantity - 1;
        displayQuantity(quantity);
    }


    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        String priceMessage = createOrderSummary();
        displayMessage(priceMessage);



    }

    /**
     * Calculates the price of the order.
     * @return total price
     *
     */
    private int calculatePrice() {
        int price = quantity * 5;
        return price;
    }


    // displayPrice(quantity * 5);
    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int number) {
        TextView quantityTextView = findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    private String createOrderSummary(){
        String display = "Name: Ekene Ikoro \n" +
                "Quantity: "+ quantity + "\n" +
                "Total: $" + calculatePrice() + "\n" +
                "Thank you";
        return display;
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView orderSummaryTextView = findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);

    }


}
