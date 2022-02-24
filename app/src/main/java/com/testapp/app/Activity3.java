package com.testapp.app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Activity3 extends AppCompatActivity {
    private Button Buy, Sell, Trade;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        Buy = findViewById(R.id.buybtn);
        Sell = findViewById(R.id.sellbtn);
        Trade = findViewById(R.id.tradebtn);

        Buy.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(Activity3.this, Activity4Buy.class));
            }
        });

        Sell.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(Activity3.this, Activity5Sell.class));
            }
        });

        Trade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Activity3.this, Activity6Trade.class));
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_options, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.homemenu) {
            startActivity(new Intent(Activity3.this, Activity3.class));
        }

        if (id == R.id.logout) {
            startActivity(new Intent(Activity3.this, MainActivity.class));
        }


        if (id==R.id.accountmenu) {
            startActivity(new Intent(Activity3.this, Activity7Account.class));
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}