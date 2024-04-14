package com.unipar.atividade7;

import com.unipar.atividade7.Produto;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto camisaDoGremio = new Produto(25, "Camisa do Gremio", 89.90, 23);

        System.out.println("Código do produto: " + camisaDoGremio.getCodigo());
        System.out.println("Descrição do produto: " + camisaDoGremio.getDescricao());
        System.out.println("Preço do produto: R$" + camisaDoGremio.getPreco());
        System.out.println("Quantidade em estoque: " + camisaDoGremio.getQuantidadeEmEstoque());

        camisaDoGremio.adicionarEstoque(5);
        camisaDoGremio.removerEstoque(3);

        System.out.println("Quantidade em estoque após atualizações: " + camisaDoGremio.getQuantidadeEmEstoque());
    }
}
