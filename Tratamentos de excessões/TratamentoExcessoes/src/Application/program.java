package Application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class program {
	public static void main(String args[]) {
	
		metodo1();
		System.out.println("Fim do Programa !");
	}
		
		public static void metodo1() {
			System.out.println("*** Método1 Start***");
			metodo2();
			System.out.println("*** Método1 End***");
		}
	
		public static void metodo2() {
			System.out.println("***Método2 Start");
			Scanner sc = new Scanner(System.in);
			
			try {
				String vect[] = sc.nextLine().split(" ");
				int position = sc.nextInt();
				System.out.println(vect[position]);
			}
			catch(IndexOutOfBoundsException e) {
				System.out.println("Posição Inválida !");
				e.printStackTrace();
				sc.next(); //Apenas para digitar e mostrar que o programa não finaliza
				//pois o printStackTrace mostra as excessoes sem que o programa finalize
			}
			catch(InputMismatchException e) {
				System.out.println("Erro na entrada de dados !");
			}
		
		sc.close();
		System.out.println("***Método2 End***");
	}
}
