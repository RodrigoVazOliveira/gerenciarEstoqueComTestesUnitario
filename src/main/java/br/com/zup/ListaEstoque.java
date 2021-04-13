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

}
