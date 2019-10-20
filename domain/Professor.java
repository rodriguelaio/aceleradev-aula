package br.com.aceleradev.main.segundasemana.domain;

import br.com.aceleradev.main.segundasemana.repositories.UsuarioRepository;

public class Professor extends Usuario{

    private String sobrenome;

    public Professor(String nome, String login, String cpf, String sobrenome, String dataDeNascimento, UsuarioRepository usuario){
        super(nome, login, cpf, dataDeNascimento, usuario);
        setSobrenome();
    }

    public void setSobrenome(){
        this.sobrenome = sobrenome;
    }
}
