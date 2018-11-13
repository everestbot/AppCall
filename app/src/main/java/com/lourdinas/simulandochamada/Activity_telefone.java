package com.lourdinas.simulandochamada;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_telefone extends AppCompatActivity {
    String memoria = "" ;
    TextView txtDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telefone);

        txtDisplay = findViewById(R.id.txt_numero);

        Button Btn1 = findViewById(R.id.btn1);
        Button Btn2 = findViewById(R.id.btn2);
        Button Btn3 = findViewById(R.id.btn3);
        Button Btn4 = findViewById(R.id.btn4);
        Button Btn5 = findViewById(R.id.btn5);
        Button Btn6 = findViewById(R.id.btn6);
        Button Btn7 = findViewById(R.id.btn7);
        Button Btn8 = findViewById(R.id.btn8);
        Button Btn9 = findViewById(R.id.btn9);
        Button Btn0 = findViewById(R.id.btn0);
        Button Btnvelha = findViewById(R.id.btnVelha);
        Button BtnAste = findViewById(R.id.btnAste);
        Button BtnApagar = findViewById(R.id.btn_c);
        Button Btnligar = findViewById(R.id.btn_ligar);


        Btn0.setOnClickListener(myListener);
        Btn1.setOnClickListener(myListener);
        Btn2.setOnClickListener(myListener);
        Btn3.setOnClickListener(myListener);
        Btn4.setOnClickListener(myListener);
        Btn5.setOnClickListener(myListener);
        Btn6.setOnClickListener(myListener);
        Btn7.setOnClickListener(myListener);
        Btn8.setOnClickListener(myListener);
        Btn9.setOnClickListener(myListener);
        Btnvelha.setOnClickListener(myListener);
        BtnApagar.setOnClickListener(myListener);
        BtnAste.setOnClickListener(myListener);
        Btnligar.setOnClickListener(myListener);

    }
    private View.OnClickListener myListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_c:
                    if(memoria.length() > 0){
                        memoria = memoria.substring(0, memoria.length()-1);
                        txtDisplay.setText(memoria);
                    }
                    break;
                case R.id.btn0:
                    setDisplayText("0");
                    break;
                case R.id.btn1:
                    setDisplayText("1");
                    break;
                case R.id.btn2:
                    setDisplayText("2");
                    break;
                case R.id.btn3:
                    setDisplayText("3");
                    break;
                case R.id.btn4:
                    setDisplayText("4");
                    break;
                case R.id.btn5:
                    setDisplayText("5");
                    break;
                case R.id.btn6:
                    setDisplayText("6");
                    break;
                case R.id.btn7:
                    setDisplayText("7");
                    break;
                case R.id.btn8:
                    setDisplayText("8");
                    break;
                case R.id.btn9:
                    setDisplayText("9");
                    break;
                case R.id.btnAste:
                    setDisplayText("*");
                    break;
                case R.id.btnVelha:
                    setDisplayText("#");
                    break;
                case R.id.btn_ligar:
                    break;
            }
        }
    };


    private void setDisplayText(String valor) {
        memoria = memoria + valor;
        txtDisplay.setText(memoria);
    }
}
