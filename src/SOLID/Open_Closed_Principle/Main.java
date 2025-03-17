package SOLID.Open_Closed_Principle;

public class Main {
    public static void main(String[] args) {
        Forma quadrado = new Quadrado(5);
        Forma circulo = new Circulo(3);
        Forma triangulo = new Triangulo(5, 6);

        System.out.println("Área do quadrado: " + quadrado.calcularArea());
        System.out.println("Área do circulo: " + circulo.calcularArea());
        System.out.println("Área do triangulo: " + triangulo.calcularArea());

    }
}
