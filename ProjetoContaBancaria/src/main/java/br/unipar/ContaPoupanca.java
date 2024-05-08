package br.unipar;

public class ContaPoupanca extends HerancaContaBancaria{

    private final Double Taxa = 5.0;
    @Override
    public boolean saque(Double valor) {

        if((saldo - Taxa)  >= valor){
            saldo -= valor;
            saldo -= 5;
            return true;
        }
        return false;
    }
}
