package Streams_API_e_Lambdas.Streams;


import java.util.Arrays;
import java.util.List;

public class Reducao {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        int soma = numeros.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Soma " + soma);
    }
}


//  essa é a função lambda (a, b) -> a + b
// (a, b) -> a + b