package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    TextView mStory;
    Button mAnswerOne;
    Button mAnswerTwo;
    int mStoryIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStory = findViewById(R.id.storyTextView);
        mAnswerOne = findViewById(R.id.buttonTop);
        mAnswerTwo = findViewById(R.id.buttonBottom);
        mStoryIndex = 1;


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mAnswerOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Top Button","Top button pressed");

                if (mStoryIndex == 1) {
                    //This will take to first part of the story ( Top )
                    mStory.setText(R.string.T3_Story);
                    mAnswerOne.setText(R.string.T3_Ans1);
                    mAnswerTwo.setText(R.string.T3_Ans2);
                    mStoryIndex =mStoryIndex +1;

                }
                else if (mStoryIndex == 2){
                    mStory.setText(R.string.T6_End);
                    mAnswerOne.setVisibility(View.GONE);
                    mAnswerTwo.setVisibility(View.GONE);
                }
                else if (mStoryIndex == 3){
                    mStory.setText(R.string.T3_Story);
                    mAnswerOne.setText(R.string.T3_Ans1);
                    mAnswerTwo.setText(R.string.T3_Ans2);
                    mStoryIndex =mStoryIndex +1;
                }
                else if (mStoryIndex == 4) {
                    mStory.setText(R.string.T6_End);
                    mAnswerOne.setVisibility(View.GONE);
                    mAnswerTwo.setVisibility(View.GONE);
                }

            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
            mAnswerTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d("Bottom Button","Bottom button pressed");

                    if (mStoryIndex == 1) {
                        //This will take to first part of the story ( Bottom )
                        mStory.setText(R.string.T2_Story);
                        mAnswerOne.setText(R.string.T2_Ans1);
                        mAnswerTwo.setText(R.string.T2_Ans2);
                        mStoryIndex = mStoryIndex +2;
                    }
                    else if (mStoryIndex == 2){
                        mStory.setText(R.string.T5_End);
                        mAnswerOne.setVisibility(View.GONE);
                        mAnswerTwo.setVisibility(View.GONE);
                    }
                    else if (mStoryIndex == 3){
                        mStory.setText(R.string.T4_End);
                        mAnswerOne.setVisibility(View.GONE);
                        mAnswerTwo.setVisibility(View.GONE);
                    }
                    else if (mStoryIndex == 2) {
                        mStory.setText(R.string.T5_End);
                        mAnswerOne.setVisibility(View.GONE);
                        mAnswerTwo.setVisibility(View.GONE);
                    }
                }
            });

    }
}
