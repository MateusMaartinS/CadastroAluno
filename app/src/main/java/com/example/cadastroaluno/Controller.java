package com.example.cadastroaluno;

import java.util.ArrayList;

public class Controller {
    private static Controller instancia;
    private ArrayList<Aluno> listaAluno;

    private ArrayList<Professor> listaProfessor;

    private ArrayList<Disciplina> listaDisciplina;

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

    public ArrayList<Professor> retornarProfessor(){return listaProfessor}

    prublic void salvarDisciplina(Disciplina disciplina){
        listaDisciplinas.add(dsciplina);
    }

    public ArrayList<Disciplina>retornarDisciplinas(){
        return listaDisciplina;
    }
}
