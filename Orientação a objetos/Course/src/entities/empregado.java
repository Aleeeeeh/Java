package entities;

public class empregado {
	public String name;
	public double gross_salary;
	public double tax;
	
	public double netSalary() {
		return gross_salary-tax;
	}
	public void increasySalary(double percentage) {
		gross_salary += gross_salary * percentage /100.0;
	}
	/*To string nessa classe, pois nome impresso na outra Classe está no objeto "emploey"
	por isso tem de converter aqui nessa classe para tipo String.
	 */
	public String toString() {
		return name + ", $" + String.format("%.2f", netSalary()); 
	}
	
}
