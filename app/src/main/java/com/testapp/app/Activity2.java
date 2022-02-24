package com.testapp.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    private EditText Username;
    private EditText Password;
    private TextView Attempts;
    private Button Login;
    private int counter=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Username = (EditText) findViewById(R.id.etusername);
        Password = (EditText) findViewById(R.id.etPassword);
        Attempts = (TextView) findViewById(R.id.attempts);
        Login = (Button) findViewById(R.id.btnLogin);

        Attempts.setText("Number of remaining attempts: 5");

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Username.getText().toString(),Password.getText().toString());
            }
        });
    }

    private void validate(String userName, String userPassword) {

        if((userName.equals("usertest")) && (userPassword.equals("123test"))) {
            Intent intent = new Intent(Activity2.this, Activity3.class);
            startActivity(intent);
        }else{
            counter--;

            Attempts.setText("Number of remaining attempts: " + String.valueOf(counter));

            if(counter == 0){
                Login.setEnabled(false);
            }
        }
    }
}