package Application;
//Exemplo de la�o for each usado para simplificar na hora de percorrer cole��es
public class forEach {
	public static void main(String args[]) {
		
		String[]vect = new String[] {"Alefe", "Thaylane", "Alane"};
		
		for (int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		System.out.println("-----------------");
		for(String obj : vect) { //Para cada objeto obj contido no vetor vect fa�a(percorre todo vetor)
			System.out.println(obj);
		}
		
	}

}
