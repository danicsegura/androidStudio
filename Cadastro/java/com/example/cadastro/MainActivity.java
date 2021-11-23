package com.example.cadastro;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioSexGroup;
    private RadioButton radioSexButton;
    private Button btnDisplay;
    private String cpf, nome, idade, sexo;
    private CheckBox chkStar, chkGame, chkSenhor;
    private Intent intent;
    private EditText editCpf, editNome, editIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro);

        editCpf         = (EditText) findViewById(R.id.txtcpf);
        editNome        = (EditText) findViewById(R.id.txtnome);
        editIdade       = (EditText) findViewById(R.id.txtidade);
        radioSexGroup   = (RadioGroup) findViewById(R.id.radioSex);
        btnDisplay      = (Button) findViewById(R.id.btnDisplay);
        chkStar         = (CheckBox) findViewById(R.id.chkStar);
        chkGame         = (CheckBox) findViewById(R.id.chkGame);
        chkSenhor       = (CheckBox) findViewById(R.id.chkSenhor);

        intent = new Intent(this, ResultadoActivity.class);

        btnDisplay.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
                int selectedId = radioSexGroup.getCheckedRadioButtonId();
                radioSexButton = (RadioButton) findViewById(selectedId);
                cpf = editCpf.getText().toString();
                nome = editNome.getText().toString();
                idade = editIdade.getText().toString();
                sexo = radioSexButton.getText().toString();

                StringBuffer interesses = new StringBuffer();
                if(chkStar.isChecked())
                    interesses.append("Star Wars\n");
                if(chkGame.isChecked())
                    interesses.append("Game of Thrones\n");
                if(chkSenhor.isChecked())
                    interesses.append("Senhor dos Anéis\n");

                intent.putExtra("sexo", sexo);
                intent.putExtra("nome", nome);
                intent.putExtra("cpf", cpf);
                intent.putExtra("idade", idade);
                intent.putExtra("interesses", interesses.toString());

                startActivity(intent);
            }
        });
    }
}