package application;

import java.util.Locale;
import java.util.Scanner;

import entities.empregado;

public class program3 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		empregado emploey = new empregado();
		
		System.out.println("Enter Name: ");
		emploey.name = sc.nextLine();
		
		System.out.println("Enter Gross Salary: ");
		emploey.gross_salary = sc.nextDouble();
		
		System.out.println("Enter tax: ");
		emploey.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Nome: " + emploey);
		
		System.out.println();
		System.out.println("wich percentage to increase net salary: ");
		double percentage = sc.nextDouble();
		emploey.increasySalary(percentage);
		
		System.out.println();
		System.out.println("Update: " + emploey);
		
		sc.close();

	}

}
