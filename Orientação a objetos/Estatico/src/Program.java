import java.util.Locale;
import java.util.Scanner;
//Ler um n�mero e mostrar qual a circunfer�ncia, volume de uma esfera.
public class Program {
	
	public static final double PI = 3.14159; //Final para mostrar que PI � uma constante n�o pode mudar o valor.
	public static void main(String args []) {
		
		Scanner sc  =new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		System.out.println("Enter radius: ");
		
		double radius = sc.nextDouble();
		double c = circumference (radius);
		double v = volume (radius);
		
		System.out.printf("Circunference:  %.2f%n",c);
		System.out.printf("Volume:  %.2f%n",v);
		System.out.printf("PI value: %.2f%n",PI);
		
		
		sc.close();
		
		
	}
	//Static porque circunference e volume est�o dentro do m�todo static 
	public static double circumference (double radius) {//Calculo da circunferencia 2 x Pi x radius
		return 2.0 * PI * radius;
	}
	public static double volume (double radius) { //Calculo de volume 4 x PI x radius ao cubo
		return 4.0 * PI * radius * radius * radius / 3.0; 
	}
	
}
//Possivel fazer esse mesmo programa criando objeto, entao as funcoes circumference e volume
//em outra classe chamada calculator em novo pacote chamado util "utilit�rio"
//n�o precisaria do static
