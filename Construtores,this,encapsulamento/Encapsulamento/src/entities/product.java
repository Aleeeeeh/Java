package entities;

public class product {
	private String name; //Encapsulamento nos atributos com private
	private double price;
	private int quantity;
	
	public product() { //Construtor Padrão
		
	}
	public product(String name, double price, int quantity) {//argumentos, não precisa ser igual
		this.name = name;                                   //ao nome das variaveis
		this.price = price;
		this.quantity = quantity;
	}
	public String getName() { //Pega o valor(name fico com N maiusculo porque é obrig..Case sensi..
		return name;
	}
	public void setName(String name) { //Altera o valor e ambos são exe..no program
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
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