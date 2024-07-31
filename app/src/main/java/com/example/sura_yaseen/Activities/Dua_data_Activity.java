package com.example.sura_yaseen.Activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sura_yaseen.Adapter.Adapter_dua_Activites;
import com.example.sura_yaseen.Database_Repository.Quran_data_repository;
import com.example.sura_yaseen.Model.Model_surah;
import com.example.sura_yaseen.R;

import java.util.ArrayList;
import java.util.List;

public class Dua_data_Activity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Model_surah> list = new ArrayList<>();
    Adapter_dua_Activites adapterDuaActivites;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua_data);

        // Initialize RecyclerView
        recyclerView = findViewById(R.id.dua_data_recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Get the intent extra
        String value = getIntent().getStringExtra("key");

        // Initialize adapter with the current list
        adapterDuaActivites = new Adapter_dua_Activites(this, list);

        // Update the list based on the intent extra
        if ("Morning and Evening".equals(value)) {
            list.addAll(Quran_data_repository.morningevening());
        } else if ("Rest Room".equals(value)) {
            list.addAll(Quran_data_repository.restrom());
        } else if ("Salah".equals(value)) {
            list.addAll(Quran_data_repository.salah());
        } else if ("Family".equals(value)) {
            list.addAll(Quran_data_repository.family());
        } else if ("Home".equals(value)) {
            list.addAll(Quran_data_repository.home());
        } else if ("Travlling".equals(value)) {
            list.addAll(Quran_data_repository.travling());
        }
        else if ("Protection".equals(value)) {
            list.addAll(Quran_data_repository.protection());
        } else if ("Forgiveness".equals(value)) {
            list.addAll(Quran_data_repository.forgivness());
        } else if ("Eat/Drink".equals(value)) {
            list.addAll(Quran_data_repository.eatanddrink());
        } else if ("Dressing".equals(value)) {
            list.addAll(Quran_data_repository.dressing());
        } else if ("Blessing".equals(value)) {
            list.addAll(Quran_data_repository.blessing());
        }
        else if ("Funeral".equals(value)) {
            list.addAll(Quran_data_repository.funeral());
        }else if ("Animals".equals(value)) {
            list.addAll(Quran_data_repository.animals());
        }else if ("Hajj/Umrah".equals(value)) {
            list.addAll(Quran_data_repository.hajj());
        }
        else if ("Random Dua".equals(value)) {
            list.addAll(Quran_data_repository.randam_dua());
        }else if ("Rabbannas".equals(value)) {
            list.addAll(Quran_data_repository.rabanass());
        }

        else {
           // list.addAll(Quran_data_repository.defaultData());
        }

        // Notify the adapter of the data change
        adapterDuaActivites.notifyDataSetChanged();

        // Set the adapter to the RecyclerView
        recyclerView.setAdapter(adapterDuaActivites);
    }
}
