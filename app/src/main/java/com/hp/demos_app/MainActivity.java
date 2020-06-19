package com.hp.demos_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.hp.demos_app.MyCardApp.SubmitDetails;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoCounterApp(View view) {
        startActivity(new Intent(getApplicationContext(),ButtonCounter.class));
    }

    public void gotoMyCardApp(View view) {
        startActivity(new Intent(getApplicationContext(), SubmitDetails.class));

    }
}