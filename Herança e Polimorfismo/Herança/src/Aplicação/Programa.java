package Aplica��o;

import Entidade.Conta;
import Entidade.ContaNegocio;
import Entidade.ContaPoupanca;

public class Programa {
	public static void main(String args[]) {

		ContaNegocio cont = new ContaNegocio(1002, "Alefe", 0.0, 500.0);
		Conta cont2 = new Conta(1001, "Thay", 0.0);

		// UpCasting (Converter um obj da subclasse para superClasse

		Conta acc1 = cont2;
		Conta acc2 = new ContaNegocio(1002, "Ayron", 0.0, 200.0);
		Conta acc3 = new ContaPoupanca(1004, "Alane", 0.0, 0.01);

		// DownCasting

		ContaNegocio acc4 = (ContaNegocio) acc2;
		acc4.emprestimo(100.0);

		// ContaNegocio acc5 = (ContaNegocio) acc3;
		//Para fazer DownCasting precisamos usar o instanceOf em caso do obj n�o ser da mesma classe 
		if(acc3 instanceof ContaNegocio) {
			ContaNegocio acc5 = (ContaNegocio) acc3;
			acc5.emprestimo(200.0);
			System.out.println("Empr�stimo");
		}
		if(acc3 instanceof ContaPoupanca) {
			ContaPoupanca acc5 = (ContaPoupanca) acc3;
			acc5.atualizarSaldo();
			System.out.println("Saldo Atualizado ! ");
		}
		
		Conta accex = new Conta(1001, "Aleeh", 1000.0);
		accex.saque(200.0);
		System.out.println("Saldo Disponivel R$ " + accex.getSaldo());
		
		Conta accex1 = new ContaPoupanca(1002, "AleehS", 1000.0, 0.01);
		accex1.saque(200.0);
		System.out.println("Saldo Disponivel em conta Poupan�a R$ " + accex1.getSaldo());
		
		Conta accex2 = new ContaNegocio(1005, "Seila", 1000.0, 500.0);
		accex2.saque(200.0);
		System.out.println("Saldo Disponivel em Conta Empresarial R$ " + accex2.getSaldo());
	}

}
