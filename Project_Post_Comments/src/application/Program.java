package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Trip to NZ", "I'm gonna visit the amazing country... XD", 18);
		p1.addComment(new Comment("Have a nice trip"));
		p1.addComment(new Comment("Wow that´s awesome!!!"));
		
		// ####  Another method using the empty constructor
		
//		System.out.println(p1.getTitle());
//		System.out.println(p1.getLikes() + " Likes - " +p1.getMoment());
//		System.out.println(p1.getContent());
//		System.out.println("Comments: ");
//		for (int i = 0; i < p1.getComments().size(); i++) {
//			System.out.println((i + 1) + " Comment: "+p1.getComments().get(i));
//		}
		
		Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Good night guys", "See you tomorrow", 5);
		p2.addComment(new Comment("Good night."));
		p2.addComment(new Comment("May the Force be with you."));
		
		// ####  Another method using the empty constructor
		
//		System.out.println(p2.getTitle());
//		System.out.println(p2.getLikes() + " Likes - " +p2.getMoment());
//		System.out.println(p2.getContent());
//		System.out.println("Comments: ");
//		for (int i = 0; i < p2.getComments().size(); i++) {
//			System.out.println((i + 1) + " Comment: "+p2.getComments().get(i));
//		}
		
		// Using StringBuilder on toString we might have better performance than using (+) on toString.
		System.out.println(p1);
		System.out.println();
		System.out.println(p2);
		
		
		sc.close();
	}

}
