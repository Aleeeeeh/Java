import java.util.Scanner;

public class Tabuada {
	public static void main(String args[]) {
		
	Scanner sc = new Scanner(System.in);
	
	int x =sc.nextInt();
	
	for(int i=1; i<11; i++) {
		int tabuada = i * x;
		System.out.println(i + "x" + x + " = " + tabuada);
	}
	sc.close();
	}

}
