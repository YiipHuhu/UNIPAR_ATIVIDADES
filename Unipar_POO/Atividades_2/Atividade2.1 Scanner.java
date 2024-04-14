import java.util.Scanner;

public class Scannertest {
    public static void main(String[] args) {
     
        System.out.println("Escreva seu nome:");
        Scanner leia = new Scanner(System.in);
        String nome = leia.nextLine();//para frases utiliza nextLine(); para palavras next();
        System.out.println("Escreva sua idade:");
        int idade = leia.nextInt(); //nextInt() / nextDouble() / nextChar()
        
        System.out.println("Seu nome e: "+ nome + " e sua idade: " +idade);
        
        leia.close()
    }
}
