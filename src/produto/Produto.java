package produto;

import java.util.Objects;

import peca.Peca;

public class Produto {
	private String marca;
	private int codigo;
	private double precoCompra;
	private double precoVenda;
	private Peca peca;
	
	public Produto() {}
	public Produto(Peca peça, String marca, int codigo, double preçoCompra, double precoVenda) {
		this.marca = marca;
		this.codigo = codigo;
		this.precoCompra = preçoCompra;
		this.precoVenda = precoVenda;
		this.peca = peça;
	}
	public Produto(String marca, int codigo) {
		this.marca = marca;
		this.codigo = codigo;
		this.precoCompra = 0.0;
		this.precoVenda = 0.0;
	}

	@Override
	public String toString() {
		return "Produto [marca=" + marca + ", codigo=" + codigo + ", precoCompra="
				+ precoCompra + ", precoVenda=" + precoVenda + "]";
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
	public void alterarPreco(double compra, double venda) {
		this.precoCompra = compra;
		this.precoVenda = venda;
	}
	// Getters and Setters
	public double getPrecoCompra() {
		return precoCompra;
	}
	public double getPrecoVenda() {
		return precoVenda;
	}
	public Peca getPeca() {
		return peca;
	}
	public void setPeça(Peca peça) {
		this.peca = peça;
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
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
}
