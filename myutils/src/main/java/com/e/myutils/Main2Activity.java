package com.e.myutils;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.daasuu.bl.BubbleLayout;

public class Main2Activity extends AppCompatActivity {
public static BubbleLayout  bib;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bib=findViewById(R.id.bib);

    }
}
