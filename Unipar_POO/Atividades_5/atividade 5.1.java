public class Main {
    public static void main(String[] args) {

        System.out.println("Se o número for divisível por 3, ira exibir 'Fizz', se for divisível por 5," +
                " ira aparecer 'Buzz'. Se for divisível por ambos, ira exibir 'FizzBuzz'");

        for (int i = 0; i <= 50; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                if (i != 0) {
                    System.out.println(i + ": FizzBuzz");
                }
            } else if (i % 3 == 0) {
                System.out.println(i + ": Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + ": Buzz");
            }
        }
    }
}
