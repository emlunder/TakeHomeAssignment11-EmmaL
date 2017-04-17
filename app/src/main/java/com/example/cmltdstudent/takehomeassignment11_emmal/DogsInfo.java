package com.example.cmltdstudent.takehomeassignment11_emmal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DogsInfo extends AppCompatActivity {


    TextView displayText;
    TextView nameText;
    TextView lifespanText;
    ImageView image;
    String savedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dogs_info);

        nameText = (TextView) findViewById(R.id.dogs_name);

        lifespanText = (TextView)  findViewById(R.id.dogs_info);

        image = (ImageView) findViewById(R.id.dogs_photo);


        Intent i = getIntent();
        Dogs d = (Dogs) i.getSerializableExtra(Keys.DOGS);

        d.getBreedName().toString();
        d.getLifespan().toString();
        d.getPhotoId();

        displayText = (TextView) findViewById(R.id.display_text);

        savedText = displayText.getText().toString();


        displayText.setText((d.getBreedName().toString() + "\n" + d.getLifespan().toString() + "\n" ));
        image.setImageResource(d.getPhotoId());
    }
}
