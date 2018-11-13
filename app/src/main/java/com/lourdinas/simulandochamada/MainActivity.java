package com.lourdinas.simulandochamada;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SharedPreferences meusDados;
    public static final String mypreference = "call";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        meusDados = getSharedPreferences(mypreference, Context.MODE_PRIVATE);

        final EditText EdEmail = findViewById(R.id.ed_email);
        final EditText EdSenha = findViewById(R.id.ed_senha);

        Button BtLogin = findViewById(R.id.btn_login);
        Button BtRegistrar = findViewById(R.id.btn_registrar);

        BtLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String meuEmail = EdEmail.getText().toString();
                String minhasenha = EdSenha.getText().toString();
                if (meusDados.contains("email") && meusDados.contains("senha")){
                    if(meuEmail.equals(meusDados.getString("email",""))
                            && minhasenha.equals(meusDados.getString("senha",""))){

                        Intent intent = new Intent(MainActivity.this,Activity_telefone.class);
                        startActivity(intent);
                    }
                }else {
                    Toast.makeText(getApplicationContext(),
                            "Não existem cadastros!",Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}
