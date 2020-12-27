import java.util.Locale;
import java.util.Scanner;
import entities.triangle2;//Importar da outra classe ctrl+shif+o

//Calcular area de dois trinagulos e ver qual é o maior

public class triangle {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		triangle2 x,y;
		x = new triangle2();//instanciar(criar um objeto)
		y = new triangle2();
		
		
		System.out.println("Enter the measures of triangle x:" );
		
		x.a = sc.nextDouble();//Usar a variável mais ".",para instanciar com variavel a ,b e c criada na outra classe
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle y:" );
		
		
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX=x.area();
		double areaY=y.area();
		
		System.out.printf("triangle x area: %.4f%n",areaX);
		System.out.printf("triangle y area: %.4f%n",areaY);
		
		if(areaX>areaY) {
			System.out.println("Larger area x! ");
		}else {
			System.out.println("Larger area Y! ");
		}
		
		sc.close();
		
	}

}
