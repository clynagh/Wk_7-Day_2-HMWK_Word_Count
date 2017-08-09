package com.example.craiglynagh.word_counter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.craiglynagh.word_counter.R.string.count;

public class Word_Count extends AppCompatActivity {

    EditText inputEditText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word__count);

        inputEditText = (EditText)findViewById(R.id.input_text);
        button = (Button)findViewById(R.id.button);
    }

    public void onButtonClicked(View Button){
            String sentence =  inputEditText.getText().toString();
         count = Counter.countWords("");

        Intent intent = new Intent(this, DisplayCounter.class);
        intent.putExtra("count", count);
        startActivity(intent);

    }
}
