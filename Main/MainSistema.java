package br.com.aceleradev.main.segundasemana.Main;

import br.com.aceleradev.main.segundasemana.domain.Aluno;
import br.com.aceleradev.main.segundasemana.domain.Disciplina;
import br.com.aceleradev.main.segundasemana.domain.Professor;

public class MainSistema {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Rodrigo", "rodriguelaio", "123.456.789-10");
        Professor professor = new Professor("Girafales", "girafa", "109.876.543-21", "NaoSei");
        Disciplina discplina = new Disciplina("Matematica", professor);
        discplina.matricularAluno(aluno);

    }
}
