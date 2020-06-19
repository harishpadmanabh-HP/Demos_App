package com.hp.demos_app.MyCardApp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.harishpadmanabh.apppreferences.AppPreferences;
import com.hp.demos_app.R;

public class MyCard extends AppCompatActivity {

    private AppPreferences appPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_card);
        appPreferences = AppPreferences.getInstance(this, getResources().getString(R.string.app_name));

        String name =  appPreferences.getData("name");
        String phone = appPreferences.getData("phone");
        String proff = appPreferences.getData("proffession");

        //set data to views


    }
}