package Tratamento_de_Exceções.conta_bancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        try{
            conta.sacar(200.0);
        }catch (SaldoInsuficienteException e){
            System.err.println(e.getMessage());
        }
    }
}
//minha propria exception