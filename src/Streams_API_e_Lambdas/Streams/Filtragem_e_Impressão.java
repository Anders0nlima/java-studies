package Streams_API_e_Lambdas.Streams;


import java.util.Arrays;
import java.util.List;

public class Filtragem_e_Impressão {
    public static void main(String[] args) {
        List<Integer> numero = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numero.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}
