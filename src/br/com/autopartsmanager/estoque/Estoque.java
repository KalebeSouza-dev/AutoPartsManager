package br.com.autopartsmanager.estoque;

import java.util.HashMap;
import java.util.Map;

import br.com.autopartsmanager.model.Peça;
import br.com.autopartsmanager.model.Produto;

public class Estoque {
	private Map<Integer, Produto> produtos;
	private Map<Integer, Peça> peças;
	
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
