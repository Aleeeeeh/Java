package application;
//Encapsulamento e m�todos get e set.
//Encapsulamento serve para esconder detalhes de implementa��o, e expor apenas opera��es seguras
//para o usu�rio
import java.util.Locale;
import java.util.Scanner;
import entities.product;

public class program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine(); //Variavel auxiliar
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		product product = new product(name,price,quantity);//Criar obj, com os argumentos da classe product
		
		product.setName("Computer");//Altera nome e exibe atualizado usando o get
		System.out.println("Update Name: " + product.getName());//Pegou name alterado 
		
		product.setPrice(850.0);
		System.out.println("Update Price: " + product.getPrice());
		
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		sc.close();
	}
}