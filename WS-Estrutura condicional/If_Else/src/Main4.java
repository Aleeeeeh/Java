import java.util.Scanner;

public class Main4 { //Verificar Se os dois n�meros s�o multiplos
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("Digite os n�meros na sequencia: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a % b == 0||b % a == 0){
			System.out.println("S�o multiplos!");
		}else {
			System.out.println("N�o s�o multiplos");
		}
			sc.close();
	}
}
