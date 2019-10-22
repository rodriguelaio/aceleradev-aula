package br.com.aceleradev.main.segundasemana.domain;

public class Professor extends Usuario{

    private String sobrenome;

    public Professor(String nome, String login, String cpf, String sobrenome, String dataDeNascimento){
        super(nome, login, cpf, dataDeNascimento);
        setSobrenome();
    }

    public void setSobrenome(){
        this.sobrenome = sobrenome;
    }

    public String getSobrenome(){ return this.sobrenome; }
}
