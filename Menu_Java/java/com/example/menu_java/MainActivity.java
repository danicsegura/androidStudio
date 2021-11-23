package com.example.menu_java;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.app.AlertDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        boolean resultado = super.onCreateOptionsMenu(menu);
        menu.add(0,1,0,"Cadastros");
        menu.add(0,2,0,"Movimentos");
        menu.add(0,3,0,"Caixa");

        SubMenu utilitario = menu.addSubMenu("Relatórios");
        utilitario.add(0,4,0,"Contas a Pagar");
        utilitario.add(0,5,0,"Contas a Receber");

        return resultado;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        switch(id){
            case 1: Mensagem("Cadastros", "Cadastro!");
            break;
            case 2: Mensagem("Movimentos", "Movimentos!");
            break;
            case 3: Mensagem("Caixa", "Caixa!");
            break;
            case 4: Mensagem("Contas a Pagar", "Contas a pagar!");
            break;
            case 5: Mensagem("Contas a Receber", "Contas a receber!");
            break;
        }
        //retorna a classe pai
        return super.onOptionsItemSelected(item);
    }

    //metodo para exibir msg ao user
    public void Mensagem(String titulo, String texto){
        AlertDialog.Builder mensagem = new AlertDialog.Builder(MainActivity.this);
        mensagem.setTitle(titulo);
        mensagem.setMessage(texto);
        mensagem.setNeutralButton("Ok", null);
        mensagem.show();
    }
}