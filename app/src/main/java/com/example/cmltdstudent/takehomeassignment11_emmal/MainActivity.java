package com.example.cmltdstudent.takehomeassignment11_emmal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Dogs> dogs;
    private DogsAdapter dogsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialData();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        dogsAdapter = new DogsAdapter(dogs, this);
        recyclerView.setAdapter(dogsAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.menu_item_save:
                Toast.makeText(this, "Save Clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_item_settings:
                Toast.makeText(this, "Setting Clicked", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
    public void addRandomDogs(View view) {
        dogs.add(getRandomDogs());
        dogsAdapter.notifyDataSetChanged();
    }

    private void initialData() {
        dogs = new ArrayList<>();
        dogs.add(new Dogs("Papillon", "About 14-16 years", R.drawable.papillon));
        dogs.add(new Dogs("Corgi", "About 12-14 years", R.drawable.corgi));
        dogs.add(new Dogs("Goldendoodle", "About 10-15 years", R.drawable.goldendoodle));
    }

    private Dogs getRandomDogs() {
        //Xi gave the numbers to random of his initial items so when random goes, the number
        //selected will assign that item
        int num = (int) (Math.random() * 3);
        if (num == 0)
            return new Dogs("Papillon", "About 14-16 years", R.drawable.papillon);
        else if (num == 1)
            return new Dogs("Corgi", "About 12-14 years", R.drawable.corgi);
        else
            return new Dogs("Goldendoodle", "About 10-15 years", R.drawable.goldendoodle);
    }

}

