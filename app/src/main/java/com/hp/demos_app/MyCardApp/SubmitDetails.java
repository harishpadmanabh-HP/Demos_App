package com.hp.demos_app.MyCardApp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.harishpadmanabh.apppreferences.AppPreferences;
import com.hp.demos_app.R;

public class SubmitDetails extends AppCompatActivity {

    private AppPreferences appPreferences;
    private EditText name;
    private EditText phone;
    private EditText proffession;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_details);
        appPreferences = AppPreferences.getInstance(this, getResources().getString(R.string.app_name));

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nameInput = name.getText().toString();
                String phoneInput = phone.getText().toString();
                String proffesioninput = proffession.getText().toString();

                storeDetails(nameInput,phoneInput,proffesioninput);

            }
        });


        initView();
    }

    private void storeDetails(String nameInput, String phoneInput, String proffesioninput) {

        appPreferences.saveData("name",nameInput);
        appPreferences.saveData("phone",phoneInput);
        appPreferences.saveData("proffession",proffesioninput);

        startActivity(new Intent(getApplicationContext(),MyCard.class));



    }

    private void initView() {
        name = (EditText) findViewById(R.id.name);
        phone = (EditText) findViewById(R.id.phone);
        proffession = (EditText) findViewById(R.id.proffession);
        submit = (Button) findViewById(R.id.submit);
    }
}