import java.util.Scanner;

public class main6 {//Calcular o valor a pagar
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o Código do Item: ");
		int codigo = sc.nextInt();
		
		System.out.println("Digite a Quantidade: ");
		int quantidade = sc.nextInt();
		
		double total;
		if (codigo == 1) {
			total = quantidade * 4.0;
		}
		else if (codigo == 2) {
			total = quantidade * 4.5;
		}
		else if (codigo == 3) {
			total = quantidade * 5.0;
		}
		else if (codigo == 4) {
			total = quantidade * 2.0;
		}
		else {
			total = quantidade * 1.5;
		}

		System.out.printf("Total à Pagar: R$ %.2f%n", total);
		
		sc.close();
	}

}
