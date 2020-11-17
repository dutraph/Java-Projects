package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import model.services.OnlinePaymentService;
import model.services.PaypalService;

public class Program2 {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		OnlinePaymentService ps = new PaypalService();
		System.out.println(ps.interest(200.00, 3));
		

		
		
		sc.close();
	}

}
