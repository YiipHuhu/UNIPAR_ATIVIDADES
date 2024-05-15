package com.UNIPAR.InterfaceJava.Sobreescrita;

public class Cachorro extends Animal {

    @Override
    public void fazerSom() {
        System.out.println("Au au!");
    }


    public static void main(String[] args) {
        Animal animal = new Cachorro();
        animal.fazerSom();
    }
}
