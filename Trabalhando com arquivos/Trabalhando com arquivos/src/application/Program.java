package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	public static void main(String args[]) {
		File file = new File("C:\\Users\\User\\Documents\\Java\\Trabalhando com arquivos\\in.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) { //Verifica se tem mais uma linha
				System.out.println(sc.nextLine()); //Lê a próxima linha
			}
		}catch(IOException e) {
				System.out.println("Error: " + e.getMessage());
			}finally {
				if(sc != null) {
					sc.close();
				}
			}
		}
	}
