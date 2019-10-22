package br.com.aceleradev.main.segundasemana.domain;

public class Professor extends Usuario{

    private String sobrenome;
    private int anoInicioCarreira;

    public Professor(String nome, String login, String cpf, String sobrenome, String dataDeNascimento, int anoInicioCarreira){
        super(nome, login, cpf, dataDeNascimento);
        setSobrenome();
        setAnoInicioCarreira(anoInicioCarreira);
    }

    public void setSobrenome(){
        this.sobrenome = sobrenome;
    }

    public String getSobrenome(){ return this.sobrenome; }

    public void setAnoInicioCarreira(int anoInicioCarreira){ this.anoInicioCarreira = anoInicioCarreira; }

    public int getAnoInicioCarreira(){ return this.anoInicioCarreira; }
}
