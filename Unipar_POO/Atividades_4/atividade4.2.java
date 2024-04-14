import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.printf("Digite um numero para saber se é par ou impar:");
        int num = ler.nextInt();
        int resultado = (num % 2);

        if (resultado == 0){
            System.out.printf("Par");
        }
        else{
            System.out.printf("Impar");
        }
    }
}
