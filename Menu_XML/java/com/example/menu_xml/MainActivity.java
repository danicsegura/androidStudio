package com.example.menu_xml;

import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.lista, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        //verifica qual é a referência de Id e mostra uma msg ao user
        switch(id){
            case R.id.Cadastrar: Mensagem("Cadastrar", "Cadastro!");
            break;
            case R.id.Movimentos: Mensagem("Movimentos", "Movimentos!");
            break;
            case R.id.Caixa: Mensagem("Caixa", "Caixa!");
            break;
        }
        //retorna a classe pai
        return super.onOptionsItemSelected(item);
    }

    //metodo para exibir mensagem ao usuário
    public void Mensagem(String titulo, String texto){
        AlertDialog.Builder mensagem = new AlertDialog.Builder(MainActivity.this);
        mensagem.setTitle(titulo);
        mensagem.setMessage(texto);
        mensagem.setNeutralButton("Ok", null);
        mensagem.show();
    }
}