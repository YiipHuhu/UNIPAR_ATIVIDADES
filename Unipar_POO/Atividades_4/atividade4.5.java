package br.unipar.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int opcao = 0;
        String menu = """
                *************
                1 - Calculadora de multiplicação
                2 - 
                3 - 
                4 - Sair
                *************
                Digite a opção
                """;

        while (opcao != 4) {
            System.out.println(menu);
            Scanner sc = new Scanner(System.in);
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Qual numero deseja multiplicar?");
                    double num = 0;
                    num = sc.nextDouble();
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(i + " X " + num + " :" + (num * i));
                    }

                case 2:
                    System.out.println("vc é ");

                case 3:
                    System.out.println("vc é ");

                case 4:
                    System.out.println("Saindo...");

                default:
                    System.out.println("Invalido");
                    return;
            }
        }
    }
}
