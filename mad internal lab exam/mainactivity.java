package com.example.aluminiportal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText na,em,ph,dob,cna,br,ba;
    Button b1;
    String name,email,phone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        na=findViewById(R.id.name);
        em=findViewById(R.id.email);
        ph=findViewById(R.id.phone);
        dob=findViewById(R.id.dob);
        cna=findViewById(R.id.cname);
        br=findViewById(R.id.branch);

        name=na.getText().toString().trim();
        email=em.getText().toString().trim();
        phone=ph.getText().toString().trim();
        email=em.getText().toString().trim();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name=="")
                {
                    Toast.makeText(MainActivity.this, "Enter the  Name", Toast.LENGTH_SHORT).show();
                }
                if (email=="")
                {
                    Toast.makeText(MainActivity.this, "Enter Password", Toast.LENGTH_SHORT).show();
                }
                if (phone=="")
                {
                    Toast.makeText(MainActivity.this, "Enter Phone", Toast.LENGTH_SHORT).show();
                }



            }
        });

    }
}
