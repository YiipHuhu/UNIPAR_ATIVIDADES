public class CirculoTeste {
    public static void main(String[] args) {
        Circulo pizza = new Circulo(5, "amarela");

        System.out.println(pizza.ValorArea()+ " Area");
        System.out.println(pizza.ValorPerimetro() + " Perimetro");
        System.out.println(pizza.valorDiametro() + " Diametro");
    }
}
