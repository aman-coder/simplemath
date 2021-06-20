package com.example.simplemath;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText ednum;
    private Button Add;
    private Button Divide;
    private Button Multiply;
    private Button Subtract;
    private Button bt1;
    private Button bt2;
    private Button bt3;
    private Button bt4;
    private Button bt5;
    private Button bt6;
    private Button bt7;
    private Button bt8;
    private Button bt9;
    private Button btdot;
    private Button bt0;
    private Button btclr;
    private Button btequal;

    float enum1,enum2;

    boolean eadd,esub,ediv,emul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ednum = (EditText)findViewById(R.id.ednum);
        Add = (Button)findViewById(R.id.btAdd);
        Divide = (Button)findViewById(R.id.btDivide2);
        Multiply = (Button)findViewById(R.id.btMul2);
        Subtract = (Button)findViewById(R.id.btSub2);
        bt1=(Button)findViewById(R.id.bt1);
        bt2=(Button)findViewById(R.id.bt);
        bt3=(Button)findViewById(R.id.bt2);
        bt4=(Button)findViewById(R.id.bt3);
        bt5=(Button)findViewById(R.id.bt4);
        bt6=(Button)findViewById(R.id.bt5);
        bt7=(Button)findViewById(R.id.bt6);
        bt8=(Button)findViewById(R.id.bt7);
        bt9=(Button)findViewById(R.id.bt8);
        btdot=(Button)findViewById(R.id.bt9);
        bt0=(Button)findViewById(R.id.bt10);
        btclr=(Button)findViewById(R.id.bt11);
        btequal=(Button)findViewById(R.id.btequal);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ednum.setText(ednum.getText() + "1");
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ednum.setText(ednum.getText() + "2");
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ednum.setText(ednum.getText() + "3");
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ednum.setText(ednum.getText() + "4");
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ednum.setText(ednum.getText() + "5");
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ednum.setText(ednum.getText() + "6");
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ednum.setText(ednum.getText() + "7");
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ednum.setText(ednum.getText() + "8");
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ednum.setText(ednum.getText() + "9");
            }
        });
        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ednum.setText(ednum.getText() + "0");
            }
        });
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ednum==null){
                    ednum.setText("");
                }else{
                    enum1=Float.parseFloat(ednum.getText()+"");
                    eadd = true;
                    ednum.setText(null);

                }
            }
        });
        Subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ednum==null){
                    ednum.setText("");
                }else{
                    enum1=Float.parseFloat(ednum.getText()+"");
                    esub = true;
                    ednum.setText(null);

                }
            }
        });
        Divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ednum==null){
                    ednum.setText("");
                }else{
                    enum1=Float.parseFloat(ednum.getText()+"");
                    ediv = true;
                    ednum.setText(null);

                }
            }
        });
        Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ednum==null){
                    ednum.setText("");
                }else{
                    enum1=Float.parseFloat(ednum.getText()+"");
                    emul = true;
                    ednum.setText(null);

                }
            }
        });
        btequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enum2 = Float.parseFloat(ednum.getText()+"");

                if(eadd==true){
                    ednum.setText(enum1+enum2+"");
                    eadd=false;
                }
                if(esub==true){
                    ednum.setText(enum1-enum2+"");
                    esub=false;
                }
                if(emul==true){
                    ednum.setText(enum1*enum2+"");
                    emul=false;
                }
                if(ediv==true){
                    ednum.setText(enum1/enum2+"");
                    ediv=false;
                }
            }
        });
        btclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ednum.setText("");
            }
        });
        btdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ednum.setText(ednum.getText()+".");
            }
        });


    }
}