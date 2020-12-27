package entities;

public class product {
	public String name;
	public double price;
	public int quantity;
	
	public product(String name, double price, int quantity) {//argumentos, não precisa ser igual
		this.name = name;                                   //ao nome das variaveis
		this.price = price;
		this.quantity = quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name
				+ ", $ " 
				+ String.format("%.2f", price) + ", " 
				+ quantity 
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}