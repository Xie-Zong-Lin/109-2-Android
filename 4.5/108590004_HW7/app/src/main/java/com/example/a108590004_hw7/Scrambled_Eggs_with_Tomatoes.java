package com.example.a108590004_hw7;

import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.LinkedList;

public class Scrambled_Eggs_with_Tomatoes extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;
    private ImageView image;

    LinkedList<String> egg = new LinkedList<String>( Arrays.asList(
            "Ingredients:",
            "4 eggs",
            "400g tomatoes, sliced",
            "70g onion, sliced",
            "Condiments for eggs:",
            "1/2tsp table salt",
            "some ground pepper powder",
            "1/4tso starch in 1tbsp water",
            "3tbsp tomato ketchup",
            "2tsp sugar",
            " 1tsp starch in 1tbsp water to thicken the sauce",
            "1/2tsp chicken powder",
            "some chopped spring onion",
            "100ml water",
            "1tsp tomato puree",
            " ",
            "Procedure:",
            "1) Crack open the eggs into a bowl and add the condiments for eggs before whisking.  ",
            "2) Heat up the wok, add 1tbsp oil, use medium heat to cook the scrambled egg until 70% cooked, then take out.",
            "3) Heat up the wok, add 2tsp oil, stir fry the onion until golden brown, then add in tomato puree, then tomatoes. Add some sugar, salt, tomato ketchup, water, then place lid on.",
            "4) Cook for a minute then remove the lid and place in the scrambed egg, stir well, then add in the starch water to thicken the sauce, then chicken powder and chopped spring onion, mix well before plating.",
            "5) Finally sprinkle some chopped spring onion onto the dish. Srambled egg with tomatoes is then ready!"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerview);
        mRecyclerView = findViewById(R.id.recyclerview);
        mAdapter = new WordListAdapter(this,egg);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        image = findViewById( R.id.imageView);
        image.setImageResource( R.drawable.egg );
    }
}