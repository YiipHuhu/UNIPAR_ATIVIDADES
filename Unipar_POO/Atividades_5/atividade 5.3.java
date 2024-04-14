import java.time.LocalDate;
import java.time.temporal.ChronoUnit; //util para calcular tempo, mas tambem pode ser utilizado Period no lugar de ChronoUnit
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua data de aniversário (aaaa-mm-dd): ");
        String dataNascimentoStr = sc.nextLine();
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr);
        LocalDate dataAtual = LocalDate.now();
        long diasVividos = ChronoUnit.DAYS.between(dataNascimento, dataAtual); //compara os dias entre a entrada e o dia de hoje
        long anosVividos = (diasVividos/365); //convertendo as unidades
        long mesesVididos = (anosVividos*12);
        System.out.println("Você está vivo há " + diasVividos + " dias.");
        System.out.println(anosVividos+ " anos ou " + mesesVididos+ " meses.");
    }
}
