package Application;

import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import Entities.Account;
import Exception.DomainException;

public class Program {
	public static void main(String args[]) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter Account data: ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial Balance: ");
		double balance = sc.nextDouble();
		System.out.print("withdraw limit: ");
		double limit = sc.nextDouble();

		Account acc = new Account(number, holder, balance, limit);
		
		System.out.println();
		System.out.print("Enter amount for withdraw:");
		double amount = sc.nextDouble();
		
			acc.withdraw(amount);
			System.out.println("New Balance: " + String.format("%.2f", acc.getBalance()));
		}
		catch (DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("oh nao");
		}
		
		sc.close();
	}

}
