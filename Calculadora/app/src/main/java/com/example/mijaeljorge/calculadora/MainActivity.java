package com.example.mijaeljorge.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    boolean decimal = false;
    boolean sum = false;
    boolean res = false;
    boolean mul = false;
    boolean div = false;
    Double[] numero = new Double[20];
    double dato ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn0 = (Button)findViewById(R.id.btn0);
        btn0.setOnClickListener(this);
        Button btn1 = (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        Button btn2 = (Button)findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        Button btn3 = (Button)findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
        Button btn4 = (Button)findViewById(R.id.btn4);
        btn4.setOnClickListener(this);
        Button btn5 = (Button)findViewById(R.id.btn5);
        btn5.setOnClickListener(this);
        Button btn6 = (Button)findViewById(R.id.btn6);
        btn6.setOnClickListener(this);
        Button btn7 = (Button)findViewById(R.id.btn7);
        btn7.setOnClickListener(this);
        Button btn8 = (Button)findViewById(R.id.btn8);
        btn8.setOnClickListener(this);
        Button btn9 = (Button)findViewById(R.id.btn9);
        btn9.setOnClickListener(this);
        Button btnp = (Button)findViewById(R.id.btnp);
        btnp.setOnClickListener(this);

        Button suma = (Button)findViewById(R.id.suma);
        suma.setOnClickListener(this);
        Button resta = (Button)findViewById(R.id.resta);
        resta.setOnClickListener(this);
        Button multi = (Button)findViewById(R.id.multi);
        multi.setOnClickListener(this);
        Button divi = (Button)findViewById(R.id.divi);
        divi.setOnClickListener(this);
        Button borrar = (Button)findViewById(R.id.borrar);
        borrar.setOnClickListener(this);
        Button igual = (Button)findViewById(R.id.igual);
        igual.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        TextView screen = (TextView)findViewById(R.id.textView3);
        int selector = view.getId();
        String x = screen.getText().toString();
        try{
            switch (selector){
                case R.id.btn0:
                    screen.setText(x+"0");
                    break;
                case R.id.btn1:
                    screen.setText(x+"1");
                    break;
                case R.id.btn2:
                    screen.setText(x+"2");
                    break;
                case R.id.btn3:
                    screen.setText(x+"3");
                    break;
                case R.id.btn4:
                    screen.setText(x+"4");
                    break;
                case R.id.btn5:
                    screen.setText(x+"5");
                    break;
                case R.id.btn6:
                    screen.setText(x+"6");
                    break;
                case R.id.btn7:
                    screen.setText(x+"7");
                    break;
                case R.id.btn8:
                    screen.setText(x+"8");
                    break;
                case R.id.btn9:
                    screen.setText(x+"9");
                    break;
                case R.id.btnp:
                    if(decimal==false){
                        screen.setText(x+".");
                        decimal=true;
                    }else{return;}
                    break;
                case R.id.suma:
                    sum=true;
                    numero[0]=Double.parseDouble(x);
                    screen.setText("");
                    decimal=false;

                    break;
                case R.id.resta:
                    res=true;
                    numero[0]=Double.parseDouble(x);
                    screen.setText("");
                    decimal=false;
                    break;
                case R.id.multi:
                    mul=true;
                    numero[0]=Double.parseDouble(x);
                    screen.setText("");
                    decimal=false;
                    break;
                case R.id.divi:
                    div=true;
                    numero[0]=Double.parseDouble(x);
                    screen.setText("");
                    decimal=false;
                    break;
                case R.id.borrar:
                    screen.setText("");
                    decimal=false;
                    break;
                case R.id.igual:
                    numero[1]=Double.parseDouble(x);
                    if(sum==true){
                        dato=numero[0] + numero[1];
                        screen.setText(String.valueOf(dato));
                    }else if (res==true){
                        dato=numero[0] - numero[1];
                        screen.setText(String.valueOf(dato));
                    }else if (mul==true){
                        dato=numero[0] * numero[1];
                        screen.setText(String.valueOf(dato));
                    }else if (div==true){
                        dato=numero[0] / numero[1];
                        screen.setText(String.valueOf(dato));
                    }
                    decimal=false;
                    sum=false;
                    res=false;
                    mul=false;
                    div=false;
                    break;
            }
        }catch (Exception e){
            screen.setText("error");
        }

    }
}
