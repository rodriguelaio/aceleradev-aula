package br.com.aceleradev.main.segundasemana.dataloader;

import br.com.aceleradev.main.segundasemana.domain.*;
import br.com.aceleradev.main.segundasemana.repositories.UsuarioRepository;

public class DataLoader {
    public UsuarioRepository usuario = new UsuarioRepository();

    public Aluno incluirAluno(String nome, String login, String cpf, String dataDeNascimento){
        return new Aluno(nome, login, cpf, dataDeNascimento, usuario);
    }

    public Professor incluirProfessor(String nome, String login, String cpf, String sobrenome, String dataDeNascimento){
        return new Professor(nome, login, cpf, sobrenome, dataDeNascimento, usuario);
    }

    public Disciplina incluirDisciplina(String nome, Professor professor){
        return new Disciplina(nome, professor);
    }
}
