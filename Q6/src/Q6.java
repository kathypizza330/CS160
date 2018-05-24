import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

//Q6 Quiz
//Author: Lingyang Zhu
//Date:   Dec. 7, 2015
//Class:  CS160
//Email:  lyzhu@rams.colostate.edu
public class Q6 implements QuizInterface {
	public static int numberLines = 0, numberChars = 0, numberLower = 0,
			numberUpper = 0, numberDigits = 0;
	public static String[] fileContents;
	public static double[] testArray = { 1.2, 2.3, 3.4, 4.5, 5.6, 6.7, 7.8, 8.9 };

	public void readFile(String filename) {
		try {
			File inputFile = new File(filename);
			Scanner fileReader = new Scanner(inputFile);
			numberLines = fileReader.nextInt();
			fileReader.nextLine();
			fileContents = new String[numberLines];
			for (int i = 0; i < numberLines; i++) {
				fileContents[i] = fileReader.nextLine();
			}
		} catch (IOException e) {
		}
	}

	public void computeStatistics(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			numberChars += strings[i].length();
			for (int j = 0; j < strings[i].length(); j++) {
				String s = strings[i];
				if (s.charAt(j) <= 'z' && s.charAt(j) >= 'a')
					numberLower++;
				if (s.charAt(j) <= 'Z' && s.charAt(j) >= 'A')
					numberUpper++;
				if (s.charAt(j) <= '9' && s.charAt(j) >= '0')
					numberDigits++;
			}
		}
	}

	public void printStatistics() {
		System.out.println("Number of lines: " + numberLines);
		System.out.println("Number of characters: " + numberChars);
		System.out.println("Number of uppercase letters: " + numberUpper);
		System.out.println("Number of lowercase letters: " + numberLower);
		System.out.println("Number of digits: " + numberDigits);

	}

	public void writeFile(String filename, String[] strings) {
		try {
			File outFile = new File(filename);
			PrintWriter out = new PrintWriter(outFile);
			for (int i = 0; i < strings.length; i++) {
				out.println(i + 1 + ": " + strings[i]);
			}
			out.close();
		} catch (IOException e) {
		}
	}

	public double findSmallest(double[] values) {
		double s = values[0];
		for (int i = 1; i < values.length; i++) {
			if (values[i] < s) {
				s = values[i];
			}
		}
		return s;
	}

	public static void main(String[] args) {
		Q6 q6 = new Q6();
		q6.readFile(args[0]);
		q6.computeStatistics(fileContents);
		q6.printStatistics();
		q6.writeFile(args[1], fileContents);

		System.out.println("Array = " + Arrays.toString(testArray));
		System.out.println("Smallest value = " + q6.findSmallest(testArray));
	}

}
