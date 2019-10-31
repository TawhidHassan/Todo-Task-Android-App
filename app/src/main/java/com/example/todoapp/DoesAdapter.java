package com.example.todoapp;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DoesAdapter extends RecyclerView.Adapter<DoesAdapter.MyViewHolder>{

    Context context;
    ArrayList<MyDoes> myDoes;

    public DoesAdapter(Context c, ArrayList<MyDoes> p) {
        context = c;
        myDoes = p;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_does,viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder myViewHolder, int i) {
        myViewHolder.titledoes.setText(myDoes.get(i).getTitledoes());
        myViewHolder.descodes.setText(myDoes.get(i).getDescodes());
        myViewHolder.datedoes.setText(myDoes.get(i).getDatedoes());


        final String getTitledoes=myDoes.get(i).getTitledoes();
        final String getDescodes=myDoes.get(i).getDescodes();
        final String getDatedoes=myDoes.get(i).getDatedoes();
        final String getKeydoes=myDoes.get(i).getKeydoes();


        myViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,EditeTaskDesk.class);
                intent.putExtra("titledoes",getTitledoes);
                intent.putExtra("descodes",getDescodes);
                intent.putExtra("datedoes",getDatedoes);
                intent.putExtra("keydoes",getKeydoes);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return myDoes.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView titledoes, descodes, datedoes, keydoes;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            titledoes = (TextView) itemView.findViewById(R.id.titledoes);
            descodes = (TextView) itemView.findViewById(R.id.descodes);
            datedoes = (TextView) itemView.findViewById(R.id.datedoes);
        }
    }

}
