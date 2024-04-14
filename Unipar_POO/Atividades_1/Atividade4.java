public class ControleEstoque {
    public static void main(String[] args) {
     
        String nomeProdutoB = "Coca-cola";
        String tipoProdutoB = "Bebida";
        double precoProdutoB = 3.99;
        int quantidadeProdutoB = 15;
        
        String nomeProdutoA = "Macarrao";
        String tipoProdutoA = "Alimento";
        double precoProdutoA = 6.79;
        int quantidadeProdutoA = 6;
        
        String nomeProdutoH = "Sabonete";
        String tipoProdutoH = "Higiene";
        double precoProdutoH = 7.50;
        int quantidadeProdutoH = 9;
        
        System.out.println("Dados do Produto:");
        System.out.println("Nome: " + nomeProdutoA);
        System.out.println("Tipo: " + tipoProdutoA);
        System.out.println("Preco: R$" + precoProdutoA);
        System.out.println("Quantidade em estoque: " + quantidadeProdutoA);
        
        System.out.println("Dados do Produto:");
        System.out.println("Nome: " + nomeProdutoB);
        System.out.println("Tipo: " + tipoProdutoB);
        System.out.println("Preco: R$" + precoProdutoB);
        System.out.println("Quantidade em estoque: " + quantidadeProdutoB);
        
        System.out.println("Dados do Produto:");
        System.out.println("Nome: " + nomeProdutoH);
        System.out.println("Tipo: " + tipoProdutoH);
        System.out.println("Preco: R$" + precoProdutoH);
        System.out.println("Quantidade em estoque: " + quantidadeProdutoH);
    }
}
