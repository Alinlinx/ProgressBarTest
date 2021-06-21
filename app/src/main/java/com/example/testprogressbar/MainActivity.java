package com.example.testprogressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int progress = 75;
    public ImageButton buttonIncrement;
    public ImageButton buttonDecrement;
    public ProgressBar progressBar;
    public TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonDecrement = (ImageButton) findViewById(R.id.image_button_decr);
        buttonIncrement = (ImageButton) findViewById(R.id.image_button_incr);
        progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        textView = (TextView) findViewById(R.id.text_view_progress);

        buttonIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (progress <= 95) {
                    progress += 5;
                    updateProgressBar();
                }
            }
        });

        buttonDecrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (progress >= 5) {
                    progress -= 5;
                    updateProgressBar();
                }
            }
        });
    }

    private void updateProgressBar() {
        progressBar.setProgress(progress);
        textView.setText(String.valueOf(progress + "%"));
    }
}