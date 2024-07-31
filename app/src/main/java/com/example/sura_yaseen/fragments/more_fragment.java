package com.example.sura_yaseen.fragments;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Toast;

import com.example.sura_yaseen.Adapter.Adapter_Surah;
import com.example.sura_yaseen.Model.Model_surah;
import com.example.sura_yaseen.R;

import java.util.ArrayList;
import java.util.List;


public class more_fragment extends Fragment {


    RecyclerView recyclerView;

   // List<Model_surah> list;
    List<Model_surah> list = new ArrayList<>();

    Adapter_Surah adapterSurah;

    private ImageView imageView;



    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    private String mParam1;
    private String mParam2;

    public more_fragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_more_fragment, container, false);

        recyclerView = view.findViewById(R.id.sura_recycle);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));


        imageView=view.findViewById(R.id.more_rating);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showRatePopup();
            }
        });


        // Add sample data to the list
        list.add(new Model_surah(R.drawable.quran, "Ayat ul Kursi"));
        list.add(new Model_surah(R.drawable.quran, "Duas"));
        list.add(new Model_surah(R.drawable.quran, "Hajj/Umarah"));
        list.add(new Model_surah(R.drawable.quran, "Hijri Calender"));
        list.add(new Model_surah(R.drawable.quran, "Names of Allah"));

        list.add(new Model_surah(R.drawable.quran, "Ramadan Timing"));
        list.add(new Model_surah(R.drawable.quran, "Sahib Bukhari"));
        list.add(new Model_surah(R.drawable.quran, "Share Greetings"));
        list.add(new Model_surah(R.drawable.quran, "Notification"));


        return view;
    }

    private void showRatePopup() {
        final Dialog dialog = new Dialog(requireContext());
        dialog.setContentView(R.layout.rate_popup);

        final RatingBar ratingBar = dialog.findViewById(R.id.ratingBar);
        Button submitButton = dialog.findViewById(R.id.submit_button);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float rating = ratingBar.getRating();
                Toast.makeText(getContext(), "You rated: " + rating, Toast.LENGTH_SHORT).show();
                dialog.dismiss(); // Close the dialog
            }
        });

        dialog.show();
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // Initialize the adapter only if the context is not null and the fragment is attached
        if (requireContext() != null && isAdded()) {
            adapterSurah = new Adapter_Surah(requireContext(), list);
            recyclerView.setAdapter(adapterSurah);
        } else {
            Log.e("more_fragment", "Context is null or the fragment is not attached");
        }
    }}

