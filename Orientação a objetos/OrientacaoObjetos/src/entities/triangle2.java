package entities;

public class triangle2 {
	public double a;
	public double b;
	public double c;
	
	public double area() { //area sem nada nos par�metro pois a,b,c ja est� na classe
		double p = (a + b + c)/2;
		return Math.sqrt(p*(p-a) * (p-b)* (p-c)); 
	}

}
