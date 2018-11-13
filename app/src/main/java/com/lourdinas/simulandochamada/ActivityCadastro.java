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

public class ActivityCadastro extends AppCompatActivity {

    SharedPreferences meuDados;
    public static final  String mypreference = "call";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        meuDados = getSharedPreferences(mypreference, Context.MODE_PRIVATE);

        final EditText Novasenha = findViewById(R.id.senha);
        final EditText Novoemail = findViewById(R.id.email);
        final EditText ConfirSenha = findViewById(R.id.CSenha);

        Button Cda = findViewById(R.id.btn_cadastrar);

        Cda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Novasenha.getText().toString().equals(ConfirSenha.getText().toString())){

                    SharedPreferences.Editor editor = meuDados.edit();
                    editor.putString("email",Novoemail.getText().toString());
                    editor.putString("senha",Novasenha.getText().toString());

                    editor.commit();

                    Intent intent = new Intent(ActivityCadastro.this, MainActivity.class);
                    startActivity(intent);
                    finish();

                }else {
                    Toast.makeText(getApplicationContext(),
                            "As senhas não conferem",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
