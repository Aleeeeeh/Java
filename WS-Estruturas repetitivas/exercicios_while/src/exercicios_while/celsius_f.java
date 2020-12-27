package exercicios_while;

import java.util.Locale;
import java.util.Scanner;

//Exemplo de "do while"
public class celsius_f {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp ;
		
		do {
		
		System.out.print("Digite a temperatura em Celsius: ");
		double c = sc.nextDouble();
		double f = 9.0 * c / 5.0 + 32;
		System.out.printf("Equivalente em Fahrenheit: %.1f%n",f);
		System.out.println("Deseja repetir (s/n)? ");
		resp = sc.next().charAt(0);
		
		}while(resp != 'n');
		
			sc.close();
	}
}