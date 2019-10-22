package br.com.aceleradev.main.segundasemana.enums;

public enum TiposDeDisciplinas {
    BIOLOGICAS(1), EXATAS(2), HUMANAS(3);

    private int valor;

    TiposDeDisciplinas(int valor){
        this.valor = valor;
    }

    public int getValor(){
        return this.valor;
    }
}
