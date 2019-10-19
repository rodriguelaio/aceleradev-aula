package br.com.aceleradev.main.segundasemana.repositories;

import br.com.aceleradev.main.segundasemana.domain.Aluno;
import br.com.aceleradev.main.segundasemana.domain.Professor;
import br.com.aceleradev.main.segundasemana.domain.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuarioRepository {
    private List<Usuario> usuarios = new ArrayList<>();

    public void insereUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public void mostraProfessor(){
        usuarios.forEach(usuario -> {
            if(usuario instanceof Professor)
                System.out.println(usuario);
        });
    }

    public void mostraAluno(){
        usuarios.forEach(usuario -> {
            if(usuario instanceof Aluno)
                System.out.println(usuario);
        });
    }

    public List<Professor> getProfessores(){
        List<Professor> professores = new ArrayList<>();
        usuarios.forEach(usuario -> {
            if(usuario instanceof Professor)
                professores.add((Professor) usuario);
        });
        return professores;
    }

    public List<Aluno> getAlunos(){
        List<Aluno> alunos = new ArrayList<>();
        usuarios.forEach(usuario -> {
            if(usuario instanceof Aluno)
                alunos.add((Aluno) usuario);
        });
        return alunos;
    }
}
