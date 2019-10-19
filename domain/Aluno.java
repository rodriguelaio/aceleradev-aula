package br.com.aceleradev.main.segundasemana.domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Aluno extends Usuario{
    public Aluno(String nome, String login, String cpf, String dataDeNascimento){
        super(nome, login, cpf, LocalDate.parse(dataDeNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

}
