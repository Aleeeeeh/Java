package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Contribuintes;
import Entities.Fisica;
import Entities.Juridica;

public class Program {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuintes> list = new ArrayList<>();
		
		System.out.print("Digite o n�mero de contribuintes: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Dados do Contribuinte N� #" + i);
			System.out.print("Pessoa ou Empresa (P/E) ?");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			double renda = sc.nextDouble();
			if(ch == 'P') {	
				System.out.print("Gastos com sa�de: ");
				double saude = sc.nextDouble();
				list.add(new Fisica(nome, renda, saude));
			}
			else {
				System.out.print("N�mero Funcion�rios: ");
				int fun = sc.nextInt();
				list.add(new Juridica(nome, renda, fun));
			}
		}
		double sum = 0.0;
		System.out.println();
		System.out.println("Impostos Pagos: ");
		for(Contribuintes cont : list) {
			double imposto = cont.imposto();
			System.out.println(cont.getNome() + ": $" + String.format("%.2f", imposto));
			sum += imposto;
		}
		System.out.println();
		System.out.println("Total de impostos: $ " + String.format("%.2f", sum));
		sc.close();
	}

}
