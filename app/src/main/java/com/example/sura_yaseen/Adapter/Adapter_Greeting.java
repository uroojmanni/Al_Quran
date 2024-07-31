package com.example.sura_yaseen.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sura_yaseen.Model.Model_greeting;
import com.example.sura_yaseen.R;

import java.util.List;

public class Adapter_Greeting extends RecyclerView.Adapter <Adapter_Greeting.ViewHolder> {

    Context context;

    List<Model_greeting> greetingList;

    public Adapter_Greeting(Context context, List<Model_greeting> greetingList) {
        this.context = context;
        this.greetingList = greetingList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.share_greeting_layout, parent, false);
        return new Adapter_Greeting.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Model_greeting modelGreeting=greetingList.get(position);
        holder.arrow.setText(modelGreeting.getArrow());
        holder.arabic_greeting.setText(modelGreeting.getArabic_greeting());


    }

    @Override
    public int getItemCount() {
        return greetingList.size();
    }

    public  class  ViewHolder extends RecyclerView.ViewHolder{

        TextView  arrow,arabic_greeting;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            arrow=itemView.findViewById(R.id.arrow);
            arabic_greeting=itemView.findViewById(R.id.arabic_greeting);
        }
    }
}
