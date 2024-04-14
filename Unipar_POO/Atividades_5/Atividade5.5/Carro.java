public class Carro {

     private String nome;
     private String modelo;
    private int velocidade;
    private double valor;
    private String cor;

    public Carro(String nome, String modelo, int velocidade, double valor, String cor) {

        this.nome = nome;
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.valor = valor;
        this.cor = cor;
   }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}