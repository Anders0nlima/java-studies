package VerificadorIdade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual a sua idade? ");
        int idade = scanner.nextInt();
        int maiorIdade = 18;

        if(idade < maiorIdade){
            System.out.println("você é menor de idade!");
        } else
            System.out.println("você é maior de idade!");
    }
}
