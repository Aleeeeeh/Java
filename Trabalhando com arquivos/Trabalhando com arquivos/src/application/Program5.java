package application;

import java.io.File;
import java.util.Scanner;

//Informações do caminho do arquivo
public class Program5 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter a file path: ");
	String strPath = sc.nextLine();
	File path = new File(strPath);
	
	System.out.println("getName: " + path.getName());
	System.out.println("GetParent: " + path.getParent());
	System.out.println("GetPath: " + path.getPath());
	
	sc.close();
	}

}
