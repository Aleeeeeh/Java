package Application;
//Exemplo de laço for each usado para simplificar na hora de percorrer coleções
public class forEach {
	public static void main(String args[]) {
		
		String[]vect = new String[] {"Alefe", "Thaylane", "Alane"};
		
		for (int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		System.out.println("-----------------");
		for(String obj : vect) { //Para cada objeto obj contido no vetor vect faça(percorre todo vetor)
			System.out.println(obj);
		}
		
	}

}
