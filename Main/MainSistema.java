package br.com.aceleradev.main.segundasemana.Main;

import br.com.aceleradev.main.segundasemana.domain.Aluno;
import br.com.aceleradev.main.segundasemana.domain.Disciplina;
import br.com.aceleradev.main.segundasemana.domain.Professor;

public class MainSistema {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Rodrigo",
                "rodriguelaio",
                "123.456.789-10",
                "06/09/1984");
        Professor professor1 = new Professor("Girafales",
                "girafa",
                "109.876.543-21",
                "NaoSei",
                "10/10/1939");
        Professor professor2 = new Professor("Testando",
                "testa",
                "109.876.543-21",
                "NaoSei",
                "10/10/1949");
        Disciplina disciplina = new Disciplina("Matematica",
                professor1);

        disciplina.matricularAluno(aluno);
        System.out.println(professor1.mediadeIdade());

    }
}
