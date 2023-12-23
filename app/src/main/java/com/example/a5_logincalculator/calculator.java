package com.example.a5_logincalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;

public class calculator extends AppCompatActivity {
    Button btnback, button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonadd, buttonSub, buttonDiv,
            buttonMul, buttonPoint, buttonReset, buttonEqual;

    EditText eT;
    float ValueOne, ValueTwo, result;
    boolean Addition, Subtract, Multiplication, Division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

//Referencing
        button0 = (Button) findViewById(R.id.zero);
        button1 = (Button) findViewById(R.id.one);
        button2 = (Button) findViewById(R.id.two);
        button3 = (Button) findViewById(R.id.three);
        button4 = (Button) findViewById(R.id.four);
        button5 = (Button) findViewById(R.id.five);
        button6 = (Button) findViewById(R.id.six);
        button7 = (Button) findViewById(R.id.seven);
        button8 = (Button) findViewById(R.id.eight);
        button9 = (Button) findViewById(R.id.nine);
        buttonPoint = (Button) findViewById(R.id.point);
        buttonadd = (Button) findViewById(R.id.plus);
        buttonSub = (Button) findViewById(R.id.minus);
        buttonMul = (Button) findViewById(R.id.multiply);
        buttonDiv = (Button) findViewById(R.id.division);
        buttonReset = (Button) findViewById(R.id.resetButton);
        buttonEqual = (Button) findViewById(R.id.equal);
        btnback = (Button) findViewById(R.id.backButton);
        eT = (EditText) findViewById(R.id.resultTextView);

        //Event Listeners
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //to set the editText with the button value 1
                eT.setText(eT.getText() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eT.setText(eT.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eT.setText(eT.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eT.setText(eT.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eT.setText(eT.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eT.setText(eT.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eT.setText(eT.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eT.setText(eT.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                eT.setText(eT.getText() + "9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eT.setText(eT.getText() + "0");
            }
        });
        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eT.setText("");
            }
        });

        buttonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eT.setText(eT.getText() + ".");
            }
        });


        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //convert string to float and set UI Null to get next input
                ValueOne = Float.parseFloat(eT.getText().toString());
                Addition = true;
                eT.setText(null);
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueOne = Float.parseFloat(eT.getText().toString());
                Subtract = true;
                eT.setText(null);
            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueOne = Float.parseFloat(eT.getText().toString());
                Multiplication = true;
                eT.setText(null);
            }
        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueOne = Float.parseFloat(eT.getText().toString());
                Division = true;
                eT.setText(null);
            }

        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //to get the second input and convert that into float
                ValueTwo = Float.parseFloat(eT.getText().toString());

                if (Addition == true) {
                    result = ValueOne + ValueTwo;
                    eT.setText(String.valueOf(result));
                    Addition = false;
                }

                if (Subtract == true) {
                    result = ValueOne - ValueTwo;
                    eT.setText(String.valueOf(result));
                    Subtract = false;
                }
                if (Multiplication == true) {
                    result = ValueOne * ValueTwo;
                    eT.setText(String.valueOf(result));
                    Multiplication = false;
                }

                if (Division == true) {
                    result = ValueOne / ValueTwo;
                    eT.setText(String.valueOf(result));
                    Division = false;
                }
            }
        });


        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Ok Button", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                Toast.makeText(calculator.this, "Redirecting..", Toast.LENGTH_SHORT).show();


            }
        });
    }


}