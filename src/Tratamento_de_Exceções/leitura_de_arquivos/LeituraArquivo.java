package Tratamento_de_Exceções.leitura_de_arquivos;

import java.io.FileReader;
import java.io.IOException;

public class LeituraArquivo {
    public static void lerArquivo(String caminho) throws IOException{
        FileReader reader = new FileReader(caminho);
        reader.close();
    }

    public static void main(String[] args) {
        try{
            lerArquivo("arquivo.txt");
        } catch (IOException e){
            System.err.println("Erro ao ler arquivo: " + e.getMessage());
        }
    }
}
