import java.util.Locale;
import java.util.Scanner;

public class borave {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double raio, a;
		double pi = 3.14159;
		
		raio = sc.nextDouble();
		a = pi * raio * raio;
		System.out.printf("Valor do raio é =%.4f%n",a);
		
		sc.close();
		
	}

}
