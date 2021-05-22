package application;
//BufferedReader mais otimizado, processa utilizando o buffer de memória, e ele é chamado apartir do FileReader
//Que lê arquivo.(Stream significa sequência)
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program2 {
	public static void main(String[] args) {
		String path = "C:\\Users\\User\\Documents\\Java\\Trabalhando com arquivos\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine(); // Lê a linha
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} 
	}
}
