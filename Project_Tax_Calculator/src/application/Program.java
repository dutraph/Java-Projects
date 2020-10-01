package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<TaxPayer>();

		System.out.print("Enter the number of tax payers: ");
		int numberOfTaxPayers = sc.nextInt();

		for (int i = 0; i < numberOfTaxPayers; i++) {
			System.out.println("Tax payer #" + (i + 1) + " data:");
			System.out.print("Individual or Company (i/c): ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Annual Income: ");
			Double annualIncome = sc.nextDouble();
			if (type == 'i') {
				System.out.print("Health Expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, annualIncome, healthExpenditures));
			} else {
				System.out.print("Numbers of Employees: ");
				Integer numberOfEmployees = sc.nextInt();
				list.add(new Company(name, annualIncome, numberOfEmployees));
			}
		}
		
		System.out.println();
		
		double sumTax = 0.0;
		System.out.println("TAXES PAID: ");
		for (TaxPayer tp : list) {
			sumTax += tp.calculateTax();
			System.out.println(tp.getName() + ": $" + String.format("%.2f", tp.calculateTax()));
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $" + String.format("%.2f", sumTax));
		sc.close();
	}

}
