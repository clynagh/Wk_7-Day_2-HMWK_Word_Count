package com.example.craiglynagh.word_counter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.craiglynagh.word_counter.R.string.count;


public class DisplayCounter extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_counter);

        Log.d("WordCount: ", "DisplayCounter.onCreateCalled");

        TextView answerText = (TextView)findViewById(R.id.input_text);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String answer = extras.getString("count");

        answerText.setText(count);
    }


}
