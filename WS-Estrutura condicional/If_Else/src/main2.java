import java.util.Scanner;

public class main2 {
	public static void main(String args[]) {
		//Estrutura de condi��o composta (Encadeada, mais de um if)
		
		Scanner sc = new Scanner (System.in);
		
		int horas;
		
		System.out.println("Que horas s�o: ");
		horas = sc.nextInt();
		
		if(horas<12) {
			System.out.println("Bom dia! ");
		}
		else if(horas<18) {
			System.out.println("Boa tarde! ");
		}
		else {
			System.out.println("Boa Noite!");
		}
		        sc.close();  
		
	}

}
