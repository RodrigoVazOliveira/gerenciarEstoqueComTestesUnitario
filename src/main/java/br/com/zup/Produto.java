package br.com.zup;

public class Produto {
    private String nome;
    private String dataVencimento;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto() {
    }

    public Produto(String nome, String dataVencimento, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.dataVencimento = dataVencimento;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
}
