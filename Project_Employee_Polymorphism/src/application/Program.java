package application;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> employee = new ArrayList<Employee>();

		System.out.print("Enter the number of employees: ");
		int numbEmployee = sc.nextInt();

		for (int i = 0; i < numbEmployee; i++) {
			System.out.println("Employee #" + (i + 1) + ": ");
			System.out.print("Outsourced (y/n): ");
			String answ = sc.next();
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Hours: ");
			Integer hours = sc.nextInt();
			System.out.print("Value/Hour: ");
			Double valuePerHour = sc.nextDouble();
			
			if (isOutsourced(answ)) {
				System.out.print("Additional charge: ");
				Double additionalCharge = sc.nextDouble();
				employee.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));

			} else {
				employee.add(new Employee(name, hours, valuePerHour));
			}

		}

		System.out.println();
		System.out.println("PAYMENTS: ");
		for (Employee e : employee) {
			System.out.println(e);
		}

		sc.close();

	}

	public static boolean isOutsourced(String answ) {
		if (answ.charAt(0) == 'y') {
			return true;
		} else
			return false;
	}
}
