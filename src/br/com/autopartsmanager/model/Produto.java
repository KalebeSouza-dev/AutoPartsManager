package br.com.autopartsmanager.model;

import java.util.Objects;

public class Produto {
	private String marca;
	private int codigo;
	private int quantidade;
	private double precoCompra;
	private double precoVenda;
	private Peça peça;
	
	public Produto() {}
	public Produto(Peça peça, String marca, int codigo, int quantidade, double preçoCompra, double precoVenda) {
		this.marca = marca;
		this.codigo = codigo;
		this.quantidade = quantidade;
		this.precoCompra = preçoCompra;
		this.precoVenda = precoVenda;
		this.peça = peça;
	}
	public Produto(String marca, int codigo) {
		this.marca = marca;
		this.codigo = codigo;
		this.quantidade = 0;
		this.precoCompra = 0.0;
		this.precoVenda = 0.0;
	}

	@Override
	public String toString() {
		return "Produto [marca=" + marca + ", codigo=" + codigo + ", quantidade=" + quantidade + ", precoCompra="
				+ precoCompra + ", precoVenda=" + precoVenda + ", peça=" + peça.toString() + "]";
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
	public double getPrecoCompra() {
		return precoCompra;
	}
	public double getPrecoVenda() {
		return precoVenda;
	}
	public Peça getPeça() {
		return peça;
	}
	public void setPeça(Peça peça) {
		this.peça = peça;
	}
	public void setPrecoCompra(double preco) {
		this.precoCompra = preco;
	}
	public void setPrecoVenda(double preco) {
		this.precoVenda = preco;
	}
	public int getCodigo() {
		return codigo;
	}
	public double PrecoTotal() {
	    return this.precoCompra * this.quantidade;
	}
	public int getQuantidade() {
		return quantidade;
	}
}
