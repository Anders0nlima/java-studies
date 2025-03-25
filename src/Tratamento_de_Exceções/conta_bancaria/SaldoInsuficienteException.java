package Tratamento_de_Exceções.conta_bancaria;

public class SaldoInsuficienteException extends Throwable {
    public SaldoInsuficienteException(String mensage){
        super(mensage);
    }
}
