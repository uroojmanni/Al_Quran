package com.example.sura_yaseen.Activities;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sura_yaseen.Adapter.Adapter_Bukhari;
import com.example.sura_yaseen.Adapter.Adapter_Quran;
import com.example.sura_yaseen.Database_Repository.Quran_data_repository;
import com.example.sura_yaseen.Model.Model_Quran;
import com.example.sura_yaseen.Model.Model_bukhari;
import com.example.sura_yaseen.R;

import java.util.ArrayList;
import java.util.List;

public class Sahib_bukhari extends AppCompatActivity {

    RecyclerView recyclerView;

    Adapter_Bukhari adapterBukhari;
    private List<Model_bukhari> hadith_list = new ArrayList<>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sahib_bukhari);

        recyclerView=findViewById(R.id.recycle_sahi_bukhari);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //data  get from data repositoty

        ArrayList hadith_list =new ArrayList();
        hadith_list= Quran_data_repository.sahi_bukhari();

        //get data

        adapterBukhari = new Adapter_Bukhari(this,hadith_list );
        recyclerView.setAdapter(adapterBukhari);
    }
}