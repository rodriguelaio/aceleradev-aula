package br.com.aceleradev.main.segundasemana.repositories;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

import br.com.aceleradev.main.segundasemana.domain.Disciplina;
import br.com.aceleradev.main.segundasemana.domain.Usuario;
import br.com.aceleradev.main.segundasemana.enums.TiposDeDisciplinas;

public class UsuarioRepository {
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Disciplina> disciplinas = new ArrayList<>();
    Map<String, Integer> tiposDisciplinasXProfessores = new HashMap<String, Integer>();

    public UsuarioRepository(){
        preencheDisciplinas();
    }

    public void insereUsuario(Usuario usuario){ usuarios.add(usuario); }

    public void insereDisciplina(Disciplina disciplina, TiposDeDisciplinas tipoDeDisciplina){
        acumularTipoDisciplina(tipoDeDisciplina);
        disciplinas.add(disciplina);
    }

    private void preencheDisciplinas(){
        for(int i = 0; i < TiposDeDisciplinas.values().length; i++){
//            disciplinas[i][0] = TiposDisciplinas.values()[i].getValor();
//            disciplinas[i][1] = 0;
            tiposDisciplinasXProfessores.put(TiposDeDisciplinas.values()[i].name(), 0);
        }
    }

    private void acumularTipoDisciplina(TiposDeDisciplinas tiposDeDisciplinas){
//        disciplinas[Arrays.asList(disciplinas).indexOf(disciplina.getValor())][1]++;
        tiposDisciplinasXProfessores.put(tiposDeDisciplinas.name(), tiposDisciplinasXProfessores.get(tiposDeDisciplinas.name()) + 1);
    }

    public void mostraDisciplinas(){
//        for(int i = 0;i < disciplinas.length; i++){
//            System.out.println(disciplinas[i][0] + " - " + disciplinas[i][1]);
//        }
        tiposDisciplinasXProfessores.forEach((tippoDisciplinaXProfessor, contador) -> System.out.println(tippoDisciplinaXProfessor + " - " + contador));
    }

    public void mostraTipoUsuarioEspecifico(Class instanciaTipoEspecifico){
        System.out.println(getListaUsuariosTipoEspecifico(instanciaTipoEspecifico));
    }

    public List<Usuario> getListaUsuariosTipoEspecifico(Class instanciaTipoEspecifico){
        List<Usuario> usuariosTipoEspecifico = new ArrayList<>();
        usuarios.forEach(usuario -> {
            if(instanciaTipoEspecifico.isInstance(usuario))
                usuariosTipoEspecifico.add(usuario);
        });
        return usuariosTipoEspecifico;
    }

    public double mediaDeIdade(Class instanciaTipoEspecifico){
        List<Usuario> usuariosTipoEspecifico = getListaUsuariosTipoEspecifico(instanciaTipoEspecifico);
        calculaTotalIdades(usuariosTipoEspecifico);
        return calculaMediadeIdade(usuariosTipoEspecifico);
    }

    private int calculaTotalIdades(List<Usuario> usuariosTipoEspecifico){
        return usuariosTipoEspecifico.stream().mapToInt(professor -> (int) ChronoUnit.YEARS.between(professor.getDataDeNascimento(),LocalDate.now())).sum();
    }

    private int calculaMediadeIdade(List<Usuario> usuariosTipoEspecifico){
        return calculaTotalIdades(usuariosTipoEspecifico) / usuariosTipoEspecifico.size();
    }
}
