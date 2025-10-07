package produto;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import peca.Peca;

public class ProdutoController {
	
	private Map<Integer, Produto> produtos;
	private ProdutoDAO produtoDao;
	
	public ProdutoController() {
		produtos = new HashMap<>();
		produtoDao = new ProdutoDAO();
		carregarProdutosBanco();
	}
	
	private void carregarProdutosBanco() {
        try {
            List<Produto> lista = produtoDao.listarTodos();
            for (Produto p : lista) {
                produtos.put(p.getCodigo(), p);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao carregar peças: " + e.getMessage());
        }
    }
	public void adicionarProduto(Peca peca, String marca, int codigo, double preçoCompra, double preçoVenda) {
		Produto p = new Produto(peca, marca, codigo, preçoCompra, preçoVenda);
		produtos.put(codigo, p);
		peca.addProduto(p);
		
		try {
            produtoDao.adicionarProduto(p);
            System.out.println("Produto salvo no banco!");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir produto no banco: " + e.getMessage());
        }
	}
	public String removerProduto(int codigo) {
		this.produtos.remove(codigo);
		
		try {
	        produtoDao.removerProduto(codigo);
	    } catch (SQLException e) {
	        return "Erro ao remover produto do banco: " + e.getMessage();
	    }
		
		return "Produto removida com sucesso!";
	}
	public String buscarProduto(int codigo) {
		Produto produto = produtos.get(codigo);
		Peca peça = produto.getPeca();
		
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
	public String alterarPreco(int codigo, double compra, double venda) {
		Produto produto = produtos.get(codigo);
		produto.alterarPreco(compra, venda);
		
		try {
	        produtoDao.alterarPreco(codigo, compra, venda);
	        return "Preço alterado com sucesso (banco e memória atualizados)";
	    } catch (SQLException e) {
	        return "Erro ao alterar preço no banco: " + e.getMessage();
	    }
	}
	public Produto getProduto(int codigo) {
		return this.produtos.get(codigo);
	}
	
}
