package Application;

import java.util.Scanner;

import Entities.aluguel;


public class program3 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		aluguel [] vect = new aluguel [10];
		
		System.out.println("Quantos quartos ser�o alugados:");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++){
			System.out.println();
			System.out.println("Aluguel#" + i + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Telefone: ");
			int telefone = sc.nextInt();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			vect[quarto] = new aluguel(nome, email,telefone);//quarto indica posi��o no vetor
		}
		System.out.println();
		System.out.println("Quarto Ocupados: ");
		for(int i=0; i<10; i++ ) {//Percorre as 10 posi��es e exibe os que n�o for nulo
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
	
		sc.close();
	}

}
