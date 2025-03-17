package SOLID.Liskov_Substitution_Principle;

public class Main {
    public static void main(String[] args) {
        Forma quadrodo = new Quadrado(3);
        Forma retangulo = new Retangulo(2,5);

        System.out.println(quadrodo.calcularArea());
        System.out.println(retangulo.calcularArea());
    }
}
