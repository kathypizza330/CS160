import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

//Q7 Quiz
//Author: Lingyang Zhu
//Date:   Dec. 9, 2015
//Class:  CS160
//Email:  lyzhu@rams.colostate.edu
public class Q7 implements QuizInterface{
	//Declear
	public static String [] myTokens;
	public static double [] myDoubles = new double[8];
	//Main
	public static void main(String[] args) {
		Q7 q7 = new Q7();
		q7.readFile(args[0]);
		System.out.println("Number of Tokens: " + myTokens.length);
		int frequency = q7.charFrequency(myTokens, 'e');
		System.out.println("Character Frequency " + frequency); 
		q7.initializeArray(myDoubles);
		System.out.println("Array: " + Arrays.toString(myDoubles));
		double sum = q7.sumRange(myDoubles, 3, 6);
		System.out.println("Sum: " + sum); 
	}

	public void readFile(String filename) {
		try{
			File in = new File(filename);
			Scanner fileReader = new Scanner(in);
			int numberTokens = fileReader.nextInt();
			myTokens = new String[numberTokens];
			fileReader.nextLine();
			for (int i=0; i<myTokens.length; i++){
				myTokens[i]=fileReader.next();
			}
			fileReader.close();
		}catch (IOException e){
			//System.out.println(e);
		}
	}

	public int charFrequency(String[] strings, char match) {
		int count = 0;
		for(int i = 0; i<strings.length; i++){
			String s = strings[i];
			for(int j=0; j<s.length(); j++){
				if (s.charAt(j)==match)
					count++;
			}
		}
		return count;
	}

	public void initializeArray(double[] values) {
		for(int i = 0; i<values.length; i++){
			values[i]=Math.pow(i, 3);
		}
	}

	public double sumRange(double[] values, int low, int high) {
		double x = 0.0;
		for(int i = low; i<=high; i++){
			x+=values[i];
		}
		return x;
	}

}
