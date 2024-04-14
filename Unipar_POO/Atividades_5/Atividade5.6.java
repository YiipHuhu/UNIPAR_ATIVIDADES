import java.util.Scanner;

public class ContaBancaria {

    private double saldo;
    private String numeroConta;
    Scanner sc = new Scanner(System.in);

    public ContaBancaria(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }


    public void depositar(double valor) {
        System.out.println("Informe o valor que deseja despositar: ");
        valor = sc.nextDouble();
        if (valor <= 0) {
            System.out.println("Valor precisa ser maior que zero (0): ");
            return;
        } else {
            saldo += valor;
            System.out.println("O valor de :" + valor + " foi adicionado a sua carteira, seu saldo atual é de:" + saldo);
        }
    }

    public void sacar(double valor) {
        System.out.println("Informe o valor que deseja Sacar: ");
        valor = sc.nextDouble();
        if (valor <= 0) {
            System.out.println("Valor de saque precisa ser maior que zero (0): ");
            return;
        } else {
            saldo -= valor;
            System.out.println("O valor de :" + valor + " foi sacado da sua carteira, seu saldo atual é de:" + saldo);
        }
    }

    public void consultarSaldo() {
        System.out.println("Voce possui: R$" + saldo + " em sua carteira");
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
