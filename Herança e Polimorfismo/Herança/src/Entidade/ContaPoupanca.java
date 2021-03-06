package Entidade;

public final class ContaPoupanca extends Conta { // Final evita que essa classe seja herdada
	private double taxa_juro;
	
	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Integer numero, String titular, Double saldo, double taxa_juro) {
		super(numero, titular, saldo);
		this.taxa_juro = taxa_juro;
	}
	
	public double getTaxa_juro() {
		return taxa_juro;
	}
	public void setTaxa_juro(double taxa_juro) {
		this.taxa_juro = taxa_juro;
	}
	public void atualizarSaldo() {
		saldo += saldo * taxa_juro;
	}
	@Override //Sobrescrever
	public void saque (double montante) {
		saldo -= montante;
	}

}
