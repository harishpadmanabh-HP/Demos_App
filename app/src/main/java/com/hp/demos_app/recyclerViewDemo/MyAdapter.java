package com.hp.demos_app.recyclerViewDemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hp.demos_app.R;

import java.util.ArrayList;


public class MyAdapter  extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    ArrayList<String> meetings,hosts;



    public MyAdapter(Context context, ArrayList<String> meetings, ArrayList<String> hosts) {
        this.context = context;
        this.meetings = meetings;
        this.hosts = hosts;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        holder.meeting.setText(meetings.get(position));
        holder.host.setText(hosts.get(position));

        

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context, meetings.get(position)+" is hosted by "+hosts.get(position) , Toast.LENGTH_SHORT).show();
         
            }
        });


    }

    @Override
    public int getItemCount() {
        return meetings.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView meeting,host;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            meeting = itemView.findViewById(R.id.meeting);
            host = itemView.findViewById(R.id.host);

        }
    }
}
