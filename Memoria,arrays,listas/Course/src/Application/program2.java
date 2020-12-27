package Application;

import java.util.Locale;
import java.util.Scanner;

public class program2 {
	public static void main(String args[]) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o Número de pessoas: ");
		int n = sc.nextInt();
		
		double [] vect = new double [n];
		
		for(int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
		}
		double soma = 0.0;
		for(int i=0; i<n; i++) {
			soma += vect[i];
		}
		double res = soma / n;
		
		System.out.printf("Média de altura das Pessoas = %.2f%n" ,res);
		
		sc.close();
	}
}
