import java.util.Arrays;

//Q4 Quiz
//Author: Lingyang Zhu
//Date:   Oct. 28, 2015
//Class:  CS160
//Email:  lyzhu@rams.colostate.edu

public class Q4 {
	//Declare variables
	public static int [] numbers = {11, 321, 4716, 6, 32768, 981};
	public static double [] decimals = {1.01, 2.02, 3.03, 4.04, 5.05};
	public static String [] names = {"Computer", "Science", "is", "challenging!"};
	//Create methods
	public static void arrayStuff(int [] numbers){
		System.out.println(numbers.length);
		System.out.println(numbers[1]);
		System.out.println(Arrays.toString(numbers));
		numbers[2] = 444;
		System.out.println(Arrays.toString(numbers));
		numbers[numbers.length-1] = 11111;
		System.out.println(Arrays.toString(numbers));
		for (int i = 1; i<numbers.length; i++){
			numbers[i] = 24;
		}
		System.out.println(Arrays.toString(numbers));
	}
	
	public static int frequency(double [] dArray, double dValue){
		int count = 0;
		for (int i = 0; i<dArray.length; i++){
			if (dArray[i]==dValue)
				count +=1;
		}
		return count;
	}
	
	public static double [] squareRoot(int [] iArray){
		double [] result = new double [iArray.length];
		for (int i = 0; i<iArray.length; i++){
			double a = (double) iArray[i];
			result[i] = Math.sqrt(a);
		}
		return result;
	}
	
	public static int countChars(String [] sArray){
		int count = 0;
		for (int i = 0; i<sArray.length; i++){
			count += sArray[i].length();
		}
		return count;
	}
	
	public static void main(String[] args) {
		arrayStuff(numbers);
		System.out.println(frequency(decimals, 2.02));
		System.out.println(Arrays.toString(squareRoot(numbers)));
		System.out.println(countChars(names));
	}
	

}
