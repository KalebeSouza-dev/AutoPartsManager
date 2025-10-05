package produto;

import java.util.HashMap;
import java.util.Map;

import peca.Peca;

public class ProdutoController {
	
	private Map<Integer, Produto> produtos;
	
	public ProdutoController() {
		produtos = new HashMap<>();
	}
	public void adicionarProduto(Peca peca, String marca, int codigo, int quantidade, double preçoCompra, double preçoVenda) {
		Produto p = new Produto(peca, marca, codigo, quantidade, preçoCompra, preçoVenda);
		produtos.put(codigo, p);
		peca.addProduto(p);
	}
	public String buscarProduto(int codigo) {
		Produto produto = produtos.get(codigo);
		Peca peça = produto.getPeça();
		
		return peça.exibirProdutos();
	}	
	public String[] listarProdutos() {
		String[] out = new String[produtos.size()];
	    int i = 0;

	    for (Produto p : produtos.values()) {
	        out[i] = p.toString();
	        i++;
	    }

	    return out;
	}
}
