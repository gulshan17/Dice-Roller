package com.example.gulsh.diceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button roll;
    private ImageButton roll1;
    private ImageButton roll2;
    private Random randNum = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        roll = findViewById(R.id.button);
        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setRoll1();
                setRoll2();
            }
        });

        roll1 = findViewById(R.id.imageButton1);
        roll1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setRoll1();
            }
        });

        roll2 = findViewById(R.id.imageButton2);
        roll2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setRoll2();
            }
        });
    }

    private void setRoll1() {
        switch (randNum.nextInt(6) + 1) {
            case 1:
                roll1.setImageResource(R.drawable.dice1);
                break;

            case 2:
                roll1.setImageResource(R.drawable.dice2);
                break;

            case 3:
                roll1.setImageResource(R.drawable.dice3);
                break;

            case 4:
                roll1.setImageResource(R.drawable.dice4);
                break;

            case 5:
                roll1.setImageResource(R.drawable.dice5);
                break;

            case 6:
                roll1.setImageResource(R.drawable.dice6);
                break;
        }
    }

    private void setRoll2()
    {
        switch(randNum.nextInt(6) + 1)
        {
            case 1 :
                roll2.setImageResource(R.drawable.dice1);
                break;

            case 2 :
                roll2.setImageResource(R.drawable.dice2);
                break;

            case 3 :
                roll2.setImageResource(R.drawable.dice3);
                break;

            case 4 :
                roll2.setImageResource(R.drawable.dice4);
                break;

            case 5 :
                roll2.setImageResource(R.drawable.dice5);
                break;

            case 6 :
                roll2.setImageResource(R.drawable.dice6);
                break;
        }
    }
}
