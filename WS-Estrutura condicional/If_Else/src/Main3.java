import java.util.Scanner;

public class Main3 { //Verificar se o número é par ou impar
	public static void main(String args[]) {
		
		Scanner lg = new Scanner(System.in);
		
		int number;
		
		System.out.println("Digite um Número: ");
		number = lg.nextInt();
		
		if(number % 2 == 0) {
			System.out.println("Número par!");
		}else
			{
			System.out.println("Número Impar!");
			}
		
		lg.close();
		
	}
}
