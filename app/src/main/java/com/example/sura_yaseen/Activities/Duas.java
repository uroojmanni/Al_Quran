package com.example.sura_yaseen.Activities;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sura_yaseen.Adapter.Adapter_Dua;
import com.example.sura_yaseen.Adapter.Adapter_Surah;
import com.example.sura_yaseen.Model.Model_surah;
import com.example.sura_yaseen.R;

import java.util.ArrayList;
import java.util.List;

public class Duas extends AppCompatActivity {

    RecyclerView recyclerView;

    // List<Model_surah> list;
    List<Model_surah> list = new ArrayList<>();

    Adapter_Dua adapterDua;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duas);

        recyclerView=findViewById(R.id.dua_recycle);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        list.add(new Model_surah(R.drawable.quran, "Morning and Evening"));
        list.add(new Model_surah(R.drawable.quran, "Rest Room"));
        list.add(new Model_surah(R.drawable.quran, "Salah"));
        list.add(new Model_surah(R.drawable.quran, "Family"));
        list.add(new Model_surah(R.drawable.quran, "Home"));
        list.add(new Model_surah(R.drawable.quran, "Travlling"));
        list.add(new Model_surah(R.drawable.quran, "Protection"));
        list.add(new Model_surah(R.drawable.quran, "Forgiveness"));
        list.add(new Model_surah(R.drawable.quran, "Eat/Drink"));
        list.add(new Model_surah(R.drawable.quran, "Dressing"));
        list.add(new Model_surah(R.drawable.quran, "Blessing"));
        list.add(new Model_surah(R.drawable.quran, "Funeral"));
        list.add(new Model_surah(R.drawable.quran, "Animals"));
        list.add(new Model_surah(R.drawable.quran, "Hajj/Umrah"));
        list.add(new Model_surah(R.drawable.quran, "Random Dua"));
        list.add(new Model_surah(R.drawable.quran, "Rabbannas"));


        adapterDua = new Adapter_Dua(this, list);
        recyclerView.setAdapter(adapterDua);


    }
}