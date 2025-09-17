package br.com.autopartsmanager.model;

import java.util.HashMap;

public class Estoque {
	private HashMap<Integer, Produto> produtos;
	
	public Estoque() {
		produtos = new HashMap<>();
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
	
	private boolean temProduto(int cod) {
		return false;
	}
}
