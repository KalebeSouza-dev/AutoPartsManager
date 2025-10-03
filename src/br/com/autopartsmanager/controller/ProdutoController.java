package br.com.autopartsmanager.controller;

import java.util.HashMap;
import java.util.Map;

import br.com.autopartsmanager.model.Peça;
import br.com.autopartsmanager.model.Produto;

public class ProdutoController {
	private Map<Integer, Peça> peças;
	private Map<Integer, Produto> produtos;
	
	public ProdutoController() {
		produtos = new HashMap<>();
		peças = new HashMap<>();
	}
	public void adicionarProduto(int idPeca, String marca, int codigo, int quantidade, double preco) {
		Peça peça = peças.get(idPeca);
		Produto p = new Produto(peça, marca, codigo, quantidade, preco);
		produtos.put(codigo, p);
		peça.addProduto(p);
	}
	public void removerProduto(int cod) {
		
	}
	public void buscarProduto(int cod) {
		
	}
	public Peça getPecas(int idPeca) {
		return peças.get(idPeca);
	}
	public String[] listarPeças() {
	    String[] out = new String[produtos.size()];
	    int i = 0;

	    for (Peça p : peças.values()) {
	        out[i] = p.getNome();
	        i++;
	    }

	    return out;
	}
}
