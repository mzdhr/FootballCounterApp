package com.mzdhr.footballcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int mGoalBlueTeam;
    int mFoulBlueTeam;
    int mScoreRedTeam;
    int mFoulRedTeam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void displayGoalForBlueTeam(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_blue_goal);
        scoreView.setText(String.valueOf(score));
    }

    public void displayGoalForRedTeam(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_red_goal);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulForBlueTeam(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_blue_foul);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulForRedTeam(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_red_foul);
        scoreView.setText(String.valueOf(score));
    }


    public void addGoalToBlueTeam(View view){
        mGoalBlueTeam = mGoalBlueTeam + 1;
        displayGoalForBlueTeam(mGoalBlueTeam);
    }

    public void addGoalToRedTeam(View view){
        mScoreRedTeam = mScoreRedTeam + 1;
        displayGoalForRedTeam(mScoreRedTeam);
    }

    public void addFoulToBlueTeam(View view){
        mFoulBlueTeam = mFoulBlueTeam + 1;
        displayFoulForBlueTeam(mFoulBlueTeam);
    }

    public void addFoulToRedTeam(View view){
        mFoulRedTeam = mFoulRedTeam + 1;
        displayFoulForRedTeam(mFoulRedTeam);
    }


    public void newGame(View view){
        mGoalBlueTeam = 0;
        mFoulBlueTeam = 0;
        mScoreRedTeam = 0;
        mFoulRedTeam = 0;

        displayGoalForBlueTeam(mGoalBlueTeam);
        displayGoalForRedTeam(mFoulBlueTeam);
        displayFoulForBlueTeam(mScoreRedTeam);
        displayFoulForRedTeam(mFoulRedTeam);
    }


}
