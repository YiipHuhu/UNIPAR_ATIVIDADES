package br.unipar;

public class main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(1000d);

        System.out.println("Saldo é: " + contaCorrente.obterSaldo());
        System.out.println("Numero da conta é: " + contaCorrente.retornarNumeroConta());
    }
}
