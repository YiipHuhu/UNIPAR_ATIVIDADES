public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public int getEstoque() {
        return estoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double newPreco) {
        if (newPreco > 0) {
            this.preco = newPreco;
        } else {
            System.out.println("Preço inválido!");
        }
    }

    public void setEstoque(int newEstoque) {

        if (newEstoque > 0) {
            this.estoque += newEstoque;
        } else {
            System.out.println("Valor inválido!");
        }
    }

    public void produtosCadastrados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: R$" + getPreco());
        System.out.println("Estoque: " + getEstoque());
    }
}



/*
3 - Você deve implementar um programa em Java para gerenciar o estoque de uma loja. Para isso, crie uma classe **`Produto`**
que representará os produtos disponíveis na loja. Esta classe deve possuir atributos privados para armazenar o nome, o preço
e a quantidade em estoque do produto.

Em seguida, implemente métodos públicos na classe **`Produto`** para acessar e modificar esses atributos, garantindo o
 encapsulamento adequado da classe.

Após criar a classe **`Produto`**, desenvolva um programa principal que permita ao usuário realizar as seguintes operações:

1. Adicionar um novo produto ao estoque, fornecendo o nome, o preço e a quantidade em estoque.
2. Atualizar o preço ou a quantidade em estoque de um produto existente.
3. Exibir os detalhes de um produto específico, incluindo seu nome, preço e quantidade em estoque.

Certifique-se de utilizar o encapsulamento de forma correta na classe **`Produto`**, protegendo os atributos da classe e
garantindo o acesso seguro a eles através dos métodos públicos disponibilizados.
 */