package bitwise;

import java.util.Scanner;
                                               //(128 64 32 16 8 4 2 1)
//verificando se o sexto número binário usando 32 (0010 0000) é verdadeiro
public class exemplo {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int mask = 32;
		int n = sc.nextInt();
		
		if((n & mask) != 0){
			System.out.println("6th bit is true");
		}
		else {
			System.out.println("6th bit is false");
		}
		
		sc.close();
	
	}
}
