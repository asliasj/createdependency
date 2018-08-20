package com.createdependency;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.e.myutils.Main2Activity;
import com.e.myutils.mymath;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int a=mymath.plus(20,30);
        Toast.makeText(this, ""+a, Toast.LENGTH_SHORT).show();

        Intent i = new Intent(this , Main2Activity.class);
        startActivity(i);
    }
}
