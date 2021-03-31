package com.sush.example.a123;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    Button b1;
    EditText rollNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView register = (TextView)findViewById(R.id.lnkLogin);
        b1 = findViewById(R.id.btnLogin);
        rollNum = findViewById(R.id.txtName);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegistrationActivity.class);
                startActivity(intent);
            }
        });


    }

    public void login(View view) {
        String s = rollNum.getText().toString();
        Intent i = new Intent(this,Welcome.class);
        i.putExtra("roll",s);
        startActivity(i);
    }
}