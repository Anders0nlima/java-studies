package Tratamento_de_Exceções.conta_bancaria;

public class ContaBancaria {
    private double saldo = 100.0;

    public void sacar(double valor) throws SaldoInsuficienteException {
        if(valor > saldo){
            throw new SaldoInsuficienteException("Saldo insufifiente para saque de " + valor);
        }
        saldo -= valor;
    }
}

