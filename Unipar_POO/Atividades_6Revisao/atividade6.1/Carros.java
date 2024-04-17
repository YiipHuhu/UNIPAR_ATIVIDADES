import org.w3c.dom.ls.LSOutput;

public class Carros {
    public static void main(String[] args) {
        Carro Fiesta = new Carro("Fiat", "Fiesta", 2008, "Preto");

        Fiesta.exibirInfo();
        System.out.println("informação errada da marca do veiculo, alterado para Ford");
        Fiesta.setMarca("Ford");
        Fiesta.exibirInfo();

        Carro Fusca = new Carro("Volkswagen", "Fusca 2.0", 2010, "Azul");
        Fusca.exibirInfo();
    }
}
