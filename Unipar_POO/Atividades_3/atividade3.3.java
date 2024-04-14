import java.util.Scanner;

class exer3 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Escreva 1 nota");
        float valor1 = ler.nextFloat();
        System.out.println("Escreva 2 nota");
        float valor2 = ler.nextFloat();


        float somatotal = (valor1+valor2)/2;
        System.out.printf("O nota final é %f", somatotal);
    }
}
