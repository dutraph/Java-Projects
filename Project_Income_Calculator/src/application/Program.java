package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;
public class Program {
	
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM/yyyy");
		Calendar cal = Calendar.getInstance();
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		
		System.out.println("Enter the worker data: ");
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Level: (EX: JUNIOR/MID-LEVEL/SENIOR): ");
		String level = sc.nextLine();

		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		
		Worker w1 = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(departmentName));
		
		System.out.print("How many contracts to this worker: ");
		int contNumber = sc.nextInt();
		
		for (int i = 0 ; i < contNumber; i++) {
			System.out.println("Enter contract #" + (i + 1));
			System.out.print("Date (DD/MM/YYYY): ");
			Date date = sdf.parse(sc.next());
			System.out.print("Value/hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration: ");
			int hours = sc.nextInt();
			System.out.println();
			HourContract hc = new HourContract(date, valuePerHour, hours);
			w1.addContract(hc);
		}
		
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		Date incomeDate =  sdf2.parse(sc.next());
		cal.setTime(incomeDate);
		int incMonth = 1 + cal.get(Calendar.MONTH);
		int incYear = cal.get(Calendar.YEAR);
		
		System.out.println("Name: "+ w1.getName());
		System.out.println("Department: "+ w1.getDepartment());
		System.out.print("Income for " + sdf2.format(incomeDate) + ": " + w1.income(incYear, incMonth) );
		
		
		
		sc.close();
		
	}

}
