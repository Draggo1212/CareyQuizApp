package com.example.careyquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView questionTV;
    EditText answerBox;
    Button submitBTN;
    String message;
    Button nextBTN;
    int score;
    Question Q1, Q2, Q3, Q4, Q5;
    int tracker;
    Question currentQ;
    Question[] questions;
    ImageView pictures;

    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionTV = (TextView) findViewById(R.id.questionTV);
        answerBox = (EditText) findViewById(R.id.answerBOX);
        submitBTN = (Button) findViewById(R.id.submitBTN);
        message = "";
        nextBTN = (Button) findViewById(R.id.nextBTN);
        score=0;
        Q1 = new Question(getString(R.string.Q1), getString(R.string.Q1answer), R.drawable.obama);
        Q2 = new Question(getString(R.string.Q2), getString(R.string.Q2answer), R.drawable.grant);
        Q3 = new Question((getString(R.string.Q3)), getString(R.string.Q3answer), R.drawable.jimmy);
        Q4 = new Question((getString(R.string.Q4)), getString(R.string.Q4answer), R.drawable.william);
        Q5 = new Question((getString(R.string.Q5)), getString(R.string.Q5answer), R.drawable.ronald);
        tracker=0;
        currentQ = Q1;
        questions = new Question[] {Q1, Q2, Q3, Q4, Q5};
        pictures = (ImageView) findViewById(R.id.imageView);



        submitBTN .setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v) {
                // getting correct answer
                if (answerBox.getText().toString().equals(currentQ.getCorrectAnswer())){
                    message = (getString(R.string.correct));
                    score = score + 1;
                }
                else {
                    message = (getString(R.string.incorrect));
                }
                Toast myToast = Toast.makeText(getApplicationContext() , message , Toast.LENGTH_SHORT);
                myToast.show();
            }

        });

        nextBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tracker>=questions.length-1){
                    Intent myIntent = new Intent(MainActivity.this, ScoreActivity.class);
                    myIntent.putExtra("score", score);

                    startActivity(myIntent);

                }
                else{
                    tracker = tracker + 1;
                    currentQ = questions[tracker];
                    questionTV.setText(currentQ.getQText());
                    pictures.setImageResource(currentQ.getPicture());

                }


            }
        });


    }



}