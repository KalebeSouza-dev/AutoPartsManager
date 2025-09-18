package br.com.autopartsmanager.controller;

import java.util.HashMap;

import br.com.autopartsmanager.model.Produto;

public class ProdutoController {
	private HashMap<Integer, Produto> produtos;
	
	public ProdutoController() {
		produtos = new HashMap<>();
	}
	public void adicionarProduto(String nome, double preco, int quantidade, String montadora) {
		Produto p = new Produto(this.produtos.size() + 1, nome, preco, quantidade, montadora);
		produtos.put(this.produtos.size() + 1, p);
	}
	public void removerProduto(int cod) {
		
	}
	public void buscarProduto(int cod) {
		
	}
	public String[] listarProdutos() {
	    String[] out = new String[produtos.size()];
	    int i = 0;

	    for (Produto p : produtos.values()) {
	        out[i] = p.getNome();
	        i++;
	    }

	    return out;
	}
	
	private boolean temProduto(int cod) {
		return false;
	}
}
