package com.example.sura_yaseen.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sura_yaseen.Model.Model_surah;
import com.example.sura_yaseen.Model.Ramadan_timing_model;
import com.example.sura_yaseen.R;

import java.util.List;

public class Adapter_Ramdan extends RecyclerView.Adapter <Adapter_Ramdan.ViewHolder> {


    Context context;

    List<Ramadan_timing_model> list_ramadan;

    public Adapter_Ramdan(Context context, List<Ramadan_timing_model> list_ramadan) {
        this.context = context;
        this.list_ramadan = list_ramadan;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.ramadan_timing_sample, parent, false);
        return new Adapter_Ramdan.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Ramadan_timing_model ramadanTimingModel = list_ramadan.get(position);
        holder.day.setText(ramadanTimingModel.getDay());
        holder.date.setText(ramadanTimingModel.getDate());
        holder.hijrii.setText(ramadanTimingModel.getHijrii());
        holder.sehr.setText(ramadanTimingModel.getSehr());
        holder.aftar.setText(ramadanTimingModel.getAftar());

    }

    @Override
    public int getItemCount() {
        return list_ramadan.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView day,date,hijrii,sehr,aftar;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            day=itemView.findViewById(R.id.day);
            date=itemView.findViewById(R.id.date);
            hijrii=itemView.findViewById(R.id.hijrii);
            sehr=itemView.findViewById(R.id.sehar);
            aftar=itemView.findViewById(R.id.aftar);
        }
    }
}
