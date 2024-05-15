package com.UNIPAR.InterfaceJava.Sobrecarga;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int somaInteiros = calculadora.somar(5, 3);
        System.out.println("Soma de inteiros: " + somaInteiros);

        double somaDoubles = calculadora.somar(5.5, 3.2);
        System.out.println("Soma de doubles: " + somaDoubles);

    }
}
