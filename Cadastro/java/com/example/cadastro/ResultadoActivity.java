package com.example.cadastro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultadoActivity extends Activity{
    private TextView tvSexo, tvInteresses, tvCPF, tvNome, tvIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        Intent intent = getIntent();
        String sexo = intent.getStringExtra("sexo");
        String interesses = intent.getStringExtra("interesses");
        String cpf = intent.getStringExtra("cpf");
        String nome = intent.getStringExtra("nome");
        String idade = intent.getStringExtra("idade");

        tvSexo          = (TextView) findViewById(R.id.tvSexo);
        tvInteresses    = (TextView) findViewById(R.id.tvInteresses);
        tvCPF           = (TextView) findViewById(R.id.tvCPF);
        tvNome          = (TextView) findViewById(R.id.tvNome);
        tvIdade         = (TextView) findViewById(R.id.tvIdade);
        tvSexo.setText(sexo);
        tvInteresses.setText(interesses);
        tvCPF.setText(cpf);
        tvNome.setText(nome);
        tvIdade.setText(idade);

        final Button bvoltar = (Button) findViewById(R.id.voltar);
        bvoltar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                finish();
            }
        });
    }
}
