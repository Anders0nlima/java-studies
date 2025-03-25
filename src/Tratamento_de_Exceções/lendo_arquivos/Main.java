package Tratamento_de_Exceções.lendo_arquivos;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception{
        String caminhoArquivo = "C:/Intellij-project/java-studies/src/Tratamento_de_Exceções/lendo_arquivos/usuarios.txt";
        BufferedReader leitor = null;
        try{
            FileReader leitorArquivo = new FileReader(caminhoArquivo);
            leitor = new BufferedReader(leitorArquivo);

            String linha = leitor.readLine();

            while (linha != null){
                System.out.println(linha);
                linha = leitor.readLine();
            }

        }catch (Exception e){
            System.err.println("O arquivo não pode ser lido! " + e.getMessage());
        }finally {
            if(leitor != null){
                leitor.close();
            }
        }

    }
}
