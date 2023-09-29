package com.example.amigo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

public class TimepickerActivity extends AppCompatActivity {

    TimePicker timePicker;
    Button btn ,floating,exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timepicker);

        exit=findViewById(R.id.button4);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TimepickerActivity.this,SiimplelistviewActivity.class);
                startActivity(intent);
            }
        });

        timePicker = findViewById(R.id.timepicker);
        btn = findViewById(R.id.button);
        floating=findViewById(R.id.exit);
        floating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TimepickerActivity.this,floatingactionActivity.class);
                startActivity(intent);
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                timePicker.is24HourView();

                if (timePicker.getHour()<12){
                    String time = "AM";
                    String result = "Your time is: "+timePicker.getHour()+":" + timePicker.getMinute() + time;
                    Toast.makeText(TimepickerActivity.this,result , Toast.LENGTH_SHORT).show();
                }

                else {
                    String time = "PM";
                    String result = "Your time is: "+timePicker.getHour()+":" + timePicker.getMinute() + time;
                    Toast.makeText(TimepickerActivity.this,result , Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}