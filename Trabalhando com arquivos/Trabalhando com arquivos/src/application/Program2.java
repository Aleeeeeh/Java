package application;
//BufferedReader mais otimizado, processa utilizando o buffer de mem�ria, e ele � chamado apartir do FileReader
//Que l� arquivo.(Stream significa sequ�ncia)
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program2 {
	public static void main(String[] args) {
		String path = "C:\\Users\\User\\Documents\\Java\\Trabalhando com arquivos\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine(); // L� a linha
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} 
	}
}
