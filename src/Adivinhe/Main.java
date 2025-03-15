package Adivinhe;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int escolhido = random.nextInt(100) + 1;
        int numero;

        do{
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();

            if(numero == escolhido){
                System.out.println("você acertou!");
            } else if (numero > escolhido){
                System.out.println("O número é menor, tente novamente!");
            } else{
                System.out.println("O número é maior, tente novamente!");
            }

        }while (numero != escolhido);

        scanner.close();
    }
}
