package Streams_API_e_Lambdas.atividades;

import java.util.Arrays;
import java.util.List;

public class reducao {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        int produto = numeros.stream().reduce(1, (a, b) -> a*b);
        System.out.println(produto);
    }
}
