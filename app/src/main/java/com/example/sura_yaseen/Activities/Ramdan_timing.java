package com.example.sura_yaseen.Activities;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sura_yaseen.Adapter.Adapter_Quran;
import com.example.sura_yaseen.Adapter.Adapter_Ramdan;
import com.example.sura_yaseen.Adapter.Adapter_Surah;
import com.example.sura_yaseen.Model.Model_surah;
import com.example.sura_yaseen.Model.Ramadan_timing_model;
import com.example.sura_yaseen.R;

import java.util.ArrayList;
import java.util.List;

public class Ramdan_timing extends AppCompatActivity {
    RecyclerView recyclerView;

    List<Ramadan_timing_model> list_ramadan = new ArrayList<>();

    Adapter_Ramdan adapterRamdan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ramdan_timing);

        recyclerView=findViewById(R.id.recycle_ramadan);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        list_ramadan = new ArrayList<>();
        list_ramadan.add(new Ramadan_timing_model("Mon","01 May","01/05/24","_____","____"));
        list_ramadan.add(new Ramadan_timing_model("Mon","01 May","01/05/24","_____","____"));
        list_ramadan.add(new Ramadan_timing_model("Mon","01 May","01/05/24","_____","____"));
        list_ramadan.add(new Ramadan_timing_model("Mon","01 May","01/05/24","_____","____"));
        list_ramadan.add(new Ramadan_timing_model("Mon","01 May","01/05/24","_____","____"));
        list_ramadan.add(new Ramadan_timing_model("Mon","01 May","01/05/24","_____","____"));
        list_ramadan.add(new Ramadan_timing_model("Mon","01 May","01/05/24","_____","____"));
        list_ramadan.add(new Ramadan_timing_model("Mon","01 May","01/05/24","_____","____"));
        list_ramadan.add(new Ramadan_timing_model("Mon","01 May","01/05/24","_____","____"));
        list_ramadan.add(new Ramadan_timing_model("Mon","01 May","01/05/24","_____","____"));


        adapterRamdan = new Adapter_Ramdan(this, list_ramadan);
        recyclerView.setAdapter(adapterRamdan);





    }
}