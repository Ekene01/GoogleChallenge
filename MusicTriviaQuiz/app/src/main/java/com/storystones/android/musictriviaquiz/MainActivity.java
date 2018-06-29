package com.storystones.android.musictriviaquiz;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score = 0;

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();
    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mScoreView = findViewById(R.id.your_score);
        mQuestionView = findViewById(R.id.music_question_1);
        mButtonChoice1 = findViewById(R.id.question1_option1);
        mButtonChoice2 = findViewById(R.id.question1_option2);

        updateQuestion();

        /**
         * This method listens for the clicks of the user on the first button and based on the answers provided in
         * the Question Library, the method does the following :
         * 1. Increases the user's score by 1
         * 2. Displays a toast showing whether the answer was correct or wrong
         * 3. Updates the question.
         */

        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mButtonChoice1.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                    gameOver();
                }
            }
        });

        /**
         * This method listens for the clicks of the user on the first button and based on the answers provided in
         * the Question Library, the method does the following:
         * 1. Increases the user's score by 1
         * 2. Displays a toast showing whether the answer was correct or wrong
         * 3. Updates the question.
         */

        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mButtonChoice2.getText() == mAnswer){
                    mScore = mScore + 5;
                    updateScore(mScore);
                    updateQuestion();

                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                    gameOver();
                }
            }
        });
    }

    /**
     * This method gets questions from the question library and also the options set.
     */

    public void updateQuestion(){
        mQuestionView.setText(mQuestionLibrary.getQuestions(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));

        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;
    }

    /**
     * This method updates the user's score
     */

    public void updateScore(int point){
        mScoreView.setText(""+ mScore);
    }

    /**
     * This method is still under review. It is supposed to make the game restart upon completion.
     */

    private void gameOver(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder
                .setMessage("Game Over! Your score is " +mScore + " points.")
                .setCancelable(false)
                .setPositiveButton("NEW GAME",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                            }
                        })

                .setNegativeButton("EXIT",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                            }
                        });
    }


}
