import java.util.Scanner;

public class Produtos {
    private static Produto[] produtos;
    public static void main(String[] args) {
        produtos = new Produto[0];

        String menu = """
                -----------------------------
                ------------Menu-------------
                1 - Adicionar novos produtos
                2 - Editar dados de estoque
                3 - Editar preço do produto
                4 - Exibir Produtos
                -----------------------------
                -----------------------------
                Escolha uma das opções:
                """;
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.print(menu);
            opcao = sc.nextInt();
            sc.nextLine(); //se nao colocar isso, por algum motivo ele pula o proximo input como se tivesse sido preenchido.
            switch (opcao){
                case 1 :
                    addProduto(sc);
                    break;
                case 2 :
                    editarEstoque(sc);
                    break;
                case 3 :
                    editarPreco(sc);
                    break;
                case 4 :
                    exibirLista();
                    break;

            }
        }
        while (opcao !=5);
        sc.close();
    }
    private static void addProduto(Scanner sc){
        System.out.print("Digite o nome do produto: ");
        String nome = sc.nextLine();

        System.out.print("Preço do produto: R$");
        double preco = sc.nextDouble();

        System.out.print("Digite o valor de estoque: ");
        int estoque = sc.nextInt();

        Produto newProduto = new Produto(nome, preco, estoque);
        produtos = addProduto(produtos, newProduto);
        System.out.println("Produto adicionado");
    }
    // quando criado o metodo acima, ele constava erro e exigia o metodo abaixo e pela IDE ele foi criado automaticamente usando a sugestao

    private static Produto[] addProduto(Produto[] produtos, Produto newProduto) {
        Produto[] lista = new Produto[produtos.length + 1];
        for (int i = 0; i < produtos.length; i++) {
            lista[i] = produtos[i];
        }
        lista[lista.length - 1] = newProduto;
        return lista;
    }

    private static void exibirLista(){
        if (produtos.length == 0){
            System.out.println("Nenhum produto foi cadastrado ainda");
            return;
        }
        for (int i = 0; i < produtos.length; i++) {
            System.out.println();
            System.out.println("ID do Produto: "+i);
            produtos[i].produtosCadastrados();
        }
    }
    //Editar estoque esta apenas adicionando o valor e somando com o existente, ainda nao é possivel diminuir o valor do estoque, revisar metodo setEstoque
    private static void editarEstoque(Scanner sc){
        if (produtos.length == 0){
            System.out.println("Nenhum produto cadastrado");
            return;
        }
        exibirLista();
        System.out.print("Digite o ID do produto que deseja alterar: ");
        int id = sc.nextInt();
        if (id>=0 && id < produtos.length){
            System.out.print("Digite o quantidade do produto");
            int newEstoque = sc.nextInt();
            sc.nextLine();

            produtos[id].setEstoque(newEstoque);
            System.out.println("Estoque atualizado");
        }
        else {
            System.out.println("ID nao encontrado");
        }
    }
    private static void editarPreco(Scanner sc){
        if(produtos.length == 0){
            System.out.println("Nenhum produto cadastrado");
            return;
        }
        exibirLista();
        System.out.println("Digite ID do produto que deseja alterar: ");
        int id = sc.nextInt();
        if (id>=0 && id < produtos.length){
            System.out.println("Digite o novo preço do produto");
            double newPreco = sc.nextDouble();
            sc.nextLine();

            produtos[id].setPreco(newPreco);
            System.out.println("Preço atualizado");
        }
        else{
            System.out.println("ID nao encontrado");
        }
    }
}
