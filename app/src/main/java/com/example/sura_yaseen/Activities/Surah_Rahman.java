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
import com.example.sura_yaseen.Model.Model_Quran;
import com.example.sura_yaseen.R;

import java.util.ArrayList;
import java.util.List;

public class Surah_Rahman extends AppCompatActivity {

    private RecyclerView recyclerView;

    private Adapter_Quran adapterQuran;

    private List<Model_Quran> list1 = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah_rahman);

        recyclerView= findViewById(R.id.rahman_recycle2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        list1 = new ArrayList<>();



        adapterQuran = new Adapter_Quran(this, list1);
        recyclerView.setAdapter(adapterQuran);

    }
}