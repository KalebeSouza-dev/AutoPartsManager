package estoque;

import java.util.HashMap;
import java.util.Map;

import peca.Peca;
import produto.Produto;

public class Estoque {
	private Map<Integer, Produto> produtos;
	private Map<Integer, Peca> peças;
	
	public Estoque() {
		produtos = new HashMap<>();
		peças = new HashMap<>();

	}
	
	public void adicionarProduto(int cod) {
		
	}
	public void removerProduto(int cod) {
		
	}
	public void buscarProduto(int cod) {
		
	}
	public String[] listarProdutos() {
		return new String[10];
	}
}
