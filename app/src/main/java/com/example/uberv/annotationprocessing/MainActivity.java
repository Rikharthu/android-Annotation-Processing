package com.example.uberv.annotationprocessing;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.uberv.Navigator;
import com.example.uberv.piri_annotation.NewIntent;

@NewIntent
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Navigator.startMainActivity(this);
    }
}
