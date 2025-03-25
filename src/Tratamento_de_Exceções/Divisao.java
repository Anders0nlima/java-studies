package Tratamento_de_Exceções;

public class Divisao {

    public static int dividir(int a, int b){
        return a / b;
    }

    public static void main(String[] args) {
        try{
            int resultado = dividir(10, 0);
            System.out.println("Resultado: " + resultado);
        }catch (ArithmeticException exception){
            System.err.println("Erro: Não é possível dividir por zero");
        }finally {
            System.out.println("fim do cálculo!");
        }
    }
}
