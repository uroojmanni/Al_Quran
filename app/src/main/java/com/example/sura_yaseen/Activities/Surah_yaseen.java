package com.example.sura_yaseen.Activities;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sura_yaseen.Adapter.Adapter_Quran;
import com.example.sura_yaseen.Database_Repository.Quran_data_repository;
import com.example.sura_yaseen.Model.Model_Quran;
import com.example.sura_yaseen.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Surah_yaseen extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Adapter_Quran adapterQuran;
    private List<Model_Quran> list1 = new ArrayList<>();
    private TextToSpeech textToSpeech;
    private ImageButton playButton;
    private int currentSpeakingPosition = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah_yaseen);

        recyclerView = findViewById(R.id.yaseen_recycle2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // play button
        playButton = findViewById(R.id.play_button);
        playButton.setOnClickListener(v -> {
            if (textToSpeech != null && textToSpeech.isSpeaking()) {
                textToSpeech.stop();
                playButton.setImageResource(R.drawable.media_11835744);
                adapterQuran.setPlayingPosition(-1); // Stop highlighting any text
            } else {
                speakTexts();
            }
        });

        // Initialize TextToSpeech
        textToSpeech = new TextToSpeech(this, status -> {
            if (status == TextToSpeech.SUCCESS) {
                textToSpeech.setLanguage(Locale.US); // Set language, you can change as per your requirement
            } else {
                // Initialization failed
            }
        });

        // Data from repository
        list1 = Quran_data_repository.yaseen_data();

        // Set up RecyclerView
        adapterQuran = new Adapter_Quran(this, list1);
        recyclerView.setAdapter(adapterQuran);
    }

    private void speakTexts() {
        if (textToSpeech != null) {
            for (int i = 0; i < list1.size(); i++) {
                String text = list1.get(i).getText2();
                textToSpeech.speak(text, TextToSpeech.QUEUE_ADD, null, String.valueOf(i));
            }
            playButton.setImageResource(R.drawable.pause22);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Release TextToSpeech resources when activity is destroyed
        if (textToSpeech != null) {
            textToSpeech.stop();
            textToSpeech.shutdown();
            textToSpeech = null;
        }
    }}
