package SOLID.Open_Closed_Principle;

public class Triangulo implements Forma{
    private double base;
    private double altura;

    public Triangulo(double altura, double base){
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}
