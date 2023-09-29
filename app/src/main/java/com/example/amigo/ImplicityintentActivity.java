package com.example.amigo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ImplicityintentActivity extends AppCompatActivity {

    Button btn;
    EditText to,subject,message;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicityintent);

        btn = findViewById(R.id.button);
        to = findViewById(R.id.editTo);
        subject = findViewById(R.id.editSubject);
        message = findViewById(R.id.editMessage);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(ImplicityintentActivity.this, "Mail Sending...", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL,new String[]{to.getText().toString()});
                intent.putExtra(Intent.EXTRA_SUBJECT,subject.getText().toString());
                intent.putExtra(Intent.EXTRA_TEXT,message.getText().toString());
                intent.setType("message/rfc822");
                startActivity(intent);



            }
        });


    }
}




