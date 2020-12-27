package Entidade;

public class Conta {
	private Integer numero;
	private String titular;
	protected Double saldo; //Conseguimos acessar com a outra classe
	
	public Conta() {	
	}
	
	public Conta(Integer numero, String titular, Double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public void saque(double montante) {
		saldo -= montante + 5.0;
	}
	public void deposito(double montante) {
		saldo += montante;
	}
}	
