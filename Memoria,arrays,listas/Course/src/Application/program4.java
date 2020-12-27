package Application;

import java.util.Locale;
import java.util.Scanner;

//Sistema para calcular média aritmética dos alunos !
public class program4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		char resp;
		
		do {
		int nota = 4;
		double[] vect = new double[nota];
		
		System.out.print("Digite Nome do Aluno: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Digite RA do Aluno: ");
		int ra = sc.nextInt();

		for (int i = 0; i < nota; i++) {
			System.out.print("Digite a " + (i + 1) + "° nota do Aluno: ");
			vect[i] = sc.nextDouble();
		}
		double soma = 0.0;
		for(int i=0; i<nota; i++) {
			soma += vect[i];
		}System.out.println();
		double res = soma / nota;
		System.out.print("Média final do Aluno: " + res);
		System.out.println();
		System.out.print("Deseja Repetir s/n: ");
		resp = sc.next().charAt(0);
		}while (resp != 'n');
	
		sc.close();
	}

}
