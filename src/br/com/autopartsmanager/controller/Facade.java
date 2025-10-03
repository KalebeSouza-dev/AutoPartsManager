package br.com.autopartsmanager.controller;

public class Facade {
	private ProdutoController PC;
	
	public Facade() {
		PC = new ProdutoController();
	}
	
	//sistema
	public void cadastrarPeça(int ID, String nome, String descricao) {
		PC.adicionarPeça(ID, nome, descricao);
	}
	public void cadastrarProduto(int idPeca, String marca, int codigo, int quantidade, double preco) {
		PC.adicionarProduto(idPeca, marca, codigo, quantidade, preco);
	}
	public String listarPeças() {
		return "";
	}
	public String listarProdutos() {
		return "";
	}
	
	//estoque
	public void pedidoCompra() {
		
	}
	public void pedidoVenda(){
		
	}
	public String exibirEstoque() {
		return "";
	}
	public String detalhesEstoque() {
		return "";
	}
	
	//dao
}
