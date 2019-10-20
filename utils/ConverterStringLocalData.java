package br.com.aceleradev.main.segundasemana.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class ConverterStringLocalData {
    public static LocalDate ConverterStringLocalData(String dataDeNascimento){
        return LocalDate.parse(dataDeNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
