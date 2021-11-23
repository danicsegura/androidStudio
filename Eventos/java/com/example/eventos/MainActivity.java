package com.example.eventos;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;ui
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //campos do layout
    EditText num1, num2, result;
    Button btSomar, btSubtrair, btDividir, btMultiplicar;

    //vars da classe para o cálculo
    double n1, n2, resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eventos_layout);

        //pegando valores do usuário
        num1    = (EditText) findViewById(R.id.num1);
        num2    = (EditText) findViewById(R.id.num2);
        result  = (EditText) findViewById(R.id.result);

        btSomar     = (Button) findViewById(R.id.btSomar);
        btSubtrair     = (Button) findViewById(R.id.btSubtrair);
        btDividir     = (Button) findViewById(R.id.btDividir);
        btMultiplicar     = (Button) findViewById(R.id.btMultiplicar);

        //botão somar
        btSomar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //passa valores do layout para as vars da classe
                n1 = Double.parseDouble(num1.getText().toString());
                n2 = Double.parseDouble(num2.getText().toString());

                resultado = n1 + n2;

                //passa valores da soma para o campo Resultado do layout
                result.setText(String.valueOf(resultado));
            }
        });

        //botão subtrair
        btSubtrair.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //passa valores do layout para as vars da classe
                n1 = Double.parseDouble(num1.getText().toString());
                n2 = Double.parseDouble(num2.getText().toString());

                resultado = n1 - n2;

                //passa valores da soma para o campo Resultado do layout
                result.setText(String.valueOf(resultado));
            }
        });

        //botão dividir
        btDividir.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //passa valores do layout para as vars da classe
                n1 = Double.parseDouble(num1.getText().toString());
                n2 = Double.parseDouble(num2.getText().toString());

                resultado = n1 / n2;

                //passa valores da soma para o campo Resultado do layout
                result.setText(String.valueOf(resultado));
            }
        });

        //botão multiplicar
        btMultiplicar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //passa valores do layout para as vars da classe
                n1 = Double.parseDouble(num1.getText().toString());
                n2 = Double.parseDouble(num2.getText().toString());

                resultado = n1 * n2;

                //passa valores da soma para o campo Resultado do layout
                result.setText(String.valueOf(resultado));
            }
        });
    }
}