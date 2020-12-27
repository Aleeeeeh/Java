package Entidades;

public class item_pedido {
	
	private Integer quantidade;
	private double preco;
	
	private Produto produto;
	
	public item_pedido() {
		
	}
	public item_pedido(Integer quantidade, double preco, Produto produto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double subtotal() {
		return preco * quantidade;
	}

}
