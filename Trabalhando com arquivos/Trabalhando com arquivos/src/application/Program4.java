package application;

import java.io.File;
import java.util.Scanner;

//Manipulando pastas com File 
public class Program4 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a fold path: ");
	String strPath = sc.nextLine();
	
	File path = new File(strPath);
	//Listando pastas apartir do diretório digitado
	File[]folders = path.listFiles(File::isDirectory);
	System.out.println("FOLDERS:");
	for(File folder : folders) {
		System.out.println(folder);
	}
	
	//Listando arquivos (Parâmetro usando expressôes lambda)
	File[] files = path.listFiles(File::isFile);
	System.out.println("FILES: ");
	for(File file : files) {
		System.out.println(file);
	}
	
	//Criando arquivo no diretório
	boolean sucess = new File(strPath + "\\pastaNova").mkdir();
	System.out.println("Directory created sucessfully: " + sucess);
			
	sc.close();
	}

}
