package com.example.cmltdstudent.takehomeassignment11_emmal;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by cmltdstudent on 4/17/17.
 */

public class DogsAdapter extends RecyclerView.Adapter<DogsViewHolder>{

    private List<Dogs> dogs;
    private Context context;

    public DogsAdapter(List<Dogs> dogs, Context context) {
        this.dogs = dogs;
        this.context = context;
    }

    public DogsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //how do we create it - with a card view
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_dogs, parent, false);
        return new DogsViewHolder(view, context);
    }

    public void onBindViewHolder(DogsViewHolder holder, int position) {
        Dogs m = dogs.get(position);
        holder.bind(m);
    }

    public int getItemCount() {
        return dogs.size();
    }
}
