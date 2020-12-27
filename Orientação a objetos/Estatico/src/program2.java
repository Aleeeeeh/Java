import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;


public class program2 {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("What is the dollar price ?%.2f%n ",CurrencyConverter.dollar);
		System.out.print("How many dollars will be bought ? ");
		double real = sc.nextDouble();
		double res = CurrencyConverter.valor_final(real);
		
		System.out.printf("Amount to be paid in reais = %.2f%n ",res);
		
		sc.close();
	}
}
