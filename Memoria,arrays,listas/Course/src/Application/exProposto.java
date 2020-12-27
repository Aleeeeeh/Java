package Application;

import java.util.Scanner;

public class exProposto {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite valor de linhas da matriz: ");
		int n = sc.nextInt();

		System.out.print("Digite valor das colunas: ");
		int j = sc.nextInt();

		int[][] mat = new int[n][j];

		// Parte 1

		for (int i = 0; i < mat.length; i++) {
			for (int h = 0; h < mat[i].length; h++) {
				mat[i][h] = sc.nextInt();
			}
		}

		// Parte 2
		System.out.print("Digite valor de x: ");
		int x = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int h = 0; h < mat[i].length; h++) {
				if (mat[i][h] == x) {
				System.out.println("Position " + i + "," + h + ": ");	
				if(h > 0) {
					System.out.println("Esquerda: " + mat[i][h - 1]);
				}
				if(i > 0) {
					System.out.println("Acima: " + mat[i-1][h]);
				}
				if(h < mat[i].length - 1) {
					System.out.println("Direita: " + mat[i][h+1]);
				}
				if(i < mat.length - 1) {
					System.out.println("Abaixo: " + mat[i+1][h]);
				}
				}
			}
		}

		sc.close();
	}

}
