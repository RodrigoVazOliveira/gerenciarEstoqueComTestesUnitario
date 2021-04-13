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

    @Test
    public void testarProcuraDeProdutoPeloNome() {
        Produto produto = new Produto(
                "produto 1",
                "12-12-2021",
                20.5,
                1
        );
        lIstaEstoque.adicionarNovoProduto(produto);

        Assert.assertThrows(RuntimeException.class, () -> {
            lIstaEstoque.obterProdutoPeloNome("sdfsdfds");
        });
        Assert.assertEquals(produto, lIstaEstoque.obterProdutoPeloNome("produto 1"));
    }


    @Test
    public void testarRemoverProdutoPeloNome() {
        Produto produto = new Produto(
                "produto 1",
                "12-12-2021",
                20.5,
                1
        );
        lIstaEstoque.adicionarNovoProduto(produto);

        Assert.assertThrows(RuntimeException.class, () -> {
            lIstaEstoque.removerProduto("23423423423ds");
        });
        Assert.assertTrue(lIstaEstoque.removerProduto("produto 1"));
    }

    @Test
    public void TestarQuantidadeNegativa() {
        Assert.assertTrue(lIstaEstoque.verificarQuantidadeNegativa(-1));
    }

    @Test
    public void TestarQuantidadePositiva() {
        Assert.assertFalse(lIstaEstoque.verificarQuantidadeNegativa(1));
    }

    @Test
    public void testarAlteracaoDeQuantidadeDoProduto() {
        Produto produto = new Produto(
                "produto 1",
                "12-12-2021",
                20.5,
                1
        );

        lIstaEstoque.adicionarNovoProduto(produto);

        Assert.assertThrows(RuntimeException.class, () -> {
            lIstaEstoque.alterarQuantidadeDoProduto("sdafdsfdssdf", 90);
        });

        Assert.assertThrows(RuntimeException.class, () -> {
            lIstaEstoque.alterarQuantidadeDoProduto("produto 1", -2);
        });

        lIstaEstoque.alterarQuantidadeDoProduto("produto 1", 5);

        Assert.assertEquals(produto.getQuantidadeEmEstoque(), 6);

    }
}
