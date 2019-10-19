package br.com.aceleradev.main.segundasemana.domain;

public class Professor extends Usuario{

    private String sobrenome;

    public Professor(String nome, String login, String cpf, String sobrenome){
        super(nome, login, cpf);
        setSobrenome();
    }

    public void setSobrenome(){
        this.sobrenome = sobrenome;
    }
}
