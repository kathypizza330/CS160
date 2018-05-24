import java.util.Scanner;

//R8 Recitation
//Author: Lingyang Zhu
//Date:   Sep 28, 2015
//Class:  CS160
//Email:  lyzhu@rams.colostate.edu
public class R8 {
	// Perform methods
	public static double computeTax(double amount, double rate) {
		double tax = amount * rate;
		return tax;
	}

	public static double computeTip(double total, double rate) {
		double tip = total * rate;
		return tip;
	}

	public static void main(String[] args) {

		// Declare variables
		String restaurantName;
		String serverName;
		double subtotal;
		double tax;
		double total;
		double taxRate = 0.05;
		double tipRate1 = 0.10;
		double tipRate2 = 0.15;
		double tipRate3 = 0.20;

		// Ask and receive input from the user
		Scanner keyboard = new Scanner(System.in);
		restaurantName = keyboard.nextLine();
		serverName = keyboard.nextLine();
		serverName = serverName.substring(0,serverName.indexOf(" "));
		serverName = serverName.toUpperCase();
		subtotal = keyboard.nextDouble();
		keyboard.close();

		// Compute tax
		tax = computeTax(subtotal, taxRate);

		// Compute total
		total = subtotal + tax;

		// Compute tip
		// tip = computeTip(total, tipRate1);

		// print
		System.out.println("=====================================");
		System.out.println(restaurantName);
		System.out.println("Your server was: " + serverName);
		System.out.printf("Subtotal: $%.2f\n", subtotal);
		System.out.printf("Tax: $%.2f\n", tax);
		System.out.println("=====================================");
		System.out.printf("Total: $%.2f\n", total);
		System.out.println();
		System.out.println("Suggested tips:");
		System.out.printf("10%%: $%.2f\n", computeTip(total, tipRate1));
		System.out.printf("15%%: $%.2f\n", computeTip(total, tipRate2));
		System.out.printf("20%%: $%.2f\n", computeTip(total, tipRate3));
		System.out.println();
		System.out.println("Thank you!");
		System.out.println("=====================================");

	}

}
