package com.example.cadastroaluno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class cadastrar_professor extends AppCompatActivity {

    private Button btSalvarProf;

    private EditText edMatricula;

    private EditText edNomeProfessor;

    private EditText edCpfProfessor;

    private EditText edDataNasc;

    private EditText edDataAdmi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_professor);

        btSalvarProf = findViewById(R.id.btSalvarProf);
        edNomeProfessor = findViewById(R.id.edNomeProfessor);
        edCpfProfessor = findViewById(R.id.edCpfProfessor);
        edDataNasc = findViewById(R.id.edDataNasc);
        edDataAdmi = findViewById(R.id.edDataAdmi);

        btSalvarProf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                salvarProfessor();
            }
        });

    }

    private void salvarProfessor() {
        int matricula;
        if (edNomeProfessor.getText().toString().isEmpty()) {
            edNomeProfessor.setError("O nome do Professor deve ser informado!");
            return;

        }
        if (edMatricula.getText().toString().isEmpty()) {
            edMatricula.setError("A matricula deve ser informada!");
            return;
        } else {
            matricula = validarNum(edMatricula.getText().toString());
            if (matricula < 0) {
                edMatricula.setError("Informe uma matricula valida(somente números)");
                return;
            }
        }
    }

    private int validarNum(String num) {
        int numValidado;
        try {
            numValidado = Integer.parseInt(num);
        } catch (Exception ex) {

        }
        return -1;
    }
}