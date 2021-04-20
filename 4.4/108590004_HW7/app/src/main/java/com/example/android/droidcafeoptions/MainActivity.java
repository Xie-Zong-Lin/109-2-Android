

package com.example.android.droidcafeoptions;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.media.Image;
import android.widget.ImageView;


import static android.provider.AlarmClock.EXTRA_MESSAGE;


public class MainActivity extends AppCompatActivity {


    public static final String EXTRA_MESSAGE =
            "com.example.android.droidcafeoptions.extra.MESSAGE";


    private String mOrderMessage;
    private View mOrder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_main );
    }


    public void showDonutOrder(View view){

        Intent intent=new Intent(this,OrderDonut.class);
        startActivity(intent);
    }
    public void showFroyoOrder(View view){

        Intent intent=new Intent(this,OrderFroyo.class);
        startActivity(intent);
    }
    public void showIceCreamOrder(View view){
        Intent intent=new Intent(this,OrderIcecream.class);
        startActivity(intent);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate( R.menu.menu_main, menu );
        return true;
    }




}
