package com.example.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Displays the given score for Team A.
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    //Displays the given score for Team B.
    public void displayForTeamB(int scoreB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
    }

    //Increment 3 pointer
    public void pointer3(View view) {
        int p3 = 3;
        score += p3;
        displayForTeamA(score);
    }

    //Increment 2 pointer
    public void pointer2(View view) {
        int p2 = 2;
        score += p2;
        displayForTeamA(score);
    }

    //Increment 1 pointer
    public void pointer1(View view) {
        int p1 = 1;
        score += p1;
        displayForTeamA(score);
    }

    //Increment 3 pointer for tram B
    public void pointer3B(View view) {
        int p3 = 3;
        scoreB += p3;
        displayForTeamB(scoreB);
    }

    //Increment 2 pointer for team B
    public void pointer2B(View view) {
        int p2 = 2;
        scoreB += p2;
        displayForTeamB(scoreB);
    }

    //Increment 1 pointer for team B
    public void pointer1B(View view) {
        int p1 = 1;
        scoreB += p1;
        displayForTeamB(scoreB);
    }

    //Reset
    public void reset(View view) {
        score = 0;
        scoreB = 0;
        displayForTeamA(score);
        displayForTeamB(scoreB);
    }

}
