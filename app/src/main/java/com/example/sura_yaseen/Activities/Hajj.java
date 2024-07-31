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

import com.example.sura_yaseen.Adapter.Adapter_Greeting;
import com.example.sura_yaseen.Database_Repository.Quran_data_repository;
import com.example.sura_yaseen.Model.Model_greeting;
import com.example.sura_yaseen.R;

import java.util.ArrayList;
import java.util.List;

public class Hajj extends AppCompatActivity {


    private RecyclerView recyclerView;

    private Adapter_Greeting adapterGreeting;

    private List<Model_greeting> greetingList= new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hajj);

        recyclerView=findViewById(R.id.hajj_umra_recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //get data from repository

        ArrayList greetingList =new ArrayList();
        greetingList= Quran_data_repository.hajj_greeting();


        adapterGreeting = new Adapter_Greeting(this, greetingList);
        recyclerView.setAdapter(adapterGreeting);
    }
}