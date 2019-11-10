package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int natialScore = 0;
    int natialFoul = 0;
    int eknorrScore = 0;
    int eknorrFoul = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayScoreNatial (int score) {
        TextView scoreView = (TextView) findViewById(R.id.goal_natial);
        scoreView.setText(String.valueOf(score));
    }

    public void goalNatial (View view) {
        natialScore = natialScore + 1 ;
        displayScoreNatial(natialScore);
    }

    public void displayFoulNatial (int foul) {
        TextView scoreView = (TextView) findViewById(R.id.foul_natial);
        scoreView.setText(String.valueOf(foul));
    }

    public void foulNatial (View view) {
        natialFoul = natialFoul + 1;
        displayFoulNatial(natialFoul);
    }

    public void displayScoreEknorr (int score) {
        TextView scoreView = (TextView) findViewById(R.id.goal_eknorr);
        scoreView.setText(String.valueOf(score));
    }

    public void goalEknorr (View view) {
        eknorrScore = eknorrScore + 1;
        displayScoreEknorr(eknorrScore);
    }

    public void displayFoulEknorr (int foul) {
        TextView scoreView = (TextView) findViewById(R.id.foul_eknorr);
        scoreView.setText(String.valueOf(foul));
    }

    public void foulEknorr (View view) {
        eknorrFoul = eknorrFoul + 1;
        displayFoulEknorr(eknorrFoul);
    }

    public void reset (View view) {
        natialScore = 0;
        natialFoul = 0;
        eknorrScore = 0;
        eknorrFoul = 0;
        displayScoreNatial(0);
        displayFoulNatial(0);
        displayScoreEknorr(0);
        displayFoulEknorr(0);
    }

}
