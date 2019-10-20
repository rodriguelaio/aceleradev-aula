package br.com.aceleradev.main.segundasemana.repositories;

import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.ArrayList;

import br.com.aceleradev.main.segundasemana.domain.Professor;
import br.com.aceleradev.main.segundasemana.domain.Usuario;

public class UsuarioRepository {
    private List<Usuario> usuarios = new ArrayList<>();

    public void insereUsuario(Usuario usuario){
        usuarios.add(usuario);
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
        return usuariosTipoEspecifico.stream().mapToInt(professor -> (int) ChronoUnit.YEARS.between(LocalDate.now(),professor.getDataDeNascimento())).sum();
    }

    private int calculaMediadeIdade(List<Usuario> usuariosTipoEspecifico){
        return calculaTotalIdades(usuariosTipoEspecifico) / usuariosTipoEspecifico.size();
    }
}
