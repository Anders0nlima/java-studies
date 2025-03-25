package Tratamento_de_Exceções.ler_arquivo_facil;


import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String caminhoArquivos = "C:/Intellij-project/java-studies/src/Tratamento_de_Exceções/ler_arquivo_facil/file.txt";

        try {
            Path caminhos = Path.of(caminhoArquivos);
            List<String> resultadoLista = Files.readAllLines(caminhos);

            String conteudo = String.join("\n", resultadoLista);
            System.out.println(conteudo);
        }catch (Exception e){
            System.err.println("Houve Algum Problema!");
        }
    }
}
