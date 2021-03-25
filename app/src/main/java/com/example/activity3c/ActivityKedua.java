package com.example.activity3c;

import android.os.Bundle;
import android.widget.TextView;
import  androidx.appcompat.app.AppCompatActivity;

import com.example.activity3c.R;

public class ActivityKedua extends AppCompatActivity {
    TextView txEmail, txPassword;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitykedua);

        txEmail = findViewById(R.id.tvEmail);
        txPassword = findViewById(R.id.tvPassword);

        Bundle bundle = getIntent().getExtras();

        String email = bundle.getString("a");

        String pass = bundle.getString("b");

        txEmail.setText(email);
        txPassword.setText(pass);
    }
}