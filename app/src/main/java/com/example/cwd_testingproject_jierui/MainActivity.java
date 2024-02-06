package com.example.cwd_testingproject_jierui;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity{  //Inhertiance

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //methods
        


        Toast.makeText(this,"Potatoe", Toast.LENGTH_SHORT).show();

    }



}