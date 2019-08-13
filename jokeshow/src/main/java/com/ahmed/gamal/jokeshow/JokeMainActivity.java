package com.ahmed.gamal.jokeshow;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class JokeMainActivity extends AppCompatActivity {

    TextView joke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_main);
        joke = findViewById(R.id.tv_joke);

        if (getIntent().hasExtra("joke")) {
            joke.setText(getIntent().getStringExtra("joke"));
        }
    }



}
