package br.com.aceleradev.main.segundasemana.Main;

import br.com.aceleradev.main.segundasemana.domain.*;
import br.com.aceleradev.main.segundasemana.dataloader.DataLoader;
import br.com.aceleradev.main.segundasemana.enums.TiposDeDisciplinas;

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

        Aluno aluno3 = dataLoader.incluirAluno("Rosa",
                "rosinha",
                "999.999.999-99",
                "20/08/1945");

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

        Professor professor3 = dataLoader.incluirProfessor("Maria",
                "zinha",
                "109.876.543-21",
                "NaoSei",
                "10/10/1949");

        Professor professor4 = dataLoader.incluirProfessor("Joana",
                "jojo",
                "109.876.543-21",
                "NaoSei",
                "10/10/1949");

        Disciplina disciplina1 = dataLoader.incluirDisciplina("Matematica",
                TiposDeDisciplinas.EXATAS,
                professor1);

        Disciplina disciplina2 = dataLoader.incluirDisciplina("Ciencia da Computacao",
                TiposDeDisciplinas.EXATAS,
                professor1);

        Disciplina disciplina3 = dataLoader.incluirDisciplina("Historia",
                TiposDeDisciplinas.HUMANAS,
                professor2);

        Disciplina disciplina4 = dataLoader.incluirDisciplina("Fisica",
                TiposDeDisciplinas.EXATAS,
                professor3);

        Disciplina disciplina5 = dataLoader.incluirDisciplina("Quimica",
                TiposDeDisciplinas.EXATAS,
                professor3);

        Disciplina disciplina6 = dataLoader.incluirDisciplina("Biologia",
                TiposDeDisciplinas.BIOLOGICAS,
                professor4);

        Disciplina disciplina7 = dataLoader.incluirDisciplina("Bioquimica",
                TiposDeDisciplinas.BIOLOGICAS,
                professor4);

        dataLoader.matriculaAluno(disciplina1, professor1, aluno1);
        dataLoader.matriculaAluno(disciplina2, professor1, aluno3);
        dataLoader.matriculaAluno(disciplina6, professor4, aluno1);
        dataLoader.matriculaAluno(disciplina7, professor4, aluno2);
        dataLoader.matriculaAluno(disciplina6, professor4, aluno2);

        System.out.println(dataLoader.mediaDeIdade(aluno1.getClass()));
        System.out.println(dataLoader.mediaDeIdade(professor1.getClass()));
        dataLoader.mostraDisciplinas();
        dataLoader.mostraQuantidadeAlunosPorProfessor();

    }
}
