package br.com.aceleradev.main.segundasemana.Main;

import br.com.aceleradev.main.segundasemana.dataloader.DataLoader;
import br.com.aceleradev.main.segundasemana.domain.*;

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

        Professor professor2 = dataLoader.incluirProfessor("Testando",
                "testa",
                "109.876.543-21",
                "NaoSei",
                "10/10/1949");

        Disciplina disciplina1 = dataLoader.incluirDisciplina("Matematica",
                professor1);

        disciplina1.matricularAluno(aluno1);

        System.out.println(dataLoader.usuario.mediaDeIdade(aluno1.getClass()));
        System.out.println(dataLoader.usuario.mediaDeIdade(professor1.getClass()));

    }
}
