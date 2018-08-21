package com.e.myutils;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class imagecls extends AppCompatActivity {
ImageView im;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagecls);
        im=findViewById(R.id.im);
        Glide.with(this).load(R.drawable.nn).into(im);
    }
}
