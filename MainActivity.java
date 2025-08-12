package com.example.authentification;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText login;
    private EditText password;
    private Button connection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Use your XML layout

        login = findViewById(R.id.log);
        password = findViewById(R.id.password);
        connection = findViewById(R.id.connection);

        connection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userLogin = login.getText().toString();
                String userPassword = password.getText().toString();

                if (userLogin.equals("hanine") && userPassword.equals("IsetR")) {
                    Toast.makeText(MainActivity.this, "Bon login et mot de passe", Toast.LENGTH_SHORT).show();
                    gotToNextActivity();
                } else {
                    Toast.makeText(MainActivity.this, "Login ou mot de passe incorrect", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void gotToNextActivity(){
        Intent intent = new Intent(this, NextActivity.class);
        startActivity(intent);
    }
}