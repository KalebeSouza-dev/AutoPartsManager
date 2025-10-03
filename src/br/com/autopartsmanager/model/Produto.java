package br.com.autopartsmanager.model;

import java.util.Objects;

public class Produto {
	private String marca;
	private int codigo;
	private int quantidade;
	private double preco;
	private Peça peça;
	
	public Produto() {}
	public Produto(Peça peça, String marca, int codigo, int quantidade, double preco) {
		this.marca = marca;
		this.codigo = codigo;
		this.quantidade = quantidade;
		this.preco = preco;
		this.peça = peça;
	}
	public Produto(String marca, int codigo) {
		this.marca = marca;
		this.codigo = codigo;
		this.quantidade = 0;
		this.preco = 0.0;
	}

	@Override
	public String toString() {
		return "Produto [marca=" + marca + ", codigo=" + codigo + 
				", quantidade=" + quantidade + ", preco=" + preco + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, marca);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return codigo == other.codigo && Objects.equals(marca, other.marca);
	}
	
	public void incrementaQuantidade(int quantidade) {
		this.quantidade += quantidade;
	}
	
	// Getters and Setters
	public double getPreco() {
		return preco;
	}
	public Peça getPeça() {
		return peça;
	}
	public void setPeça(Peça peça) {
		this.peça = peça;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getCodigo() {
		return codigo;
	}
	public double PrecoTotal() {
	    return this.preco * this.quantidade;
	}
	public int getQuantidade() {
		return quantidade;
	}
}
