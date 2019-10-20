package br.com.aceleradev.main.segundasemana.domain;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    private String nome;
    private String tipoDisciplina;
    private List<Aluno> alunos = new ArrayList<>();

    public Disciplina(String nome, Professor professor){
        setNome();
        setTipoDisciplina();
    }

    public String getNome(){
        return this.nome;
    }

    private void setNome(){
        this.nome = nome;
    }

    public String getTipoDisciplina() { return tipoDisciplina; }

    public void setTipoDisciplina() { this.tipoDisciplina = tipoDisciplina(getNome()); }

    private String tipoDisciplina(String nomeMateria){
        if("matematica/fisica/ciencia da computacao/quimica".contains(nomeMateria.toLowerCase())){
            return "exatas";
        }

        if("biologia/biofisica/bioquimica/botanica".contains(nomeMateria.toLowerCase())){
            return "biologicas";
        }

        return "humanas";
    }

    public void matricularAluno(Aluno aluno){
        if(alunos.size() < 10) alunos.add(aluno);
    }
}
