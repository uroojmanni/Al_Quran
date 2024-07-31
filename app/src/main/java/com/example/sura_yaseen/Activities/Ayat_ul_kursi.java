package com.example.sura_yaseen.Activities;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sura_yaseen.Adapter.Adapter_Quran;
import com.example.sura_yaseen.Database_Repository.Quran_data_repository;
import com.example.sura_yaseen.Model.Model_Quran;
import com.example.sura_yaseen.R;

import java.util.ArrayList;
import java.util.List;

public class Ayat_ul_kursi extends AppCompatActivity {

    private RecyclerView recyclerView;

    private Adapter_Quran adapterQuran;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayat_ul_kursi);

        recyclerView = findViewById(R.id.ayat_ul_kursi_recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
// Example list initialization

// Adding Ayatul Kursi in pieces

        //data from repository
        ArrayList list2 =new ArrayList();
        list2= Quran_data_repository.ayat_ul_kursi_dat();
        //get data


        adapterQuran = new Adapter_Quran(this, list2);
        recyclerView.setAdapter(adapterQuran);
    }}