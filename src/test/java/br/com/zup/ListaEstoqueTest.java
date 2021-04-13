package br.com.zup;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ListaEstoqueTest {

    private ListaEstoque lIstaEstoque;

    @Before
    public void setup() {
        lIstaEstoque = new ListaEstoque();
    }

    @Test
    public void TestarAdicionarNovoProduto() {
        Produto produto = new Produto(
                "Produto 1",
                "12-12-2021",
                25.00,
                14
        );
        Assert.assertTrue(lIstaEstoque.adicionarNovoProduto(produto));
    }
}
