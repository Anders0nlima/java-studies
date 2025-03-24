package Streams_API_e_Lambdas.atividades;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filtragem {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(11, 25, 80, 8, 2, 1, 9, 40, 3);
        List<Integer> maiores = numeros.stream().filter(n -> n > 10).collect(Collectors.toList());
        System.out.println(maiores);
    }
}
