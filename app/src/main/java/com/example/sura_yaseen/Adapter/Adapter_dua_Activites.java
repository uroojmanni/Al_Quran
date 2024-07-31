package com.example.sura_yaseen.Adapter;

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

import com.example.sura_yaseen.Activities.All_prayers_activity;
import com.example.sura_yaseen.Activities.Dua_data_Activity;
import com.example.sura_yaseen.Model.Model_surah;
import com.example.sura_yaseen.R;

import java.util.List;

public class Adapter_dua_Activites extends RecyclerView.Adapter <Adapter_dua_Activites.ViewHolder>{


    Context context;

    List<Model_surah> list;

    public Adapter_dua_Activites(Context context, List<Model_surah> list) {

        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null in Adapter_Surah");
        }
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.islamic_dua, parent, false);
        return new Adapter_dua_Activites.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Model_surah model = list.get(position);

        holder.textView.setText(model.getText1()); // Assuming there's a getText() method in Thinking_model
        holder.imageView.setImageResource(model.getImg());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(context, All_prayers_activity.class);
                intent.putExtra("key",model.getText1());
                context.startActivity(intent);



            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

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
