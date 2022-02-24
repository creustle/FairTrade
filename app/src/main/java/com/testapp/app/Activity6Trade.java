package com.testapp.app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class Activity6Trade extends AppCompatActivity {

    TextInputLayout textInputLayout;
    AutoCompleteTextView autoCompleteTextView;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity6_trade);

        submit = (Button)findViewById(R.id.submitsell);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Activity6Trade.this, "Submitted successfully!", Toast.LENGTH_SHORT).show();
            }});

        textInputLayout=findViewById(R.id.dropdown);
        autoCompleteTextView=findViewById(R.id.dropdown_items);
        String[]items={"Women - Tops","Women - Bottoms","Women - Shoes","Men - Tops","Men - Bottoms","Men - Shoes","Head Wear/Hats"};
        ArrayAdapter<String> itemAdapter=new ArrayAdapter<>(Activity6Trade.this, R.layout.items_list,items);
        autoCompleteTextView.setAdapter(itemAdapter);

        textInputLayout=findViewById(R.id.dropdown2);
        autoCompleteTextView=findViewById(R.id.dropdown2_items);
        String[]items2={"New","Gently Used - Like New","Worn - Some Imperfections"};
        ArrayAdapter<String> items2Adapter=new ArrayAdapter<>(Activity6Trade.this, R.layout.items_list, items2);
        autoCompleteTextView.setAdapter(items2Adapter);

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

        if (id == R.id.homemenu){
            startActivity(new Intent(Activity6Trade.this, Activity3.class));
        }

        if (id == R.id.logout) {
            startActivity(new Intent(Activity6Trade.this, MainActivity.class));
        }

        if (id==R.id.accountmenu) {
            startActivity(new Intent(Activity6Trade.this, Activity7Account.class));
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}