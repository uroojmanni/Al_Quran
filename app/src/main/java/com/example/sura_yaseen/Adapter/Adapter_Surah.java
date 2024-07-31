package com.example.sura_yaseen.Adapter;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sura_yaseen.Activities.Ayat_ul_kursi;
import com.example.sura_yaseen.Activities.Duas;
import com.example.sura_yaseen.Activities.Hajj;
import com.example.sura_yaseen.Activities.Hijri_clender;
import com.example.sura_yaseen.Activities.Name_of_Allah;
import com.example.sura_yaseen.Activities.Ramdan_timing;
import com.example.sura_yaseen.Activities.Sahib_bukhari;
import com.example.sura_yaseen.Activities.Share_greetings;
import com.example.sura_yaseen.Activities.notification;
import com.example.sura_yaseen.Model.Model_surah;
import com.example.sura_yaseen.R;

import java.util.List;

public class Adapter_Surah extends RecyclerView.Adapter <Adapter_Surah.ViewHolder> {

    Context context;

    List<Model_surah> list;

    public Adapter_Surah(Context context, List<Model_surah> list) {

        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null in Adapter_Surah");
        }
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.islamic_sample, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        Model_surah model = list.get(position);
        holder.textView.setText(model.getText1()); // Assuming there's a getText() method in Thinking_model
        holder.imageView.setImageResource(model.getImg());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0) {
                    Intent intent= new Intent(context, Ayat_ul_kursi.class);
                    context.startActivity(intent);
                    // Action for position 0
                    // e.g., open detail activity, show a toast, etc.
                } else if (position == 1) {
                    Intent intent= new Intent(context, Duas.class);
                    context.startActivity(intent);
                    // Action for position 1
                }
                else if (position == 2) {
                    Intent intent= new Intent(context, Hajj.class);
                    context.startActivity(intent);
                    // Action for position 1
                }else if (position == 3) {
                    Intent intent= new Intent(context, Hijri_clender.class);
                    context.startActivity(intent);
                    // Action for position 1
                }else if (position == 4) {
                    Intent intent= new Intent(context, Name_of_Allah.class);
                    context.startActivity(intent);
                    // Action for position 1
                }else if (position == 5) {
                    Intent intent= new Intent(context, Ramdan_timing.class);
                    context.startActivity(intent);
                    // Action for position 1
                }else if (position == 6) {
                    Intent intent= new Intent(context, Sahib_bukhari.class);
                    context.startActivity(intent);
                    // Action for position 1
                }else if (position == 7) {
                    Intent intent= new Intent(context, Share_greetings.class);
                    context.startActivity(intent);
                    // Action for position 1
                }
                else if (position == 8) {
                    Intent intent= new Intent(context, notification.class);
                    context.startActivity(intent);
                    // Action for position 1
                }

                else {
                    // Default action for other positions
                }
            }
        });


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView;

        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.imageView22);
            textView=itemView.findViewById(R.id.sample_text);
            cardView=itemView.findViewById(R.id.samplecard);


        }
    }
}