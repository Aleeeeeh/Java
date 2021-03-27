package application;
//FileWriter cria ou recria arquivo, colocando new FileWriter(path,true) ele adiciona o texto ao inv�s de recriar.
//BufferedWriter � otimizado do processo usando o buffer de mem�ria
//Arquivo j� existente ele deleta conte�do e adiciona novo, se colocar o true ele adiciona o cont�udo.
//Se arquivo n�o existir cria o arquivo
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Program3 {
	public static void main(String args[]) {
		String[]lines = new String[] {"Bom dia","Boa tarde","Boa noite"};
		
		String path = "C:\\Users\\User\\Documents\\Java\\Trabalhando com arquivos\\new.txt";
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){
			for(String line : lines) {
				bw.write(line); //Escreve linha
				bw.newLine(); //Quebra de linha
				System.out.println("100%...");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
