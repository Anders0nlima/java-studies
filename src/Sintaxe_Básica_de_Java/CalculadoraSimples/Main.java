package Sintaxe_Básica_de_Java.CalculadoraSimples;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.println("digite o segundo número: ");
        int num2 = scanner.nextInt();

        int ad = (num1 + num2);
        int su = (num1 - num2);
        int di = (num1 / num2);
        int mu = (num1 * num2);

        System.out.println("Resultado: ");
        System.out.println("adição: " + ad);
        System.out.println("subtração: " + su);
        System.out.println("divisão: " + di);
        System.out.println("multiplicação: " + mu);
    }
}
