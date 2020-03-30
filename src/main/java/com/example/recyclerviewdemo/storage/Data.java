package com.example.recyclerviewdemo.storage;

import com.example.recyclerviewdemo.model.Note;
import com.example.recyclerviewdemo.R;

import java.util.ArrayList;

public class Data {
    public static ArrayList<Note> notelist;
    static {
        notelist = new ArrayList<>();
        notelist.add(new Note("Wallpaper 1", R.drawable.image1));
        notelist.add(new Note("Wallpaper 2", R.drawable.image2));
        notelist.add(new Note("Wallpaper 3", R.drawable.image3));
        notelist.add(new Note("Wallpaper 4", R.drawable.image4));
        notelist.add(new Note("Wallpaper 5", R.drawable.image5));



    }
    public static int getLength(){
        return notelist.size();
    }

    public static Note getData(int index){
        return notelist.get(index);
    }
}
