package br.com.aceleradev.main.segundasemana.domain;

import br.com.aceleradev.main.segundasemana.enums.TiposDeDisciplinas;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    private String nome;
//    private String tipoDisciplina;
    private TiposDeDisciplinas tipoDeDisciplina;
    private List<Professor> professores = new ArrayList<>();
    private List<Aluno> alunos = new ArrayList<>();

    public Disciplina(String nome, TiposDeDisciplinas tipoDeDisciplina, Professor professor){
        setNome(nome);
        setTipoDeDisciplina(tipoDeDisciplina);
        setProfessor(professor);
    }

    public String getNome(){
        return this.nome;
    }

    private void setNome(String nome){
        this.nome = nome;
    }

    public TiposDeDisciplinas getTipoDisciplina() { return this.tipoDeDisciplina; }

    private void setTipoDeDisciplina(TiposDeDisciplinas tipoDeDisciplina){ this.tipoDeDisciplina = tipoDeDisciplina; }

//    public void setTipoDisciplina() { this.tipoDisciplina = tipoDisciplina(); }
//
//    private String tipoDisciplina(){
//        if("matematica/fisica/ciencia da computacao/quimica".contains(getNome().toLowerCase())){
//            return "exatas";
//        }
//
//        if("biologia/biofisica/bioquimica/botanica".contains(getNome().toLowerCase())){
//            return "biologicas";
//        }
//
//        return "humanas";
//    }

    private void setProfessor(Professor professor){ this.professores.add(professor); }

    public void matricularAluno(Aluno aluno){
        if(alunos.size() < 10) alunos.add(aluno);
    }
}
