public class CarroTeste {

    public static void main(String[] args) {

        Carro fordcarro = new Carro("Ford", "Fusion Titanium", 220, 83.999, "Azul");

        System.out.println("Marca: " + fordcarro.getNome());
        System.out.println("Modelo do carro: " + fordcarro.getModelo());
        System.out.println("Velocidade do carro: " + fordcarro.getVelocidade() +"Km/h");
        System.out.println("Valor: R$" + fordcarro.getValor());
        System.out.println("Cor: " + fordcarro.getCor());
    }
}
