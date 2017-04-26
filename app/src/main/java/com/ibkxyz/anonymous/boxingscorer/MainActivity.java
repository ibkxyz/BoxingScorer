package com.ibkxyz.anonymous.boxingscorer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int shootA = 0;
    int shootB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void displayForTeamA(int score) {
        TextView scoreViewA = (TextView) findViewById(R.id.team_a_score);
        scoreViewA.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreViewA = (TextView) findViewById(R.id.team_b_score);
        scoreViewA.setText(String.valueOf(score));
    }

    /**-----------------------------------------------------------
     * ACTIVITY FROM HERE IS FOR TEAM A.
     * ...........................................................*/


    /**
     * This method is called when the +3 Points button is clicked for Team A.
     */

    public void threepointsA(View view) {
        shootA = shootA + 3;
        displayForTeamA(shootA);
    }


    /**
     * This method is called when the +2 Points button is clicked for Team A.
     */

    public void twopointsA(View view) {
        shootA = shootA + 2;
        displayForTeamA(shootA);
    }


    /**
     * This method is called when the FREE THROW button is clicked for Team A.
     */

    public void freethrowA(View view) {
        shootA = shootA + 1;
        displayForTeamA(shootA);
    }


    /**-----------------------------------------------------------
     * ACTIVITY FROM HERE IS FOR TEAM B.
     * ...........................................................*/


    /**
     * This method is called when the +3 Points button is clicked for Team B.
     */

    public void threepointsB(View view) {
        shootB = shootB + 3;
        displayForTeamB(shootB);
    }


    /**
     * This method is called when the +2 Points button is clicked for Team B.
     */

    public void twopointsB(View view) {
        shootB = shootB + 2;
        displayForTeamB(shootB);
    }


    /**
     * This method is called when the FREE THROW button is clicked for Team B.
     */

    public void freethrowB(View view) {
        shootB = shootB + 1;
        displayForTeamB(shootB);
    }


    public void reset(View view) {
        shootA = 0;
        shootB = 0;
        displayForTeamA(shootA);
        displayForTeamB(shootB);
    }

}