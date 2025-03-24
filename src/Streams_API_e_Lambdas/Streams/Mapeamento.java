package Streams_API_e_Lambdas.Streams;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapeamento {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Anderson", "Danilo", "Pedro", "Iarley");
        List<Integer> tamanhos = palavras.stream().map(String::length).collect(Collectors.toList());

        System.out.println(tamanhos);
    }
}
