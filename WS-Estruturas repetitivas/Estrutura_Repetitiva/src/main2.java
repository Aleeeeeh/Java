import java.util.Scanner;
//Enquanto os n�meros for diferente de zero repita e fa�a a soma !
public class main2 { 
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma = 0;
		
		while(x != 0 ) {
			soma = soma + x; //Somar os valores enquanto n�o for digitado zero !
			x = sc.nextInt();
		}
		System.out.println("Resultado da soma: " + soma);
		sc.close();		
	}
		
	}
