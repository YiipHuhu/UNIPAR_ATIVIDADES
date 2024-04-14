import java.util.Scanner;
import java.text.DecimalFormat;

class exer4 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Escreva 1 nota");
        float valor1 = ler.nextFloat();
        System.out.println("Escreva 2 nota");
        float valor2 = ler.nextFloat();
        System.out.println("Escreva 3 nota");
        float valor3 = ler.nextFloat();
        System.out.println("Escreva 4 nota");
        float valor4 = ler.nextFloat();
        DecimalFormat df = new DecimalFormat("#.0");
        float somatotal = (valor1+valor2+valor3+valor4)/4;
        System.out.printf("O nota final é %s ", df.format(somatotal));
        if (somatotal>=6){
            System.out.println("Você esta aprovado");
        }
        else{
            System.out.println("Você esta reprovado!");
        }
    }
}
