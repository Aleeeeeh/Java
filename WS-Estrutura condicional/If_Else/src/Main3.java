import java.util.Scanner;

public class Main3 { //Verificar se o n�mero � par ou impar
	public static void main(String args[]) {
		
		Scanner lg = new Scanner(System.in);
		
		int number;
		
		System.out.println("Digite um N�mero: ");
		number = lg.nextInt();
		
		if(number % 2 == 0) {
			System.out.println("N�mero par!");
		}else
			{
			System.out.println("N�mero Impar!");
			}
		
		lg.close();
		
	}
}
