package br.unipar.entity;

public class Empresa {
    private Integer codigo;
    private String nome;
    private String cnpj;
    private String inscricaoEstudantil;
    private String razaoSocial;
    private String endereco;
    private String situacao;

    private Cidade cidade;

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Empresa (Integer codigo, String nome, String cnpj, String inscricaoEstudantil, String razaoSocial, String endereco, String situacao){

    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstudantil() {
        return inscricaoEstudantil;
    }

    public void setInscricaoEstudantil(String inscricaoEstudantil) {
        this.inscricaoEstudantil = inscricaoEstudantil;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}