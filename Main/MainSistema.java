package br.com.aceleradev.main.segundasemana.Main;

import br.com.aceleradev.main.segundasemana.dataloader.DataLoader;
import br.com.aceleradev.main.segundasemana.domain.*;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class MainSistema {
    public static void main(String[] args) {

        DataLoader dataLoader = new DataLoader();

        Aluno aluno1 = dataLoader.incluirAluno("Rodrigo",
                "rodriguelaio",
                "123.456.789-10",
                "06/09/1984");

        Aluno aluno2 = dataLoader.incluirAluno("Amanda",
                "amandas",
                "111.222.333-44",
                "07/11/1988");

        Professor professor1 = dataLoader.incluirProfessor("Girafales",
                "girafa",
                "109.876.543-21",
                "NaoSei",
                "10/10/1939");

        Professor professor2 = dataLoader.incluirProfessor("Jose",
                "zezinho",
                "111.111.111-11",
                "NaoSei",
                "10/10/1949");

        Professor professor3 = dataLoader.incluirProfessor("Testando",
                "testa",
                "109.876.543-21",
                "NaoSei",
                "10/10/1949");

        Professor professor4 = dataLoader.incluirProfessor("Testando",
                "testa",
                "109.876.543-21",
                "NaoSei",
                "10/10/1949");

        Disciplina disciplina1 = dataLoader.incluirDisciplina("Matematica",
                professor1);

        Disciplina disciplina2 = dataLoader.incluirDisciplina("Ciencia da Computacao",
                professor1);

        Disciplina disciplina3 = dataLoader.incluirDisciplina("Historia",
                professor2);

        Disciplina disciplina4 = dataLoader.incluirDisciplina("Fisica",
                professor3);

        Disciplina disciplina5 = dataLoader.incluirDisciplina("Quimica",
                professor3);

        Disciplina disciplina6 = dataLoader.incluirDisciplina("Biologia",
                professor4);

        Disciplina disciplina7 = dataLoader.incluirDisciplina("Bioquimica",
                professor4);

        disciplina1.matricularAluno(aluno1);

        System.out.println(dataLoader.usuario.mediaDeIdade(aluno1.getClass()));
        System.out.println(dataLoader.usuario.mediaDeIdade(professor1.getClass()));

    }
}
