package Streams_API_e_Lambdas.Streams;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ordenacao {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("stream", "java", "api", "lambda");
        List<String> ordenacao = palavras.stream().sorted().collect(Collectors.toList());
        System.out.println(ordenacao);

    }
}
