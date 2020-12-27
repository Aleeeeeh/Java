package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in Stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println("products data: " + product);
		
		System.out.println();
		System.out.print("Enter the numbers of products to be added in Stock: ");
		
		int quantity = sc.nextInt();
		product.addProducts(quantity); //Função para adicionar produtos ao estoque
		
		System.out.println();
	    System.out.println("update data: " + product);
	    
	    System.out.println();
	    System.out.println("Enter the numbers of products to be remove from Stock: ");
	    quantity  = sc.nextInt();
	    product.removeProducts(quantity);
	    
	    System.out.println("Remove data: " + product);
	    
	    
		
		sc.close();
		
		
	}

}
