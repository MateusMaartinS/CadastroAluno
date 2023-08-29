package com.example.cadastroaluno;

import java.util.ArrayList;

public class Controller {
    private static Controller instancia;
    private ArrayList<Aluno> listaAluno;

    public static Controller getInstancia(){
        if(instancia == null){
            return instancia = new Controller();
        }else{
            return instancia;
        }
    }

    private Controller(){
        listaAluno = new ArrayList<>();
    }

    public void salvarAluno (Aluno aluno){
        listaAluno.add(aluno);
    }
    public ArrayList<Aluno> retornarAlunos(){
        return listaAluno;
    }

}
