package com.example.sura_yaseen.Adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sura_yaseen.Model.Model_bukhari;
import com.example.sura_yaseen.R;

import java.util.List;

public class Adapter_Bukhari extends RecyclerView.Adapter <Adapter_Bukhari.ViewHolder> {


    Context context;

    List<Model_bukhari> hadith_list;

    public Adapter_Bukhari(Context context, List<Model_bukhari> hadith_list) {
        this.context = context;
        this.hadith_list = hadith_list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sahi_bukhari_sample, parent, false);
        return new Adapter_Bukhari.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Model_bukhari modelBukhari =hadith_list.get(position);
        holder.english_hadith.setText(modelBukhari.getEnglish_hadith());
        holder.urdu_hadith.setText(modelBukhari.getUrdu_hadith());
        holder.hadith_num.setText(modelBukhari.getHadith_num());
        holder.img_numbering.setImageResource(modelBukhari.getImg_numbering());

    }

    @Override
    public int getItemCount() {
        return hadith_list.size();
    }

    public  class  ViewHolder extends RecyclerView.ViewHolder{

        ImageView img_numbering;

        TextView english_hadith, hadith_num, urdu_hadith;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            english_hadith=itemView.findViewById(R.id.english_hadith);
            hadith_num=itemView.findViewById(R.id.hadith_numbering);
            urdu_hadith=itemView.findViewById(R.id.urdu_hadith);
            img_numbering=itemView.findViewById(R.id.imageView22);
        }
    }
}
