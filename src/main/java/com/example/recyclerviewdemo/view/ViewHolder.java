package com.example.recyclerviewdemo.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewdemo.storage.Data;
import com.example.recyclerviewdemo.R;


public class ViewHolder extends RecyclerView.ViewHolder {
    public TextView textView;
    public ImageView imageView;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        LinearLayout linearLayout = (LinearLayout)itemView;
        textView = linearLayout.findViewById(R.id.textView1);
        imageView = linearLayout.findViewById(R.id.imageView1);
    }
    public void setData(int position){
        textView.setText(Data.getData(position).headline);
        imageView.setImageResource(Data.getData(position).image);
    }
}
