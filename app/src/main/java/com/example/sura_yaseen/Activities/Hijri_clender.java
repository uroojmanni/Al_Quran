package com.example.sura_yaseen.Activities;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.sura_yaseen.R;

public class Hijri_clender extends AppCompatActivity {
    private CalendarView hijriCalendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_hijri_clender);

        hijriCalendarView = findViewById(R.id.hijrii_clenser1);

        // Set a listener for date change events
        hijriCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                String date = dayOfMonth + "/" + (month + 1) + "/" + year;
                Toast.makeText(Hijri_clender.this, "Selected date: " + date, Toast.LENGTH_SHORT).show();
            }
        });
    }
}