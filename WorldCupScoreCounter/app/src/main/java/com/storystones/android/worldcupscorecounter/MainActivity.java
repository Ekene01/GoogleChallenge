package com.storystones.android.worldcupscorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Team A

    public void displayForTeamA(int number) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(number));
    }

    public void teamAGoal(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    // Team B

    public void displayForTeamB(int number) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(number));
    }

    public void teamBGoal(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamA(scoreTeamB);
    }

    public void reset (View view) {
        scoreTeamB = 0;
        scoreTeamA = 0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);

    }
}
