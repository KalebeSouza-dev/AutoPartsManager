package br.com.autopartsmanager.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Produto {
	private int cod;
	private String nome;
	private int quantidade;
	private double preco;
	private String montadora;
	private Map<String, String> referencias;
	
	public Produto() {}
	public Produto(int cod, String nome, double preco) {
		this.cod = cod;
		this.nome = nome;
		this.quantidade = 0;
		this.preco = preco;
		this.montadora = null;
		this.referencias = new HashMap<>();
	}
	public Produto(int cod, String nome, double preco, int quantidade) {
		this.cod = cod;
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
		this.montadora = null;
		this.referencias = new HashMap<>();
	}
	public Produto(int cod, String nome, double preco, int quantidade, String montadora) {
	    this.cod = cod;
	    this.nome = nome;
	    this.quantidade = quantidade;
	    this.preco = preco;
	    this.montadora = montadora;
	    this.referencias = new HashMap<>();
	}

	@Override
	public String toString() {
		return "Produto [cod=" + cod + ", nome=" + nome + ", quantidade=" + quantidade + ", preco=" + preco
				+ ", montadora=" + montadora + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cod, nome);
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
		return cod == other.cod && Objects.equals(nome, other.nome);
	}
	
	public void incrementaQuantidade(int quantidade) {
		this.quantidade += quantidade;
	}
	
	// Getters and Setters
	public double getPreco() {
		return preco;
	}
	public double PrecoTotal() {
	    return this.preco * this.quantidade;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getMontadora() {
		return montadora;
	}
	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}
	public int getCod() {
		return cod;
	}
	public String getNome() {
		return nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
}
