import java.text.DecimalFormat;
import java.util.Scanner;

class exer5 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Escreva 1 numero");
        float valor1 = ler.nextFloat();
        System.out.println("Escreva 2 numero");
        float valor2 = ler.nextFloat();
        DecimalFormat df = new DecimalFormat("#.0");

        float divisaoTotal = (valor1 + valor2) / 2;
        float multiplicacaoTotal = valor1 * valor2;
        float somaTotal = valor1 + valor2;
        float diminuicaoTotal = valor1 - valor2;

        System.out.printf("Soma: %s\n", df.format(somaTotal));
        System.out.printf("Subtração: %s\n", df.format(diminuicaoTotal));
        System.out.printf("Multiplicação: %s\n", df.format(multiplicacaoTotal));
        System.out.printf("Divisão: %s\n", df.format(divisaoTotal));
    }
}
