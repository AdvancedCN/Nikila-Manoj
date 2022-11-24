package com.example.aluminiportal;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;



public class login extends AppCompatActivity {
    EditText e1,e2;
    Button bu;
    String n1,n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.uname);
        e2=findViewById(R.id.pswd);
        bu=findViewById(R.id.b1);

        n1=e1.getText().toString().trim();
        n2=e2.getText().toString().trim();

        bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n1=="")
                {
                    Toast.makeText(login.this, "Enter the User Name", Toast.LENGTH_SHORT).show();
                }
                if (n2=="")
                {
                    Toast.makeText(login.this, "Enter Password", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}
