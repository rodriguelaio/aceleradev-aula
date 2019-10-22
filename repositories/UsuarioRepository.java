package br.com.aceleradev.main.segundasemana.repositories;

import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import br.com.aceleradev.main.segundasemana.domain.Aluno;
import br.com.aceleradev.main.segundasemana.domain.Usuario;
import br.com.aceleradev.main.segundasemana.domain.Professor;
import br.com.aceleradev.main.segundasemana.domain.Disciplina;
import br.com.aceleradev.main.segundasemana.enums.TiposDeDisciplinas;

public class UsuarioRepository {
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Disciplina> disciplinas = new ArrayList<>();
    private Map<String, Integer> tiposDisciplinasXProfessores = new HashMap<String, Integer>();
    private Map<String, Integer> professoresXAlunos = new HashMap<>();

    public UsuarioRepository(){
        preencheDisciplinas();
    }

    protected void insereUsuario(Usuario usuario){
        usuarios.add(usuario);
        if(usuario instanceof Professor) adicionaProfessorXAluno((Professor) usuario);
    }

    protected void insereDisciplina(Disciplina disciplina){
        acumulaTipoDisciplina(disciplina.getTipoDisciplina());
        disciplinas.add(disciplina);
    }

    private void preencheDisciplinas(){
        for(int i = 0; i < TiposDeDisciplinas.values().length; i++){
//            disciplinas[i][0] = TiposDisciplinas.values()[i].getValor();
//            disciplinas[i][1] = 0;
            tiposDisciplinasXProfessores.put(TiposDeDisciplinas.values()[i].name(), 0);
        }
    }

    protected void adicionaProfessorXAluno(Professor professor){
        professoresXAlunos.put(professor.getNome(),0);
    }

    private void acumulaTipoDisciplina(TiposDeDisciplinas tiposDeDisciplinas){
//        disciplinas[Arrays.asList(disciplinas).indexOf(disciplina.getValor())][1]++;
        Integer indexTipoDisciplina = tiposDisciplinasXProfessores.get(tiposDeDisciplinas.name());
        tiposDisciplinasXProfessores.put(tiposDeDisciplinas.name(), (indexTipoDisciplina == null ? 0 : indexTipoDisciplina) + 1);
    }

    protected void mostraDisciplinas(){
//        for(int i = 0;i < disciplinas.length; i++){
//            System.out.println(disciplinas[i][0] + " - " + disciplinas[i][1]);
//        }
        tiposDisciplinasXProfessores.forEach((tippoDisciplinaXProfessor, contador) -> System.out.println(tippoDisciplinaXProfessor + " - " + contador));
    }

    protected void mostraTipoUsuarioEspecifico(Class instanciaTipoEspecifico){
        System.out.println(getListaUsuariosTipoEspecifico(instanciaTipoEspecifico));
    }

    protected List<Usuario> getListaUsuariosTipoEspecifico(Class instanciaTipoEspecifico){
        List<Usuario> usuariosTipoEspecifico = new ArrayList<>();
        usuarios.forEach(usuario -> {
            if(instanciaTipoEspecifico.isInstance(usuario))
                usuariosTipoEspecifico.add(usuario);
        });
        return usuariosTipoEspecifico;
    }

    protected double mediaDeIdade(Class instanciaTipoEspecifico){
        List<Usuario> usuariosTipoEspecifico = getListaUsuariosTipoEspecifico(instanciaTipoEspecifico);
        return calculaTotalIdades(usuariosTipoEspecifico) / usuariosTipoEspecifico.size();
    }

    private double calculaTotalIdades(List<Usuario> usuariosTipoEspecifico){
        return usuariosTipoEspecifico.stream().mapToInt(professor -> (int) ChronoUnit.YEARS.between(professor.getDataDeNascimento(),LocalDate.now())).sum();
    }

    protected void matriculaAluno(Disciplina disciplina, Professor professor, Aluno aluno){
        try {
            disciplina.matricularAluno(professor, aluno);
            acumulaProfessorXAluno(professor, aluno);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private void acumulaProfessorXAluno(Professor professor , Aluno aluno){
        Integer indexProfessorXAluno = professoresXAlunos.get(professor.getNome());
        professoresXAlunos.put(professor.getNome(), (indexProfessorXAluno == null ? 0 : indexProfessorXAluno) + 1);
    }

    protected void mostraQuantidadeAlunosPorProfessor(){
        professoresXAlunos.forEach((professor, contador) -> System.out.println(professor + " - " + contador));
    }

    public double mediaAnosCarreira(){
        List<Usuario> usuariosTipoEspecifico = getListaUsuariosTipoEspecifico(Professor.class);
        return calculaAnosCarreira(usuariosTipoEspecifico) / usuariosTipoEspecifico.size();
    }

    private double calculaAnosCarreira(List<Usuario> professores){
        return professores.stream().mapToInt(professor -> LocalDate.now().getYear() - ((Professor) professor).getAnoInicioCarreira()).sum();
    }
}
