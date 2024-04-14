import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o usuario");
        String user = ler.nextLine();
        String setuser = "usuario";
        System.out.println("Digite a senha");
        String senha = ler.nextLine();
        String setsenha = "senha123";

        if (user.equals(setuser) && senha.equals(setsenha)){
            System.out.printf("Login realizado");
        }
        else{
            System.out.printf("Senha ou usuario invalido");
        }
    }
}
