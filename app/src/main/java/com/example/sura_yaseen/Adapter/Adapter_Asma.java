package com.example.sura_yaseen.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sura_yaseen.Model.Asma_model;
import com.example.sura_yaseen.Model.Model_surah;
import com.example.sura_yaseen.R;

import java.util.List;

public class Adapter_Asma extends RecyclerView.Adapter <Adapter_Asma.ViewHolder> {

    Context context;

    List<Asma_model> list2;

    public Adapter_Asma(Context context, List<Asma_model> list2) {
        this.context = context;
        this.list2 = list2;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.asma_ul_husna_layout, parent, false);
        return new Adapter_Asma.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Asma_model asmaModel = list2.get(position);
        holder.arabic.setText(asmaModel.getArabic());
        holder.romen.setText(asmaModel.getRomen());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }

    @Override
    public int getItemCount() {
        return list2.size();
    }

    public  class  ViewHolder extends RecyclerView.ViewHolder{
        TextView arabic,romen;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            arabic=itemView.findViewById(R.id.arabic);
            romen=itemView.findViewById(R.id.romen);
            cardView=itemView.findViewById(R.id.cardview_lay);
        }
    }
}
