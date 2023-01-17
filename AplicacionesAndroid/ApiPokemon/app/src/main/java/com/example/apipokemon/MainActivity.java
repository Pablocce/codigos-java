package com.example.apipokemon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;



public class MainActivity extends AppCompatActivity {

    //debemos incluir en build.gradle en dependencias --> compile 'com.squareup.retrofit2:retrofit:2.1.0' y compile 'com.squareup.retrofit2:converter-gson:2.1.0'
    Retrofit retrofit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}