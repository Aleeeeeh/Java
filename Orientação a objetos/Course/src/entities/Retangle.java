package entities;

public class Retangle {
	public double width;
	public double height; //Atributos
	
	public double area() {  //Criando função para calcular area
		return width * height;
	}
	public double perimeter() {
		return 2 * (width + height);
	}
	public double diagonal() {
		return Math.sqrt(width * width + height * height);
	}
	
}
