package Application;

import java.io.ObjectInputStream.GetField;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.ImportedProduct;
import Entities.product;
import Entities.usedProduct;

public class program {
	public static void main(String args[]) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		List<product> list = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + "data:");

			System.out.print("Common, used or imported (c/u/i): ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name:");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();

			if (ch == 'c') {
				list.add(new product(name, price));
			} else if (ch == 'u') {
				System.out.print("Manufacture Date: ");
				Date date = sdf.parse(sc.next());
				list.add(new usedProduct(name, price, date));
			} else {
				System.out.print("CustomsFee: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}

		}
		
		System.out.println();
		System.out.println("Price Tags: ");
		for(product prod : list) {
			System.out.println(prod.priceTag());
		}

		sc.close();
	}

}
