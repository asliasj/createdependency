package com.createdependency;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.e.myutils.mymath;

import static com.createdependency.Main2Activity.bib;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int a=mymath.plus(20,30);
        Toast.makeText(this, ""+a, Toast.LENGTH_SHORT).show();

    }
}
