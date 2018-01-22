package com.a9bynight.muaythaitimer;


import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declare Buttons
    Button mStartButton;
    Button mPauseButton;
    Button mResetButton;

    //Declare Chronometer
    Chronometer mChronometer;

    //Declare TextField to hold the time remaining statistics
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Linking the Buttons to their ids
        mStartButton = findViewById(R.id.start_button);
        mPauseButton = findViewById(R.id.pause_button);
        mResetButton = findViewById(R.id.reset_button);
        mChronometer = findViewById(R.id.chronometer);

        //need to declare the id that matches to the TextView
        mTextView = findViewById(R.id.textView);

        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //example modified from Google Developer documentation
                new CountDownTimer(30000, 1000){
                    public void onTick(long millisUntilFinished) {
                        mTextView.setText("seconds remaining: " + millisUntilFinished / 1000);
                    }

                    public void onFinish() {
                        mTextView.setText("Round's Up!");
                    }
                }.start();
            }
        });




    }
}
