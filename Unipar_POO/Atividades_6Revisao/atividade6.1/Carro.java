public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;

    public Carro(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public void exibirInfo(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo do carro: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Cor: " + getCor());
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}

/*1 - Você deve criar uma classe em Java para representar um carro. A classe deve conter
atributos privados para armazenar a marca, o modelo, o ano e a cor do carro. Além disso,
você deve implementar métodos públicos para acessar e modificar esses atributos, garantindo
 o encapsulamento da classe. Por fim, crie um método para exibir as informações do carro.


Após criar a classe, crie objetos dessa classe e teste os métodos implementados, modificando e
exibindo as informações dos carros criados.

Lembre-se de utilizar o encapsulamento adequado para proteger os atributos da classe e garantir
 o acesso seguro aos mesmos através dos métodos públicos.
 */