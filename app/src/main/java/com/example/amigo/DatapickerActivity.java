package com.example.amigo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

public class DatapickerActivity extends AppCompatActivity {

    DatePicker datePicker;

    Button btn,next ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datapicker);

        btn = findViewById(R.id.button);
        datePicker = findViewById(R.id.datepicker);
        next=findViewById(R.id.timepicker);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DatapickerActivity.this,TimepickerActivity.class);
                startActivity(intent);
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = "Your selected date is : ";
                String myresult = result + datePicker.getDayOfMonth()+"/"+(datePicker.getMonth()+1)+"/"+datePicker.getYear();

                Toast.makeText(DatapickerActivity.this, myresult, Toast.LENGTH_SHORT).show();
            }
        });



    }
}