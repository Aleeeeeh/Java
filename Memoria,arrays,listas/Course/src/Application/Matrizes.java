package Application;

import java.util.Scanner;

public class Matrizes {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor da matriz: ");
		int n = sc.nextInt();

		int[][] mat = new int[n][n];

		for (int i = 0; i < mat.length; i++) {
			for (int h = 0; h < mat[i].length; h++) {
				mat[i][h] = sc.nextInt();
			}
		}
		System.out.println("Números da diagonal: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();

		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int h = 0; h < mat[i].length; h++) {
				if (mat[i][h] < 0) {
					count++;
				}
			}

		}
		System.out.print("Quantidade de números negativos: " + count);
		
		sc.close();
	}
}
