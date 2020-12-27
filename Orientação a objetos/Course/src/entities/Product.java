package entities;

public class Product {
	
	public String name;
	public double price;     //Entidades do sistema
	public int quantity;
	
	public double totalValueinStock() {  //Valor total do pedido (preço x quantidade)
		return price * quantity;
	}
	public void addProducts(int quantity) {   //Adicionar produtos no estoque
		this.quantity += quantity;
	}
	public void removeProducts(int quantity) { //remover produtos no estoque	
		this.quantity -= quantity;
	}
	public String toString() { //Converte para string
		return name + " , $ "+ String.format("%.2f", price) + ", " + quantity +
		" units, total: $ " + String.format("%.2f", totalValueinStock());
	}
	
	

}
