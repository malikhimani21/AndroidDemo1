package com.example.myapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    Button sum;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        sum = findViewById(R.id.sum);
        txtResult = findViewById(R.id.txt_result);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String NUM1 = num1.getText().toString();
                String NUM2 = num2.getText().toString();

                int a = Integer.parseInt(NUM1);
                int b = Integer.parseInt(NUM2);
                int total = a+b;

                Toast.makeText(MainActivity.this, "Sum is " + Integer.toString(total), Toast.LENGTH_LONG).show();

                txtResult.setText("Sum is " + Integer.toString(total));


            }
        });

    }
}