import java.util.Scanner;

public class Main4 { //Verificar Se os dois números são multiplos
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("Digite os números na sequencia: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a % b == 0||b % a == 0){
			System.out.println("São multiplos!");
		}else {
			System.out.println("Não são multiplos");
		}
			sc.close();
	}
}
