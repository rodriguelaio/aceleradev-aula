package br.com.aceleradev.main.segundasemana.domain;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private List<Aluno> alunos = new ArrayList<>();
    public Disciplina(String nome, Professor professor){
        setNome();
    }

    public String getNome(){
        return this.nome;
    }

    private void setNome(){
        this.nome = nome;
    }

    public void matricularAluno(Aluno aluno){
        if(alunos.size() < 10) alunos.add(aluno);
    }
}
