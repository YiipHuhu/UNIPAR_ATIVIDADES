import java.util.Scanner;

class exer1 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Escreva 1 numero");
        float valor1 = ler.nextFloat();
        System.out.println("Escreva 2 numero");
        float valor2 = ler.nextFloat();
        System.out.println("Escreva 3 numero");
        float valor3 = ler.nextFloat();

        float somatotal = valor1+valor2+valor3;
        System.out.printf("O valor final é %f", somatotal);
    }
}
