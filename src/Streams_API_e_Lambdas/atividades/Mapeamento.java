package Streams_API_e_Lambdas.atividades;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapeamento {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Anderson", "Marcelo", "Gustavo");
        List<String> maiusculas = palavras.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(maiusculas);
    }
}
