package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {
	
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		ArrayList<Product> prodList = new ArrayList<>();
		
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n ; i++) {
			System.out.println("Product #" + (i + 1) + " data: ");
			System.out.print("Common, Used or Imported. (c/u/i): ");
			char type = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Product name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if(type == 'i') {
				System.out.print("Customs fee: ");
				Double customFee = sc.nextDouble();
				prodList.add(new ImportedProduct(name, price, customFee));
			} else if (type == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String StringDate = sc.next();
				Date manufactureDate = sdf.parse(StringDate);
				prodList.add(new UsedProduct(name, price, manufactureDate));
			}else {
				prodList.add(new Product(name, price));
			}	
		}
		
		for (Product product : prodList) {
			System.out.println(product);
		}
		
		sc.close();
	}

}
