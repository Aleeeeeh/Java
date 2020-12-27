package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.funcionarios;

public class fixacao {
	public static void main(String args[]) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		List<funcionarios> list = new ArrayList<>();

		// Parte 1 Lendo dados

		System.out.print("Quantos funcionarios ser�o registrados: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Funcion�rio #" + i + ": ");
			System.out.print("id: ");
			int id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Sal�rio: ");
			double salario = sc.nextDouble();
			list.add(new funcionarios(id, nome, salario));
		}

		// Parte 2 Atualiza��o do sal�rio do funcionario

		System.out.println();
		System.out.print("Digite o id do funcion�rio que ter� um aumento salarial: ");
		int id = sc.nextInt();
		funcionarios func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (func == null) {
			System.out.print("Esse id n�o existe");
		} else {
			System.out.print("Digite a porcentagem: ");
			double porcentagem = sc.nextDouble();
			func.aumentoSalarial(porcentagem);
		}
		
		//Parte 3 Lista de funcion�rios
		
		System.out.println();
		System.out.println("Lista de funcion�rios: ");
		for (funcionarios obj : list) {
			System.out.println(obj);
		}

		sc.close();
	}
}
