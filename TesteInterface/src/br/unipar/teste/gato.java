package br.unipar.teste;

import br.unipar.interfaces.InterfaceAnimais;

public class gato implements InterfaceAnimais {
    @Override
    public String emitirSom(){
        return "miau miau";
    }
    @Override
    public void correr(){

    }
    @Override
    public void alimentacao(){

    }
}
