package com.example.sura_yaseen.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sura_yaseen.Model.Model_Quran;
import com.example.sura_yaseen.R;

import java.io.IOException;
import java.util.List;


public class Adapter_Quran extends RecyclerView.Adapter<Adapter_Quran.ViewHolder> {
    private Context context;
    private List<Model_Quran> list1;
    private MediaPlayer mediaPlayer;
    private int selectedItem = -1;

    private int playingPosition = -1;


    public Adapter_Quran(Context context, List<Model_Quran> list1) {
        this.context = context;
        this.list1 = list1;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.quran_surah_sample, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        Model_Quran model = list1.get(position);
        holder.textView2.setText(model.getText2());
        holder.textView3.setText(model.getText3());
        holder.textView4.setText(model.getText4());
        holder.imageView1.setImageResource(model.getImg1());

        if (position == playingPosition) {
            // Apply highlighting to the view (e.g., change background color)
            holder.itemView.setBackgroundColor(context.getResources().getColor(R.color.white));
        } else {
            // Reset highlighting for other items
            holder.itemView.setBackgroundColor(Color.TRANSPARENT); // Reset to default color
        }
        // Highlight the text if it's the selected item
        boolean isPlaying = position == playingPosition;
        holder.textView2.setTextColor(selectedItem == position ? Color.RED : Color.BLACK);
        holder.textView3.setTextColor(selectedItem == position ? Color.RED : Color.BLACK);
        holder.textView4.setTextColor(selectedItem == position ? Color.RED : Color.BLACK);


        // Set click listener for the item
        holder.itemView.setOnClickListener(v -> {
            if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
                mediaPlayer.release();
                mediaPlayer = null;
                notifyItemChanged(playingPosition);
                playingPosition = -1;
            } else {
                playingPosition = position;
                notifyDataSetChanged();
                mediaPlayer = MediaPlayer.create(context, model.getAudioResId());
                mediaPlayer.setOnCompletionListener(mp -> {
                    mediaPlayer.release();
                    mediaPlayer = null;
                    playingPosition = -1;
                    notifyDataSetChanged();
                });
                mediaPlayer.start();
            }
        });

    }

    @Override
    public int getItemCount() {
        return list1.size();
    }

    public void setPlayingPosition(int position) {
        playingPosition = position;
        notifyDataSetChanged();
    }



    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView1;
        TextView textView2, textView3, textView4;

        //ImageButton playButton;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView1 = itemView.findViewById(R.id.img_quran);
            textView2 = itemView.findViewById(R.id.text2);
            textView3 = itemView.findViewById(R.id.text3);
            textView4 = itemView.findViewById(R.id.text4);
        }


    }
    private void playAudio(int audioResId) {
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        mediaPlayer = MediaPlayer.create(context, audioResId);
        mediaPlayer.setOnCompletionListener(mp -> {
            mediaPlayer.release();
            mediaPlayer = null;
        });
        mediaPlayer.start();
    }
}
