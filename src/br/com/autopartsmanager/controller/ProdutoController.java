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
	public void adicionarPeça(int ID, String nome, String descricao) {
		Peça peça = new Peça(ID, nome, descricao);
		peças.put(ID, peça);
	}
	public void adicionarProduto(int idPeca, String marca, int codigo, int quantidade, double preçoCompra, double preçoVenda) {
		Peça peça = peças.get(idPeca);
		Produto p = new Produto(peça, marca, codigo, quantidade, preçoCompra, preçoVenda);
		produtos.put(codigo, p);
		peça.addProduto(p);
	}
	public String buscarProduto(int codigo) {
		Produto produto = produtos.get(codigo);
		Peça peça = produto.getPeça();
		
		return peça.exibirProdutos();
	}
	private Peça getPecas(int idPeca) {
		return peças.get(idPeca);
	}
	public String[] listarPeças() {
	    String[] out = new String[peças.size()];
	    int i = 0;

	    for (Peça p : peças.values()) {
	        out[i] = p.getNome();
	        i++;
	    }

	    return out;
	}
	public String[] listarProduts() {
		String[] out = new String[produtos.size()];
	    int i = 0;

	    for (Produto p : produtos.values()) {
	        out[i] = p.toString();
	        i++;
	    }

	    return out;
	}
}
