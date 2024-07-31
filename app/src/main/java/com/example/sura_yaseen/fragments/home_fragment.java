package com.example.sura_yaseen.fragments;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sura_yaseen.Activities.Blessings;
import com.example.sura_yaseen.Activities.Sahib_bukhari;
import com.example.sura_yaseen.Activities.Surah_Kahif;
import com.example.sura_yaseen.Activities.Surah_Mulk;
import com.example.sura_yaseen.Activities.Surah_Rahman;
import com.example.sura_yaseen.Activities.Surah_Waqiah;
import com.example.sura_yaseen.Activities.Surah_yaseen;
import com.example.sura_yaseen.R;

public class home_fragment extends Fragment {


    CardView yaseen, rahman, mulk, kahif, waqiah, blessing;

    Button show_all_hadith_button, share_hadith;

    private ImageView imageView;



    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public home_fragment() {
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
        View view = inflater.inflate(R.layout.fragment_home_fragment, container, false);
        // Initialize the TextViews
        yaseen = view.findViewById(R.id.yaseen_card);
        rahman = view.findViewById(R.id.rahman_card);
        mulk = view.findViewById(R.id.mulk_card);
        kahif = view.findViewById(R.id.khaf_card);
        waqiah = view.findViewById(R.id.waqia_card);
        blessing = view.findViewById(R.id.blessing_card);
        show_all_hadith_button=view.findViewById(R.id.show_all_hadith);
        share_hadith=view.findViewById(R.id.share_hadith);

        imageView=view.findViewById(R.id.more_rating1);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showRatePopup();
            }
        });


        // Set click listeners for each TextView
        yaseen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Surah_yaseen.class);
                startActivity(intent);
                // Handle click event for yaseen
                //Toast.makeText(getActivity(), "Surah Yaseen clicked", Toast.LENGTH_SHORT).show();
            }
        });

        rahman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Surah_Rahman.class);
                startActivity(intent);
                // Handle click event for rahman
               // Toast.makeText(getActivity(), "Surah Rahman clicked", Toast.LENGTH_SHORT).show();
            }
        });

        mulk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Surah_Mulk.class);
                startActivity(intent);
                // Handle click event for mulk
                //Toast.makeText(getActivity(), "Surah Mulk clicked", Toast.LENGTH_SHORT).show();
            }
        });

        kahif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Surah_Kahif.class);
                startActivity(intent);
                // Handle click event for kahif
                //Toast.makeText(getActivity(), "Surah Kahif clicked", Toast.LENGTH_SHORT).show();
            }
        });

        waqiah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Surah_Waqiah.class);
                startActivity(intent);
                // Handle click event for waqiah
               // Toast.makeText(getActivity(), "Surah Waqiah clicked", Toast.LENGTH_SHORT).show();
            }
        });

        blessing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Blessings.class);
                startActivity(intent);
                // Handle click event for blessing
               // Toast.makeText(getActivity(), "Blessings clicked", Toast.LENGTH_SHORT).show();
            }
        });

        show_all_hadith_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Sahib_bukhari.class);
                startActivity(intent);


            }
        });

        share_hadith.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hadithText = "This is the hadith text to share.";
                shareText(hadithText);

            }
        });

        return view;

    }

      //Rating
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
//rating end


    private void shareText(String text) {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, text);
        sendIntent.setType("text/plain");

        Intent shareIntent = Intent.createChooser(sendIntent, null);
        startActivity(shareIntent);
    }
}