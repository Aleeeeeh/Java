package entities;

public class conta {
	private int num_conta;
	private String nome;
	private double deposito;
	
	public conta (int num_conta, String nome) {
		this.num_conta = num_conta;
		this.nome = nome;
	}

	public conta(int num_conta, String nome, double depositoInicial) { 
		super();
		this.num_conta = num_conta;
		this.nome = nome;
		deposit(depositoInicial); //Encapsulamento do metodo deposit
	}

	public int getNum_conta() {
		return num_conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getDeposito() {
		return deposito;
	}
	public void deposit (double amount ) { //variavel criada deposit, amount argumento que soma com deposito
		deposito += amount;
	}
	public void saque (double amount) {
		deposito -= amount + 5.0;  //Será um saque com menos 5 
	}
	public String toString() {
		return "Conta: "
				+ num_conta
				+", Titular: "
				+ nome
				+", Saldo: $"
				+ String.format("%.2f", deposito);
						}
	
}
