package br.com.aceleradev.main.segundasemana.domain;

import br.com.aceleradev.main.segundasemana.exception.LoginInvalidoException;
import static br.com.aceleradev.main.segundasemana.utils.MensagemException.LOGIN_MENOR_QUE_TRES_CARACTERES;

public class Usuario {
    private String nome;
    private String login;
    private String cpf;

    public Usuario(String nome, String login, String cpf){
        setNome();
        setLogin();
        setCpf();
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(){
        this.nome = nome;
    }

    public String getLogin(){
        return this.login;
    }

    public void setLogin(){
        try{
            validaLogin();
            this.login = login;
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(){
        this.cpf = cpf;
    }

    public void validaLogin(){
        if(nome.length() < 3){
            throw new LoginInvalidoException(LOGIN_MENOR_QUE_TRES_CARACTERES);
        }
    }
}
