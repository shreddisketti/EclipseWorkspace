

import java.util.Scanner;

public class userInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
	//	System.out.println("Hello");
	//	System.out.println("World");
		
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.println("Welcome, " + name);
		
		
		int selection = 0;
		
		while (selection != 4) {
		System.out.println("Select An option.");
		System.out.println("1) add candybar to shopping cart for 1.99");
		System.out.println("2) add cheese to shopping cart for 6.95");
		System.out.println("3) add soccer ball for 12.99");
		sisout
		
		int selection = sc.nextInt();
		double total = 0;
		
		switch (selection) {
		case 1:
			total += 1.99;
			break;
			
		case 2:
			total += 6.95;
			break;
		case 3:
			total += 12.99;
		case 4:
			
		default:
			System.out.println("Pleae pick a valid option");
		}
	}

}
