package com.hp.demos_app;

import android.os.Bundle;
import android.view.View;
import android.widget.QuickContactBadge;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class ButtonCounter extends AppCompatActivity {

    private Toolbar toolbar;
    private TextView textView;
    private TextView countValue;
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_counter);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final int count =0;

        FloatingActionButton fab = findViewById(R.id.fab);

        initView();

        countValue.setText(String.valueOf(count));

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentCount  = Integer.parseInt(countValue.getText().toString());
                countValue.setText(String.valueOf(currentCount + 1));
            }

        });

    }

    private void initView() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        textView = (TextView) findViewById(R.id.textView);
        countValue = (TextView) findViewById(R.id.countValue);
        fab = (FloatingActionButton) findViewById(R.id.fab);
    }
}