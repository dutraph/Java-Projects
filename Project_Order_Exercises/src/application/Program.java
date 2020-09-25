package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdfBD = new SimpleDateFormat("dd/MM/yyyy");
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss ");

		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth Date (DD/MM/YYYY): ");
		Date date = sdfBD.parse(sc.next());
		sc.nextLine();
		
		System.out.print("Status: ");
		String orderStatus = sc.nextLine();
		OrderStatus status = OrderStatus.valueOf(orderStatus);
		OrderItem orderItems;
		Product prod;
		Order order = new Order();
		Client c1 = new Client(name, email, date);
		//System.out.println(c1);
		
		
		
		System.out.print("How many items in this order?  ");
		int numItems = sc.nextInt();

		for (int i = 0; i < numItems; i++) {
			System.out.println("Enter " + (i + 1) + " item data: ");
			System.out.print("Product name: ");
			sc.nextLine();
			String prodName = sc.nextLine();
			System.out.print("Product price: ");
			Double price = sc.nextDouble();
			prod = new Product(prodName, price);
			
			System.out.print("Qty: ");
			Integer quantity = sc.nextInt();
			orderItems = new OrderItem(prod, quantity, prod.getUnityPrice());
			order.addItem(orderItems);
		}	
		
		order.setClient(c1);
		order.setStatus(status);
		System.out.println(order);
		
		sc.close();
		
	}

}
