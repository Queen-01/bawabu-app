package com.queen.baawabu.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.queen.baawabu.R;

public class CheckIn extends AppCompatActivity {
    Button mCheckOut, mCkIn;
    TextView mRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_in);
        mCheckOut = findViewById(R.id.btnOut);
        mRegister = findViewById(R.id.REG3);
        mCkIn = findViewById(R.id.btnIn2);

        mRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CheckIn.this, Register.class);
                startActivity(intent);
            }
        });

        mCheckOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(CheckIn.this, CheckOut.class);
                startActivity(intent);
            }
        });

        mCkIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CheckIn.this, Success.class);
                startActivity(intent);
            }
        });
    }
}