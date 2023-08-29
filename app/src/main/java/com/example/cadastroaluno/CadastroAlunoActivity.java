package com.example.cadastroaluno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CadastroAlunoActivity extends AppCompatActivity {

    private Button btSalvar;
    private EditText edRaAluno;
    private EditText edNomeAluno;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_aluno);

        edRaAluno = findViewById(R.id.edRaAluno);
        edNomeAluno = findViewById(R.id.edNomeAluno);

        btSalvar = findViewById(R.id.btSalvar);
        btSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                salvarAluno();
            }
        });
    }

    private void salvarAluno() {
        int ra;
        if(edRaAluno.getText().toString().isEmpty()){
            edRaAluno.setError("O RA do Aluno deve ser informado!");
            return;
        }else{
            try{
                ra = Integer.parseInt(edRaAluno.getText().toString());
            }catch (Exception ex){
                edRaAluno.setError("Informe um RA válido (somento números)!");
                return;
            }
        }

        if(edNomeAluno.getText().toString().isEmpty()){
            edNomeAluno.setError("O Nome do Aluno deve ser informado!");
            return;
        }

        Aluno aluno = new Aluno();
        aluno.setRa(ra);
        aluno.setNome(edNomeAluno.getText().toString());

        Controller.getInstancia().salvarAluno(aluno);

        finish();
    }


}