package com.counter.android.countcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tvScoreA = (TextView) findViewById(R.id.scoreA);
        Button btnPoint3A = (Button) findViewById(R.id.btn3A);
        Button btnPoint2A = (Button) findViewById(R.id.btn2A);
        Button btnPoint1A = (Button) findViewById(R.id.FTA);

        final TextView tvScoreB = (TextView) findViewById(R.id.scoreB);
        Button btnPoint3B = (Button) findViewById(R.id.btn3B);
        Button btnPoint2B = (Button) findViewById(R.id.btn2B);
        Button btnPoint1B = (Button) findViewById(R.id.FTB);

        Button btnHapus = (Button) findViewById(R.id.btnReset);

        btnPoint3A.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                scoreA = scoreA+3;
                tvScoreA.setText(Integer.toString(scoreA));
            }
        });

        btnPoint2A.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                scoreA = scoreA+2;
                tvScoreA.setText(Integer.toString(scoreA));
            }
        });

        btnPoint1A.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                scoreA++;
                tvScoreA.setText(Integer.toString(scoreA));
            }
        });

        btnPoint3B.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                scoreB = scoreB+3;
                tvScoreB.setText(Integer.toString(scoreB));
            }
        });

        btnPoint2B.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                scoreB = scoreB+2;
                tvScoreB.setText(Integer.toString(scoreB));
            }
        });

        btnPoint1B.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                scoreB++;
                tvScoreB.setText(Integer.toString(scoreB));
            }
        });

        btnHapus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                tvScoreA.setText(Integer.toString(scoreA = 0));
                tvScoreB.setText(Integer.toString(scoreB = 0));
            }
        });

    }

}
