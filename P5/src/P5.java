import java.util.Scanner;

//P5 project
//Author: Lingyang Zhu
//Date:   Oct. 5, 2015
//Class:  CS160
//Email:  lyzhu@rams.colostate.edu
public class P5 {
	public static void main(String[] args) {
//		 //Test isPrime
//		 System.out.println("Test isPrime");
//		 printPrimes(1, 10);
//		 System.out.println();
//		
//		 //Test removeVowels
//		 System.out.println("Test removeVowels");
//		 
//		 System.out.println(removeVowels("pizza"));
//		 System.out.println();
//		
//		 //Test evaluateExponent
//		 System.out.println("evaluateExponent");
//		 System.out.println(evaluateExponent(5.5, 3));
//		 System.out.println();
//		
//		 //Test computeStatistics
//		 System.out.println("Test computeStatistics");
//		 computeStatistics(5);
//		 System.out.println();

		// Preliminary testing
		printPrimes(1, 50);
		System.out.println(removeVowels("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
		double result = evaluateExponent(2.0, 16);
		System.out.println("2.0 to the 16 = " + result);
		computeStatistics(-1);

	}

	// Method to check whether an integer is prime.
	public static boolean isPrime(int number) {

		for (int i = 2; i <= number / 2; i++)
			if (number % i == 0)
				return false;
		return true;
	}

	// Method to print primes in a specified range
	public static void printPrimes(int start, int end) {
		for (int c = start; c <= end; c++)
			if (isPrime(c)) {
				System.out.print(c + ", "); }
		System.out.println();

	}

	// Method to remove vowels from a string
	public static String removeVowels(String input) {
		String remVow = "";
		for (int a = 0; a < input.length(); a++) {
			// input = input.toUpperCase();
			char ch = input.charAt(a);
			switch (ch) {
			case 'A':case 'a':case 'E':case 'e':case 'I':case 'i':case 'O':case 'o':case 'U':case 'u':
				break;
			default:
				remVow = remVow + (ch);
			}
		}
		return remVow;
	}

	// Method to generate and print the value of a number raised to an exponent
	public static double evaluateExponent(double number, int exponent) {
		double result = 1.0;
		if (exponent == 0) {
			return result;}
		int loop = 0;
		do {
			result = result * number;
			loop++;
			} while (loop != exponent);
		return result;
	}

	// Method to find and print the minimum/maximum/mean of a set of positive
	// numbers
	public static void computeStatistics(int sentinel) {
		Scanner keyboard = new Scanner(System.in);
		int value = 0, count = 0, minimum = Integer.MAX_VALUE, maximum = Integer.MIN_VALUE;
		double mean = 0.0;
		while (true) {
			value = keyboard.nextInt();
			if (value == sentinel) {
				break;}
			if (value < minimum) {
             	minimum = value;}
			if (value > maximum) {
				maximum = value;}
			mean += value;
			count++;}
		mean /= count;
		System.out.println("Count: " + count);
		System.out.println("Average: " + mean);
		System.out.println("Maximum: " + maximum);
		System.out.println("Minimum: " + minimum);
		keyboard.close();
        }
}
