import java.util.Scanner;

public class main5 {//Verificar a duração de um jogo
	public static void  main(String args[]) {
		Scanner sc =new Scanner(System.in);
		
		int inicial,finaal,duracao;
		inicial = sc.nextInt();
		finaal = sc.nextInt();
		
		if(inicial<finaal) {
			duracao = finaal - inicial;
		}else {
			duracao = 24 - inicial + finaal;
		}
		System.out.println("O jogo durou : " + duracao +" HORAS!");
	}
	

}
