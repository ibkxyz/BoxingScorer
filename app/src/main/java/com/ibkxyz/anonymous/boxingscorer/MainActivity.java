package com.ibkxyz.anonymous.boxingscorer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int boxer1 = 0;
    int boxer2 = 0;


    @Override



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getWindow().getDecorView().setSystemUiVisibility(8);
        setContentView(R.layout.activity_main);
    }

//    public void onWindowFocusChanged(boolean hasFocus){
//        super.onWindowFocusChanged(hasFocus);
//
//        if(hasFocus){
//
//            decorView.setSystemUiVisibility(
//                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
//                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
//                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
//                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
//                            | View.SYSTEM_UI_FLAG_FULLSCREEN
//                            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
//            );
//        }
//    }


    public void displayForBoxer1(int score) {
        TextView scoreViewA = (TextView) findViewById(R.id.boxer_1_score);
        scoreViewA.setText(String.valueOf(score));
    }

    public void displayForBoxer2(int score) {
        TextView scoreViewA = (TextView) findViewById(R.id.boxer_2_score);
        scoreViewA.setText(String.valueOf(score));
    }

    public void displayWinner(String result){
        TextView stat = (TextView) findViewById(R.id.textview_status);
        stat.setText(String.valueOf(result));
    }

    /**-----------------------------------------------------------
     * ACTIVITY FROM HERE IS FOR BOXER 1.
     * ...........................................................*/


    /**
     * This method is called when the 10 - 9 button is clicked for Boxer 1.
     */

    public void tenNine1(View view) {
        boxer1 = boxer1 + 10;
        boxer2 = boxer2 + 9;
        displayWinner("");
        displayForBoxer1(boxer1);
        displayForBoxer2(boxer2);
    }


    /**
     * This method is called when the Foul button is clicked for Boxer 1.
     */

    public void foul1(View view) {
        boxer1 = boxer1 - 1;
        displayWinner("");
        displayForBoxer1(boxer1);
    }


    /**
     * This method is called when the Knockdown button is clicked for Boxer 1.
     */

    public void Knockdown1(View view) {
        boxer1 = boxer1 - 1;
        displayWinner("");
        displayForBoxer1(boxer1);
    }

    /**
     * This method is called when the Knockout button is clicked for Boxer 1.
     */

    public void Knockout1(View view) {
        displayWinner("Boxer 1 wins the match by Knockout");
    }


    /**-----------------------------------------------------------
     * ACTIVITY FROM HERE IS FOR TEAM B.
     * ...........................................................*/

    /**
     * This method is called when the 10 - 9 button is clicked for Boxer 2.
     */

    public void tenNine2(View view) {
        boxer1 = boxer1 + 9;
        boxer2 = boxer2 + 10;
        displayWinner("");
        displayForBoxer1(boxer1);
        displayForBoxer2(boxer2);
    }


    /**
     * This method is called when the Foul button is clicked for Boxer 2.
     */

    public void foul2(View view) {
        boxer2 = boxer2 - 1;
        displayWinner("");
        displayForBoxer2(boxer2);
    }


    /**
     * This method is called when the Knockdown button is clicked for Boxer 2.
     */

    public void Knockdown2(View view) {
        boxer2 = boxer2 - 1;
        displayWinner("");
        displayForBoxer2(boxer2);
    }

    /**
     * This method is called when the Knockout button is clicked for Boxer 2.
     */

    public void Knockout2(View view) {
        displayWinner("Boxer 2 wins the match by Knockout");
    }



    /**-----------------------------------------------------------
     * ACTIVITY FROM HERE IS FOR OTHER BUTTONS.
     * ...........................................................*/

    /**
     * This method is called when the Draw button is clicked.
     */

    public void equalPoints(View view) {
        boxer1 = boxer1 + 10;
        boxer2 = boxer2 + 10;
        displayWinner("");
        displayForBoxer1(boxer1);
        displayForBoxer2(boxer2);
    }



    /**
     * This method is called when the Match Draw button is clicked.
     */

    public void matchDraw(View view) {
        displayWinner("The Match has been declared draw by the referee");
    }



    /**
     * This method is called when the Match Draw button is clicked.
     */

    public void noContest(View view) {
        displayWinner("The Match has been declared No Contest by the referee");
    }



    /**
     * This method is called when the End Game button is clicked.
     */

    public void endGame(View view) {
        boxer1 = 0;
        boxer2 = 0;
        displayForBoxer1(boxer1);
        displayForBoxer2(boxer2);
        displayWinner("The Match has ended");
    }

}