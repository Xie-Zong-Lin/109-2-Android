package com.example.a108590004_hw7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void DongPo_Pork(View view){
        Intent intent = new Intent(this, DongPo_Pork.class);
        startActivity( intent );
    }

    public void Scrambled_Eggs_with_Tomatoes(View view){
        Intent intent = new Intent(this, Scrambled_Eggs_with_Tomatoes.class);
        startActivity( intent );
    }

}