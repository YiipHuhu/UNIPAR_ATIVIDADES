public class Circulo {
    private double raio;
    private String cor;

    public Circulo(double raio, String cor){
        this.cor = cor;
        this.raio = raio;
    }

    public double ValorArea(){
        return (raio * raio) * 3.14;
    }
    public double valorDiametro(){
        return raio * 2;
    }
    public double ValorPerimetro(){
        return valorDiametro() * 3.14;
    }



    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}