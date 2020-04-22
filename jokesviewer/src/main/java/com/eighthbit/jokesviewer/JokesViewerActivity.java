package com.eighthbit.jokesviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokesViewerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_jokes_viewer);

        if (getIntent() != null) {
            String joke = getIntent().getStringExtra("joke");
            TextView jokeText = findViewById(R.id.joke_tv);
            jokeText.setText(joke);
        }
    }
}
