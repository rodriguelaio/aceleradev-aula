package br.com.aceleradev.main.segundasemana.domain;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Professor extends Usuario{

    private String sobrenome;

    public Professor(String nome, String login, String cpf, String sobrenome, String dataDeNascimento){
        super(nome, login, cpf, LocalDate.parse(dataDeNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        setSobrenome();
    }

    public void setSobrenome(){
        this.sobrenome = sobrenome;
    }

    public double mediadeIdade(){
        double totalIdades = 0;
        List<Professor> professores = usuario.getProfessores();
        totalIdades = professores.stream().mapToInt(professor -> (int) Year.now().getValue() - professor.getDataDeNascimento().getYear()).sum();
        return totalIdades / professores.size();
    }
}
