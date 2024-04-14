import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.printf("Digite sua idade:");
        int idade = ler.nextInt();

        if (idade >= 18){
            System.out.printf("Voce é maior de idade");
        }
        else{
            System.out.printf("Voce é menor de idade");
        }
    }
}
