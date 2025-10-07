package app;

import peca.Peca;
import peca.PecaController;
import produto.ProdutoController;

public class AutoPartsFacade {
	private ProdutoController CProduto;
	private PecaController CPeca;
	
	public AutoPartsFacade() {
		CProduto = new ProdutoController();
	}
	
	//sistema
	public void cadastrarPeca(int ID, String nome, String descricao) {
		CPeca.adicionarPeca(ID, nome, descricao);
	}
	public void cadastrarProduto(int idPeca, String marca, int codigo, double preçoCompra, double preçoVenda) {
		Peca peca = CPeca.getPeca(idPeca);
		CProduto.adicionarProduto(peca, marca, codigo, preçoCompra, preçoVenda);
	}
	public String[] listarPecas() {
		return CPeca.listarPecas();
	}
	public String[] listarProdutos() {
		return CProduto.listarProdutos();
	}
	public String buscarProduto(int codigo) {
		return CProduto.buscarProduto(codigo);
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
