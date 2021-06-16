package com.example.simplemath;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText num1;
    private EditText num2;
    private Button Add;
    private Button Divide;
    private Button Multiply;
    private Button Subtract;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.ednum1);
        num2 = (EditText)findViewById(R.id.ednum2);
        Add = (Button)findViewById(R.id.btAdd);
        Divide = (Button)findViewById(R.id.btDivide2);
        Multiply = (Button)findViewById(R.id.btMul2);
        Subtract = (Button)findViewById(R.id.btSub2);
        result = (TextView)findViewById(R.id.tvanswer);

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int sum = number1 + number2;
                result.setText("Answer: " + String.valueOf(sum));
            }
        });
        Divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int res = number1 / number2;
                result.setText("Answer: "+ String.valueOf(res));
            }
        });

        Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int mul = number1 * number2;
                result.setText("Answer: "+ String.valueOf(mul));
            }
        });

        Subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int sub = number1 - number2;
                result.setText("Answer: "+ String.valueOf(sub));
            }
        });
    }
}