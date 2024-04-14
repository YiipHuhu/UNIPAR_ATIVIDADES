import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 20 numeros, apos isso o programa ira dividir eles entre 0 a 100, 101 a 200, e acima de 200");
        int[] num = new int[20];
        int maior200 = 0;
        int entre200e101 = 0;
        int abaixo100 = 0;

        for (int i = 0; i < 20; i++) {
            System.out.printf("Valor " + (i+1) + ": ");
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < 20; i++) {
            if (num[i] > 200) {
                maior200++;
            } else if (num[i] <= 200 && num[i] > 100) {
                entre200e101++;
            } else if (num[i] >= 0 && num[i] <= 100) {
                abaixo100++;
            }
        }
        System.out.println(abaixo100 + " estão entre 0 e 100");
        System.out.println(entre200e101 + " estão entre 101 e 200");
        System.out.println(maior200 + " são maiores de 200");
        sc.close();
    }
}
