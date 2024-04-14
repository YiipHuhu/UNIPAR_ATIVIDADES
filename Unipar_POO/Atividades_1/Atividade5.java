public class ControleEstoque {
    public static void main(String[] args) {
     
        String nomeProdutoB = "Samsung S24 Ultra";
        String marcaProdutoB = "Samsung";
        double precoProdutoB = 8459.39;
        int quantidadeProdutoB = 15;
        
        String nomeProdutoA = "Notebook Acer Nitro 5";
        String marcaProdutoA = "ACER";
        double precoProdutoA = 4569.90;
        int quantidadeProdutoA = 6;
        
        String nomeProdutoH = "Fone QCY HT07";
        String marcaProdutoH = "QCY";
        double precoProdutoH = 257.90;
        int quantidadeProdutoH = 9;
        
        System.out.println("Dados do Produto:");
        System.out.println("Nome: " + nomeProdutoA);
        System.out.println("marca: " + marcaProdutoA);
        System.out.println("Preco: R$" + precoProdutoA);
        System.out.println("Quantidade em estoque: " + quantidadeProdutoA);
        
        System.out.println("Dados do Produto:");
        System.out.println("Nome: " + nomeProdutoB);
        System.out.println("marca: " + marcaProdutoB);
        System.out.println("Preco: R$" + precoProdutoB);
        System.out.println("Quantidade em estoque: " + quantidadeProdutoB);
        
        System.out.println("Dados do Produto:");
        System.out.println("Nome: " + nomeProdutoH);
        System.out.println("marca: " + marcaProdutoH);
        System.out.println("Preco: R$" + precoProdutoH);
        System.out.println("Quantidade em estoque: " + quantidadeProdutoH);
    }
}
