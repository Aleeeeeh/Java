package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangle; //Importar a classa Retangle

public class program2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Retangle ret = new Retangle(); //criar o objeto
	
		System.out.println("Enter Retangle width and height: ");
		ret.width = sc.nextDouble(); //Entrada de dados 
		ret.height = sc.nextDouble();
		
		System.out.printf("Area = %.2f%n",ret.area()); //Imprimir o resultado na tela do tipo Double
		System.out.printf("Perimeter = %.2f%n",ret.perimeter());
		System.out.printf("Diagonal = %.2f%n",ret.diagonal());
				

		
		
	}

}
