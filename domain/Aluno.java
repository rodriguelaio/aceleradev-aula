package br.com.aceleradev.main.segundasemana.domain;

import br.com.aceleradev.main.segundasemana.repositories.UsuarioRepository;

public class Aluno extends Usuario{
    public Aluno(String nome, String login, String cpf, String dataDeNascimento, UsuarioRepository usuario){
        super(nome, login, cpf, dataDeNascimento, usuario);
    }

}
