import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o primeiro numero para saber qual deles é maior");
        int num1 = ler.nextInt();
        System.out.println("Digite o segundo numero para saber qual deles é maior");
        int num2 = ler.nextInt();

        if (num1>num2) {
            System.out.printf("Numero "+num1+"é maior");
        } else {
            System.out.printf("Numero %s é maior",num2);
        }
    }
}
