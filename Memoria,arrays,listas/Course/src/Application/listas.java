package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Exemplo de Listas
public class listas {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(); // Instaciando a lista usando a classe de implementa��o
												// ArrayList
		list.add("Alefe");
		list.add("Thaylane");
		list.add("Alane");
		list.add("Ayron");
		list.add(2, "Family");// Obter elemento da posi��o

		System.out.println(list.size()); // Comando para exibir tamanho da lista

		list.remove("Family"); // Compara com valor e remove(possivel apontando a posi��o tambem ex:1,2,3)

		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-------------");
		list.removeIf(x -> x.charAt(0) == 'F');// Remova da lista todo elemento que comece com "A"

		for (String x : list) {
			System.out.println(x);

		}
		System.out.println("----------");
		System.out.println("Index of Thaylane:" + list.indexOf("Thaylane"));// Mostra a posi��o no caso 1
		System.out.println("------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
//stream compativel com lambda (Para exibir todos elemento que come�am com a mesma letra
		for (String x : result) { //La�o for com result
			System.out.println(x);
		}
		System.out.println("------------");
		//findfirst primeiro elemento que come�a com A
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);

	}
}
