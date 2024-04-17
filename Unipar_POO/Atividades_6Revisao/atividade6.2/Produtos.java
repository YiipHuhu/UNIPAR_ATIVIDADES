public class Produtos {
    public static void main(String[] args) {
        Produto Banana = new Produto("Banana", 200, 3.99);

        Banana.exibirInfo();
        System.out.println("informação aumentando estoque");
        Banana.setEstoque(258);
        Banana.exibirInfo();

        Produto coca = new Produto("Coca-Cola", 76, 10.0);
        coca.exibirInfo();
    }
}
