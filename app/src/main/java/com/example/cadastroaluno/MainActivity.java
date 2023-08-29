package com.example.cadastroaluno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button btCadastroAluno;

    private TextView tvListaAlunos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvListaAlunos = findViewById(R.id.tvListaAlunos);
        btCadastroAluno = findViewById(R.id.btCadastroAluno);
        btCadastroAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirCadastroAluno();
            }
        });
    }

    private void abrirCadastroAluno() {
        Intent abrirCadastro = new Intent(MainActivity.this, CadastroAlunoActivity.class);

        startActivity(abrirCadastro);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        String texto = "";

        ArrayList<Aluno> lista = Controller.getInstancia().retornarAlunos();
        for(Aluno aluno: lista){
            texto += (aluno.getRa()+" - "+ aluno.getNome()+"\n");
        }
        tvListaAlunos.setText(texto);
    }
}