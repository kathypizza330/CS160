import java.util.Scanner;
//R6 Recitation
//Author: Lingyang Zhu
//Date:   Sep 16, 2015
//Class:  CS160
//Email:  lyzhu@rams.colostate.edu
public class R6 {
	public static void main(String[] args) {
//		Scanner keyboard = new Scanner(System.in);
//		System.out.print("Please enter your age: ");
//		int age = keyboard.nextInt();
//
//		switch (age)
//		{
//			case 21:
//				System.out.println("You are 21 and the same age as Miley Cyrus!  Not sure if that's good or bad.");
//				break;
//			case 18:
//				System.out.println("You're 18 years old! and the same age as Zendaya.  No idea who she was -- I had to Google her.");
//				break;
//		 	case 20:
//				System.out.println("You're 20 years old and the same age as Justin Bieber!  Has he retired yet?");
//				break;
//			case 16:
//				System.out.println("You're 16 years old and the same age as Jaden 'Don't call me Will' Smith!");
//				break;
//			default:
//				System.out.println("Oops! You're not the age of any people I know.");
//				break;
//		}		
//
//		keyboard.close();
//		System.out.println("End of program.");
//		//////////
//		Scanner keyboard = new Scanner(System.in);
//		System.out.print("Please enter your first name: ");
//		String firstName = keyboard.next().toLowerCase();
//
//		switch (firstName)
//		{
//			case "miley":
//				System.out.println("Do you like to twerk?");
//				break;
//		 	case "justin":
//				System.out.println("I have Bieber-fever.");
//				break;
//			case "chris":
//				System.out.println("You must love chai from the Alley Cat.");
//				break;
//			case "arnold":
//				System.out.println("Get to da choppa!!");
//				break;
//			default:
//				System.out.println("Sorry mate, I don't recognize your first name.");
//				break;
//		}		
//
//		keyboard.close();
//		System.out.println("End of program.");
//		//////////
//		Scanner keyboard = new Scanner(System.in);
//		System.out.print("Please enter a letter: ");
//		char myChar = keyboard.next().charAt(0); // what's going on here?
//
//		switch (myChar)
//		{
//			case 'a':
//				System.out.println("a!");
//			case 'b':
//				System.out.println("b!");
//		 	case 'c':
//				System.out.println("c!");
//				break;
//			case 'd':
//				System.out.println("d!");
//			default:
//				System.out.println("I'm the fallback case.");
//		}		
//
//		keyboard.close();
//		System.out.println("End of program.");
		//////////
		Scanner keyboard = new Scanner(System.in);

		// Here we print a welcome message
		System.out.println("Welcome to a simple calculator program!");
		System.out.println("---------------------------------------");
		System.out.println("All we know how to do is add, subtract, multiply, divide, and compute modulo.");
		System.out.println();

		// Here we get input from the user
		System.out.print("Please enter a the first number of your calculation: ");
		double lhs = keyboard.nextDouble();

		System.out.print("Please enter the operator (+|-|*|/|%|^): ");
		String op = keyboard.next();
		// ADD: get operator using Scanner object

		System.out.print("Please enter a the second number of your calculation: ");
		double sec = keyboard.nextDouble();
		// ADD: get the second number use the Scanner object
	
		// Here we will calculate the result:
		// ADD: write a switch statement that will calculate
		double result = 0.0;
		switch (op)
		{
		    case "+":
		        result = lhs + sec;
		        break;
		    case "-":
		    	result = lhs - sec;
		        break;
		    case "*":
		    	result = lhs * sec;
		    	break;
		    case "/":
		    	result = lhs / sec;
		    	break;
		    case "%":
		    	result = lhs % sec;
		    	break;
		    case "^":
		    	result = Math.pow(lhs, sec);
				break;
		    default:
		        System.out.println("This is not a right operator!");
		    
		}
		// the correct result.

        switch (op)
        {
        case "+":
	    case "-":
	    case "*":
	    case "/":
	    case "%":
	    case "^":
		// Here we will print the result
		System.out.println("---------------------------------------");
		System.out.println("Result:");
		// ADD: print the answer to the calculation using the
		// so it looks like: "2.44 - 1.44 = 1.00"
		System.out.printf("%.5f %s %.5f = %.5f\n", lhs , op , sec , result);
        }
		keyboard.close();
		System.out.println("End of program.");
		
		
		//////////
		
		
		
		
		
		
		
		
	}

}
