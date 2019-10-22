package br.com.aceleradev.main.segundasemana.dataloader;

import br.com.aceleradev.main.segundasemana.domain.*;
import br.com.aceleradev.main.segundasemana.enums.TiposDeDisciplinas;
import br.com.aceleradev.main.segundasemana.repositories.UsuarioRepository;

public class DataLoader extends UsuarioRepository {
    //public UsuarioRepository repositorio = new UsuarioRepository();

    public Aluno incluirAluno(String nome, String login, String cpf, String dataDeNascimento){
        Aluno aluno = new Aluno(nome, login, cpf, dataDeNascimento);
        insereUsuario(aluno);
        return aluno;
    }

    public Professor incluirProfessor(String nome, String login, String cpf, String sobrenome, String dataDeNascimento, int anoInicioCarreira){
        Professor professor =  new Professor(nome, login, cpf, sobrenome, dataDeNascimento, anoInicioCarreira);
        insereUsuario(professor);
        return professor;
    }

    public Disciplina incluirDisciplina(String nome, TiposDeDisciplinas tiposDeDisciplinas, Professor professor){
        Disciplina disciplina = new Disciplina(nome, tiposDeDisciplinas, professor);
        insereDisciplina(disciplina);
        return disciplina;
    }

    public void mostraDisciplinas(){
        super.mostraDisciplinas();
    }

    public double mediaDeIdade(Class instanciaTipoEspecifico){
        return super.mediaDeIdade(instanciaTipoEspecifico);
    }

    public void matriculaAluno(Disciplina disciplina, Professor professor, Aluno aluno){
        super.matriculaAluno(disciplina, professor, aluno);
    }

    public void mostraQuantidadeAlunosPorProfessor(){
        super.mostraQuantidadeAlunosPorProfessor();
    }

    public double mediaAnosCarreira(){
        return super.mediaAnosCarreira();
    }
}
