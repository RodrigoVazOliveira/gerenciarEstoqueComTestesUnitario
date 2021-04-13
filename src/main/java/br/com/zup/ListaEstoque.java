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

}
