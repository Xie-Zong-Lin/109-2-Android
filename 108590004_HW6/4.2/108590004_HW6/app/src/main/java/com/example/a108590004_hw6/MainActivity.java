package com.example.a108590004_hw6;

import  androidx.appcompat.app.AppCompatActivity;



import android.util.Log;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;




public class MainActivity extends AppCompatActivity {

    private CheckBox checkbox1;
    private CheckBox checkbox2;
    private CheckBox checkbox3;
    private CheckBox checkbox4;
    private CheckBox checkbox5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkbox1 = (CheckBox) findViewById(R.id.checkbox1);
        checkbox2 = (CheckBox) findViewById(R.id.checkbox2);
        checkbox3 = (CheckBox) findViewById(R.id.checkbox3);
        checkbox4 = (CheckBox) findViewById(R.id.checkbox4);
        checkbox5 = (CheckBox) findViewById(R.id.checkbox5);


    }

    public void showToast(View view) {
        String top = "Toppings: ";
        if (checkbox1.isChecked())
            top += checkbox1.getText().toString() + " ";
        if (checkbox2.isChecked())
            top += checkbox2.getText().toString() + " ";
        if (checkbox3.isChecked())
            top += checkbox3.getText().toString() + " ";
        if (checkbox4.isChecked())
            top += checkbox4.getText().toString() + " ";
        if (checkbox5.isChecked())
            top += checkbox5.getText().toString() + " ";

        Toast toast = Toast.makeText(this,top,Toast.LENGTH_SHORT);
        toast.show();
    }


}