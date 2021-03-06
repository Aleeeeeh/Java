package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entitties.OutsourceEmployee;
import Entitties.employee;

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employee: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Employee #" + i + "data: ");
			System.out.print("OutSource (s/n): ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("ValuePerHour: ");
			double valuePerHour = sc.nextDouble();
			
			if(ch == 's') {
				System.out.print("AdditionalCharge: ");
				double additionalCharge = sc.nextDouble();
				 list.add(new OutsourceEmployee(name, hours, valuePerHour, additionalCharge));
				
			}
			else {
				list.add(new employee(name, hours, valuePerHour));
		
			}
		}
			System.out.println();
			System.out.println("Payments: ");
			for(employee emp : list) {
				System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
			}
			sc.close();
		}
		
	}


