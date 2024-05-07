package br.unipar.teste;

import br.unipar.interfaces.InterfaceAnimais;

public class cachorro implements InterfaceAnimais {
    @Override
    public String emitirSom(){
        return "auau";
    }
    @Override
    public void correr(){

    }
    @Override
    public void alimentacao(){

    }
}
