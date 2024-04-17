public class Produto {
    private String nome;
    private int estoque;
    private double preco;


    public Produto(String nome, int estoque, double preco) {
        this.nome = nome;
        this.estoque = estoque;
        this.preco = preco;

    }

    public void exibirInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("Estoque: " + getEstoque());
        System.out.println("Preço: R$" + getPreco());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

/*1 2 - Desenvolva uma classe em Java para representar um objeto do tipo Produto. Essa classe deve possuir atributos
 privados para armazenar o nome, o preço e a quantidade em estoque do produto. Implemente métodos públicos para acessar
 e modificar esses atributos, garantindo o encapsulamento adequado da classe.

Após criar a classe Produto, crie objetos dessa classe e teste os métodos implementados, modificando e exibindo as
informações dos produtos criados.

Certifique-se de utilizar o encapsulamento de forma correta, protegendo os atributos da classe e garantindo o acesso
seguro a eles através dos métodos públicos disponibilizados.
 */