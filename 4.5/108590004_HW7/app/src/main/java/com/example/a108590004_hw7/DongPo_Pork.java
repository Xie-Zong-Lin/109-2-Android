package com.example.a108590004_hw7;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.LinkedList;

public class DongPo_Pork extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;
    private ImageView image;
    LinkedList<String> DongPo_Pork = new LinkedList<String>( Arrays.asList(
            "Ingredients:",
            "1 slab (about 1 kg) pork belly",
            "5 stalks spring onion – halved",
            "25 g ginger – sliced",
            "2 cups (500 ml) Shaoxing wine",
            "1/4 cup light soy sauce",
            "60 g rock sugar",
            "1 1/2 cup water / Prep time: 15 mins ",
            "Cook time: 2 1/2 hr ",
            "Yield: serves 4-6",
            " ",
            "Procedure:",
            "1) Blanch pork belly. [Place pork into a pot, add enough water to cover. Bring to boil. Once water comes to a boil, remove from heat, drain and wash.] ",
            "2) Place ginger and spring onion in the bottom of a pot.",
            "3) Place pork, skin side down on top of the bed of ginger and spring onion.",
            "4) Add in all the other ingredients.",
            "5) Bring to boil then lower heat to simmer for 2 hrs (or until tender), covered. Turn the meat around half way through.",
            "6) Remove from braising liquid and steam on high heat (skin side up) for a further 15 mins. I used the braising liquid instead of water for steaming. [I removed the meat from the bones as the whole piece was quite thick and I couldn’t close the lid.]",
            "7) Serve with braising liquid. You could reduce the liquid until thickened, but I thought the sauce was quite salty, so I thickened the suace with cornstarch slurry (cornstarch + water) instead."));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.recyclerview );
        mRecyclerView = findViewById(R.id.recyclerview);
        mAdapter = new WordListAdapter(this,DongPo_Pork );
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        image = findViewById( R.id.imageView);
        image.setImageResource( R.drawable.pork );
    }
}