import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número inicial de patinhos: ");
        int numeroPatinhos = sc.nextInt();
        int totalPatinhos = numeroPatinhos;

        while (numeroPatinhos > 1) {
            System.out.println(numeroPatinhos + " patinhos foram passear");
            System.out.println("Além das montanhas \nPara brincar \n");

            System.out.println("A mamãe gritou: Quá, quá, quá, quá");
            System.out.println("Mas só " + (numeroPatinhos - 1) + " patinhos voltaram de lá \n");

            numeroPatinhos--;
        }

        System.out.println("A mamãe patinha foi procurar");
        System.out.println("Além das montanhas");
        System.out.println("Na beira do mar \n");

        System.out.println("A mamãe gritou: Quá, quá, quá, quá");
        System.out.println("E os " + totalPatinhos + " patinhos voltaram de lá");
    }
}
