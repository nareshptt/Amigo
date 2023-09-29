package com.example.amigo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class RattingActivity extends AppCompatActivity {

    Button btn;
    RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratting);

        btn = findViewById(R.id.button);
        ratingBar = findViewById(R.id.ratingBar);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float rating = ratingBar.getRating();

                Toast.makeText(RattingActivity.this, "Rating is:"+rating+"/5", Toast.LENGTH_SHORT).show();
            }
        });
    }
}