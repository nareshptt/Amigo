package com.example.amigo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckboxActivity extends AppCompatActivity {

    CheckBox android,swift,python;
    Button btn,next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);

        btn = findViewById(R.id.button);
        android = findViewById(R.id.android);
        swift = findViewById(R.id.swift);
        python = findViewById(R.id.python);
        next=findViewById(R.id.button3);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CheckboxActivity.this,DatapickerActivity.class);
                startActivity(intent);
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = "Your programming langauge is :";

                if (android.isChecked()){
                    result += "Android";
                }
                if (swift.isChecked()){
                    result += "\nSwift";
                }
                if (python.isChecked()){
                    result += "\nPython";
                }
                Toast.makeText(CheckboxActivity.this, result, Toast.LENGTH_SHORT).show();
            }
        });


    }
}