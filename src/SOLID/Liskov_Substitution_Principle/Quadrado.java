package SOLID.Liskov_Substitution_Principle;

public class Quadrado implements Forma{
    private int lado;

    public Quadrado(int lado){
        this.lado = lado;
    }

 @Override
   public int calcularArea(){
        return lado * lado;
 }
}
