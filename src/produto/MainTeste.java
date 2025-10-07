package produto;

import peca.Peca;

public class MainTeste {
	public static void main(String[] args) {
        // Criar Peca (necessária para criar Produto)
        Peca peca1 = new Peca(10, "bomba agua", "VW 1.0");
        Peca peca2 = new Peca(11, "correia dentada", "VW 1.0");
        Peca peca3 = new Peca(12, "tensor correia", "VW 1.0");
        Peca peca4 = new Peca(101, "Filtro de óleo", "Filtro de óleo para VW");
        ProdutoController produtoCtrl = new ProdutoController();

        System.out.println(produtoCtrl.removerProduto(12345));
        produtoCtrl.adicionarProduto(peca1, "Bosch", 20189, 62.0, 95.0);
        produtoCtrl.adicionarProduto(peca2, "SHADECK", 20524, 44.0, 65.0);
        produtoCtrl.adicionarProduto(peca3, "GATES", 30157, 87.0, 118.9);
        produtoCtrl.adicionarProduto(peca4, "SKF", 12345, 50.0, 79.9);
        
        System.out.println(produtoCtrl.removerProduto(12345));
        System.out.println("\nLista de produtos:");
        for (String c : produtoCtrl.listarProdutos()) {
        	System.out.println(c);
        }
        
        Produto produto = produtoCtrl.getProduto(12345);
        if (produto != null) {
            System.out.println(produto);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }
}
