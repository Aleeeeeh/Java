package Entities;

public class Juridica extends Contribuintes {
	
	private int numero_funcionarios;
	
	public Juridica() {
		super();
	}
	public Juridica(String nome, double renda_anual, int numero_funcionarios) {
		super(nome, renda_anual);
		this.numero_funcionarios = numero_funcionarios;
	}
	public int getNumero_funcionarios(){
		return numero_funcionarios;
	}
	public void setNumero_funcionarios(int numero_funcionarios) {
		this.numero_funcionarios = numero_funcionarios;
	}
	@Override
	public double imposto() {
		if(numero_funcionarios >= 10) {
			return getRenda_anual() * 0.14 ;
		}
		else {
			return getRenda_anual() * 0.16;
		}
	}
}
