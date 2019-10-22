package br.com.aceleradev.main.segundasemana.domain;

import java.time.LocalDate;
import br.com.aceleradev.main.segundasemana.exception.LoginInvalidoException;
import static br.com.aceleradev.main.segundasemana.utils.ConverterStringLocalData.ConverterStringLocalData;
import static br.com.aceleradev.main.segundasemana.utils.MensagemException.LOGIN_MENOR_QUE_TRES_CARACTERES;

public class Usuario {

    private String nome;
    private String login;
    private String cpf;
    private LocalDate dataDeNascimento;

    public Usuario(String nome, String login, String cpf, String dataDeNascimento){
        setNome(nome);
        setLogin(login);
        setCpf(cpf);
        setDataDeNascimento(dataDeNascimento);
        //usuario.insereUsuario(this);
    }

    public String getNome(){ return this.nome; }

    private void setNome(String nome){ this.nome = nome; }

    public String getLogin(){ return this.login; }

    private void setLogin(String login){
        if(loginInvalido(login)){
            throw new LoginInvalidoException(LOGIN_MENOR_QUE_TRES_CARACTERES);
        }

        this.login = login;
    }

    public boolean loginInvalido(String login){
        return login.length() < 3;
    }

    public String getCpf() { return this.cpf; }

    private void setCpf(String cpf){ this.cpf = cpf; }

    public LocalDate getDataDeNascimento(){ return this.dataDeNascimento; }

    private void setDataDeNascimento(String dataDeNascimento){ this.dataDeNascimento = ConverterStringLocalData(dataDeNascimento); }
}
