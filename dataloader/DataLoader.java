package br.com.aceleradev.main.segundasemana.dataloader;

import br.com.aceleradev.main.segundasemana.domain.*;
import br.com.aceleradev.main.segundasemana.enums.TiposDeDisciplinas;
import br.com.aceleradev.main.segundasemana.repositories.UsuarioRepository;

public class DataLoader {
    public UsuarioRepository repositorio = new UsuarioRepository();

    public Aluno incluirAluno(String nome, String login, String cpf, String dataDeNascimento){
        Aluno aluno = new Aluno(nome, login, cpf, dataDeNascimento);
        repositorio.insereUsuario(aluno);
        return aluno;
    }

    public Professor incluirProfessor(String nome, String login, String cpf, String sobrenome, String dataDeNascimento){
        Professor professor =  new Professor(nome, login, cpf, sobrenome, dataDeNascimento);
        repositorio.insereUsuario(professor);
        return professor;
    }

    public Disciplina incluirDisciplina(String nome, TiposDeDisciplinas tiposDeDisciplinas, Professor professor){
        Disciplina disciplina = new Disciplina(nome, tiposDeDisciplinas, professor);
        repositorio.insereDisciplina(disciplina, tiposDeDisciplinas);
        return disciplina;
    }
}
