package Entidade;

public class ContaNegocio extends Conta {
	private Double emprestimo;

	public ContaNegocio() {
		super();
	}

	public ContaNegocio(Integer numero, String titular, Double saldo, Double emprestimo) {
		super(numero, titular, saldo);
		this.emprestimo = emprestimo;
	}

	public Double getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(Double emprestimo) {
		this.emprestimo = emprestimo;
	}

	// Suponhando que o empréstimo tenha uma taxa de 10.0
	public void emprestimo(double montante) {
		if (montante <= emprestimo) {
			saldo += montante - 10.0;
		}
		}

	@Override //Sobreposição
	public void saque(double montante) {
		super.saque(montante);
		saldo -= 2.0;
	}
}
