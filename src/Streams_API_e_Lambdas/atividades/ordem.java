package Streams_API_e_Lambdas.atividades;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ordem {
    public static void main(String[] args) {
        List<String> tamanho = Arrays.asList("Anderson", "Marcela", "Joao", "Fernanda", "Alice");
        List<String> decrescente = tamanho.stream().sorted(Comparator.comparingInt(String::length).reversed()).collect(Collectors.toList());
        System.out.println(decrescente);
    }
}
