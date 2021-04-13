package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ListaEstoque {

    private List<Produto> produtos;

    public ListaEstoque() {
        produtos = new ArrayList<>();
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Boolean adicionarNovoProduto(Produto produto) {
        return produtos.add(produto);
    }

    public Produto obterProdutoPeloNome(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        throw new RuntimeException("nenhum produto foi localizado com o nome " + nome);
    }

    public Boolean removerProduto(String nome) {
        Produto produto = obterProdutoPeloNome(nome);
        return produtos.remove(produto);
    }

    public void alterarQuantidadeDoProduto(String nome, Integer quantidade) {
        Produto produto = obterProdutoPeloNome(nome);

        if (verificarQuantidadeNegativa(produto.getQuantidadeEmEstoque() + quantidade)) {
            throw new RuntimeException("A quantidade não pode ser menor do que 0");
        }

        produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque() + quantidade);
    }

    public Boolean verificarQuantidadeNegativa(Integer quantidade) {
        return quantidade < 0;
    }
}
