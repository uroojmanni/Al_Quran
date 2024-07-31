package com.example.sura_yaseen.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sura_yaseen.R;
import com.google.android.material.button.MaterialButton;

public class Splash_screen extends AppCompatActivity {

    private ProgressBar progressBar;
    private MaterialButton continueButton;

    private static final long SPLASH_DELAY = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_secreen);


        progressBar = findViewById(R.id.progressbar);
        continueButton = findViewById(R.id.continueButton);
        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Splash_screen.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // Show progress bar and hide button initially
        progressBar.setVisibility(View.VISIBLE);
        continueButton.setVisibility(View.GONE);

        // Handler to delay the visibility changes
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Hide progress bar and show button after 3 seconds
                progressBar.setVisibility(View.GONE);
                continueButton.setVisibility(View.VISIBLE);
            }
        }, 3000); // 3000 milliseconds = 3 seconds
    }
}
