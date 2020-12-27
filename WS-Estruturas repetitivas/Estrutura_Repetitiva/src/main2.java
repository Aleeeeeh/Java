import java.util.Scanner;
//Enquanto os números for diferente de zero repita e faça a soma !
public class main2 { 
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma = 0;
		
		while(x != 0 ) {
			soma = soma + x; //Somar os valores enquanto não for digitado zero !
			x = sc.nextInt();
		}
		System.out.println("Resultado da soma: " + soma);
		sc.close();		
	}
		
	}
