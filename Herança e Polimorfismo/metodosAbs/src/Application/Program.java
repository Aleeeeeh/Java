package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.circle;
import Entities.retangle;
import Entities.shape;
import Entities.enums.Color;

public class Program {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shape: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c): ");
			char ch = sc.next().charAt(0);
			System.out.print("Color (BLACK/ BLUE/ RED): ");
			Color color = Color.valueOf(sc.next());
			if(ch == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				list.add(new retangle(color, width, height));
				
			}else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new circle(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("Shape Areas: ");
		for(shape shap : list) {
			System.out.println(String.format("%.2f", shap.area()));
//Como a classe shape é abstrata, faz com que só retangle e circle seja instaciada			
		}
		
		sc.close();
	}

}
