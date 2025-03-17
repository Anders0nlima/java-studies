package SOLID.Liskov_Substitution_Principle;

public class Retangulo implements Forma{
    private int largura;
    private int altura;

    public Retangulo(int largura, int altura){
        this.altura = altura;
        this.largura = largura;

    }

    @Override
    public int calcularArea(){
        return largura * altura;
    }

}
