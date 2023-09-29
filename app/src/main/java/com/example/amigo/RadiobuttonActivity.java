package com.example.amigo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class RadiobuttonActivity extends AppCompatActivity {

    Button btn,next;
    RadioButton yutube,insta,facbook;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radiobutton);

        btn = findViewById(R.id.submit);

        yutube = findViewById(R.id.youtube);
        insta = findViewById(R.id.insta);
        facbook = findViewById(R.id.facbook);

        next=findViewById(R.id.feedback);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RadiobuttonActivity.this,RattingActivity.class);
                startActivity(intent);
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (yutube.isChecked()){
                    Toast.makeText(RadiobuttonActivity.this, "You Selected Youtube ", Toast.LENGTH_SHORT).show();
                }
                else if (insta.isChecked()){
                    Toast.makeText(RadiobuttonActivity.this, "You Selected Instagram", Toast.LENGTH_SHORT).show();
                }
                else if (facbook.isChecked()){
                    Toast.makeText(RadiobuttonActivity.this, "You Selected Facbook", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(RadiobuttonActivity.this, "Please select anyone of the above", Toast.LENGTH_SHORT).show();
                }

            }
        });



    }
}