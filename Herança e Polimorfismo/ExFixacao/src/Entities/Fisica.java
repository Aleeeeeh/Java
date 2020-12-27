package Entities;

public class Fisica extends Contribuintes {
	private double gastos_saude;

	public Fisica() {
		super();
	}
	public Fisica(String nome, double renda_anual, double gastos_saude) {
		super(nome, renda_anual);
		this.gastos_saude = gastos_saude;
	}
	public double getGastos_saude() {
		return gastos_saude;
	}
	public void setGastos_saude(double gastos_saude) {
		this.gastos_saude = gastos_saude;
	}
	
	@Override
	public double imposto() {
		if(getRenda_anual() < 20000.00) {
			return getRenda_anual() * 0.15 - gastos_saude * 0.5;
		}
		else {
			return getRenda_anual() * 0.25 - gastos_saude * 0.5;
		}
	}
}
