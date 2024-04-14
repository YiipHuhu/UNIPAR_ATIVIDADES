package br.unipar.main;

import java.util.Scanner;

public class ExemploPraticoRepeticao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] salarios = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("informe seu salario:");
            salarios[i] = sc.nextDouble();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(salarios[i]);
        }
    }
}
