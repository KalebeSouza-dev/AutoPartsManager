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
	public void cadastrarProduto(int idPeca, String marca, int codigo, int quantidade, double preçoCompra, double preçoVenda) {
		PC.adicionarProduto(idPeca, marca, codigo, quantidade, preçoCompra, preçoVenda);
	}
	public String[] listarPeças() {
		return PC.listarPeças();
	}
	public String[] listarProdutos() {
		return PC.listarProduts();
	}
	public String buscarProduto(int codigo) {
		return PC.buscarProduto(codigo);
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
