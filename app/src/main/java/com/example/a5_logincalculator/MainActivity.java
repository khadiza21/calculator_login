package com.example.a5_logincalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etName, etPass;
    Button btnLogin;
    String Name, Password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName=(EditText) findViewById(R.id.username);
        etPass=(EditText) findViewById(R.id.password);
        btnLogin=(Button) findViewById(R.id.loginButton);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Ok Button", Toast.LENGTH_SHORT).show();
                Name = etName.getText().toString();
                Password = etPass.getText().toString();

                if ((Name.equals("Khadiza")) && (Password.equals("192002040"))) {
                    Intent intent = new Intent(getApplicationContext(), calculator.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "Redirecting..", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(),
                            "Wrong Name and ID", Toast.LENGTH_SHORT).show();


                }}
        });


    }
}