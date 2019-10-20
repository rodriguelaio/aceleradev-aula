package br.com.aceleradev.main.segundasemana.Main;

import br.com.aceleradev.main.segundasemana.domain.Aluno;
import br.com.aceleradev.main.segundasemana.domain.Disciplina;
import br.com.aceleradev.main.segundasemana.domain.Professor;
import br.com.aceleradev.main.segundasemana.repositories.UsuarioRepository;

public class MainSistema {
    public static void main(String[] args) {
        UsuarioRepository usuario = new UsuarioRepository();
        Aluno aluno1 = new Aluno("Rodrigo",
                "rodriguelaio",
                "123.456.789-10",
                "06/09/1984",
                usuario);
        Aluno aluno2 = new Aluno("Amanda",
                "amandas",
                "111.222.333-44",
                "07/11/1988",
                usuario);
        Professor professor1 = new Professor("Girafales",
                "girafa",
                "109.876.543-21",
                "NaoSei",
                "10/10/1939",
                usuario);
        Professor professor2 = new Professor("Testando",
                "testa",
                "109.876.543-21",
                "NaoSei",
                "10/10/1949",
                usuario);
        Disciplina disciplina = new Disciplina("Matematica",
                professor1);

        disciplina.matricularAluno(aluno1);
        System.out.println(usuario.mediaDeIdade(aluno1.getClass()));

    }
}
