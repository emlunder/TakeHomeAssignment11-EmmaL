package com.example.cmltdstudent.takehomeassignment11_emmal;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by cmltdstudent on 4/17/17.
 */

public class DogsViewHolder extends RecyclerView.ViewHolder{

    private CardView cardView;
    private TextView dogNameView;
    private TextView dogInfoView;
    private ImageView dogPhotoView;
    private Context context;

    public DogsViewHolder(View itemView, Context context) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        dogNameView = (TextView) itemView.findViewById(R.id.dogs_name);
        dogInfoView = (TextView) itemView.findViewById(R.id.dogs_info);
        dogPhotoView = (ImageView) itemView.findViewById(R.id.dogs_photo);
        this.context = context;
    }

    public void bind(final Dogs dogs) {
        dogNameView.setText(dogs.breedName);
        dogInfoView.setText(dogs.lifespan);
        dogPhotoView.setImageResource(dogs.photoId);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //When you click on the card view the name will come up
                Intent i = new Intent(context, DogsInfo.class);
                i.putExtra(Keys.DOGS, dogs);
                context.startActivity(i);
                Toast.makeText(context, dogNameView.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
