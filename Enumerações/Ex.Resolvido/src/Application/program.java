package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.ContratoDeHoras;
import entities.Trabalhador;
import entities.departamento;
import entities.enums.NivelTrabalhador;

public class program {
	public static void main(String args[]) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Digite o nome do Departamento: ");
		String nomeDepartamento = sc.nextLine();
		System.out.println("Digite os dados o Trabalhador ");
		System.out.print("Digite o nome do Trabalhador: ");
		String nomeTrabalhador = sc.nextLine();
		System.out.print("N�vel do trabalhador: ");
		String nivel = sc.nextLine();
		System.out.print("Sal�rio base: ");
		double salBase = sc.nextDouble();
		Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NivelTrabalhador.valueOf(nivel), salBase, new departamento(nomeDepartamento));
		
		System.out.println("Quantos contratos s�o desse trabalhador: ");
		int n = sc.nextInt();
		//Esse for ir� repetir todos dados do trabalhador e contratos
		for (int i=1; i<n; i++) {
		System.out.println("Digite os dados do contrato #" + i + ": " );
		System.out.print("Data do contrato: ");
		Date dataContrato = sdf.parse(sc.next());
		System.out.print("Valor por hora: ");
		double valorHora = sc.nextDouble();
		System.out.print("Dura��o de horas: ");
		int horas = sc.nextInt();
		ContratoDeHoras conHora = new ContratoDeHoras(dataContrato, valorHora, horas);
		//Para associar com objeto acima trabalhador
		trabalhador.adicionarContrato(conHora);
		
		}
		System.out.println("---------------------------");
		System.out.print("Entre com M�s e Ano para calculo da renda (MM/yyyy: ");
		String mes_ano = sc.next();
		int mes = Integer.parseInt(mes_ano.substring(0,2)); //Recorta do 0 a 2
		int ano = Integer.parseInt(mes_ano.substring(3)); // Recorta da 3 posi��o em diante
		System.out.println("Nome: " + trabalhador.getNome()); //Pegar nome do objeto trabalhador
		System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());//Composi��o de objeto
		System.out.println("Renda do M�s" + mes_ano + ": " + String.format("%.2f", trabalhador.renda(mes, ano)));
		
		
		
		sc.close();
	}
}
