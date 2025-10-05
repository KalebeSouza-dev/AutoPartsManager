package peca;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import produto.Produto;

public class Peca {
	private int ID;
	private String nome;
	private String descricao;
	private Map<Integer, Produto> produtos;
	
	public Peca(int ID, String nome, String descricao) {
		this.ID = ID;
		this.nome = nome;
		this.descricao = descricao;
		this.produtos = new HashMap<>();
	}
	
	public String exibirProdutos() {
		StringBuffer out = new StringBuffer();
		for (Produto p: produtos.values()) {
			out.append(p.toString());
			out.append("\n");
		}
		return out.toString();
	}
	public void addProduto(Produto p) {
		this.produtos.put(p.getCodigo(), p);
	}
	
	@Override
	public String toString() {
		return "Peça [ID=" + ID + ", nome=" + nome + ", descricao=" + descricao + "]"
				+ "\nProdutos:\n" + exibirProdutos();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(ID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Peca other = (Peca) obj;
		return ID == other.ID;
	}

	public int getID() {
		return ID;
	}
	public String getNome() {
		return nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public Map<Integer, Produto> getProdutos() {
		return produtos;
	}
}
