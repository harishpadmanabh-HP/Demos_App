package com.hp.demos_app.recyclerViewDemo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hp.demos_app.R;

import java.util.ArrayList;

public class RecyclerViewDemo extends AppCompatActivity {

    ArrayList<String> meetings, hosts;
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_demo);
        initView();

        meetings.add("Meeting 1");
        meetings.add("Meeting 2");
        meetings.add("Meeting 3");

        hosts.add("Anju");
        hosts.add("jincy");
        hosts.add("harish");

        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(new MyAdapter(this,meetings,hosts));






    }

    private void initView() {
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        meetings=new ArrayList<String>();
        hosts=new ArrayList<>();
    }
}