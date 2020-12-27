package Application;

import java.util.Locale;
import java.util.Scanner;

//Ler um número inteiro N de N altura de N pessoas e Mostrar a média aritmética dessas pessoas
public class program {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		int n = sc.nextInt();
		Double [] vect = new Double [n]; //vect nome da variável recebendo a instaciação do vetor
		
		for(int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
		}
		double sum = 0.0;
		for(int i=0; i<n; i++) {
			sum += vect[i]; //Armazenar a soma dos vetores na variavel sum que foi iniciada com 0.0
		}
		double avg = sum / n; // Armazenar a soma dividido por N na variavel avg
		
		System.out.println("AVERAGE HEIGHT: " + avg);
		sc.close();
	}
}
