package br.com.aceleradev.main.segundasemana.exception;

public class LoginInvalidoException extends RuntimeException{
    public LoginInvalidoException(String msg){
        super(msg);
    }
}
