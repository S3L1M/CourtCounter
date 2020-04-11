package com.example.mohamed.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void a1(View v) {
        scoreA+=3;
        displayScoreA();
    }

    public void a2(View v) {
        scoreA+=2;
        displayScoreA();
    }

    public void a3(View v) {
        scoreA++;
        displayScoreA();
    }

    public void b1(View v) {
        scoreB+=3;
        displayScoreB();
    }

    public void b2(View v) {
        scoreB+=2;
        displayScoreB();
    }

    public void b3(View v) {
        scoreB++;
        displayScoreB();
    }

    public void reset(View v) {
        scoreA = 0;
        scoreB = 0;
        displayScoreA();
        displayScoreB();
    }

    private void displayScoreA() {
        TextView x = (TextView) findViewById(R.id.scrA);
        x.setText(""+scoreA);
    }

    private void displayScoreB() {
        TextView x = (TextView) findViewById(R.id.scrB);
        x.setText(""+scoreB);
    }
}
