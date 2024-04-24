package br.unipar.entity;

public class Fornecedor extends Pessoa{

    private String cnpj;
    private String email;
    private String formarPagamento;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFormarPagamento() {
        return formarPagamento;
    }

    public void setFormarPagamento(String formarPagamento) {
        this.formarPagamento = formarPagamento;
    }
}
