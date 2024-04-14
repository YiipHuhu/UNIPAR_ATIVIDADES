import java.text.DecimalFormat;
import java.util.Scanner;

class exer6 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Escreva o nome do produto");
        String nome = ler.nextLine();
        System.out.println("Digite o valor do produto:");
        float valor = ler.nextFloat();
        System.out.println("Digite o valor do desconto:");
        float desc = ler.nextFloat();
        DecimalFormat df = new DecimalFormat("#.0");

        float calc = (valor*desc)/100;
        float desconto = valor - calc;

        System.out.printf("Com o desconto aplicado o(a) %s passa a custar: \n %s\n",nome, df.format(desconto));
    }
}
