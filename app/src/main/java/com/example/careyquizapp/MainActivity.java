package com.example.careyquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView questionTV;
    EditText answerBox;
    Button submitBTN;
    String message;
    Button doneBTN;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionTV = (TextView) findViewById(R.id.answerBOX);
        answerBox = (EditText) findViewById(R.id.answerBOX);
        submitBTN = (Button) findViewById(R.id.submitBTN);
        message = "";
        doneBTN = (Button) findViewById(R.id.doneBTN);
        score=0;



        submitBTN .setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v) {
                if (answerBox.getText().toString().equals("Barock Obama")){
                    message = "GoodJob";
                    score = score + 1;
                }
                else {
                    message = "you got it wrong";
                }
                Toast myToast = Toast.makeText(getApplicationContext() , message , Toast.LENGTH_SHORT);
                myToast.show();
            }

        });

        doneBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, ScoreActivity.class);
                myIntent.putExtra("score", score);

                startActivity(myIntent);

            }
        });


    }



}