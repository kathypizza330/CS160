// R3 Recitation
// Author: Lingyang Zhu
// Date:   Sep 2, 2015
// Class:  CS160
// Email:  lyzhu@rams.colostate.edu

import java.util.Scanner;

public class R3 {

	public static void main(String[] args) {
		
//		// Using String methods: charAt, indexOf, length, substring
//        String string2 = "Here is a test string";
//        System.out.println(string2.charAt(2));       // prints "r"
//        System.out.println(string2.indexOf("s"));    // prints 6
//        System.out.println(string2.indexOf("x"));    // prints -1
//        System.out.println(string2.length());        // prints 21
//        System.out.println(string2.substring(8,14)); // prints "a test"
//        
//        // Keyboard input example
//        Scanner keyboard = new Scanner(System.in);
//        System.out.print("Enter a String: ");
//        String string1 = keyboard.nextLine();
//        System.out.println(string1);
//        System.out.print("Enter a Double: ");
//        double x = keyboard.nextDouble();
		 
		//Declare variables
		String myString0 = "Java";
		String myString1 = "Programming";		
		String myString2 = "Language";
		
		//print
		System.out.println(myString0 + " is a " + myString1 + " " + myString2 + ".");
		System.out.println(myString1.length()+myString2.length());
		System.out.println(myString1.charAt(1)+","+myString1.charAt(3)+","+myString1.charAt(6));
		System.out.println(myString0.indexOf("a"));
		System.out.println(myString2.toUpperCase());
		System.out.println(myString1.substring(2, 8));
		
		//Keyboard input
		Scanner keyboard = new Scanner(System.in);
		int myInteger = 0;
		double myDouble = 0.0;
		System.out.print("Enter an integer: ");
		myInteger = keyboard.nextInt();
		System.out.println("myInteger = " + myInteger);
		System.out.print("Enter a double: ");
		myDouble = keyboard.nextDouble();
		System.out.printf("myDouble = %.5f\n",myDouble);
		
		
		
		//Close scanner
		keyboard.close();

	}
}