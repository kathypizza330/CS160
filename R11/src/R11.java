import java.util.Arrays;

//R11 Recitation
//Author: Lingyang Zhu, Garrett Denney
//Date:   Oct.12, 2015
//Class:  CS160
//Email:  lyzhu@rams.colostate.edu
public class R11 {
	public static void main(String[] args) {
		double [] grades = {81.2, 92.5, 48.9, 78.8};
		int [] numbers = {12, 42, 33, 67, 92, 58};
		String [] arguments = new String [9];
		System.out.println(grades.length);
		System.out.println(numbers.length);
		System.out.println(arguments.length);
		System.out.println(grades[3]);
		System.out.println(grades[1]);
		System.out.println(numbers[2]);
		numbers[0] = 99;
		grades[grades.length-1] = 90.5;
		arguments[6] = "HelloThere";
		
		//loop for printing grades
		for (int i = 0; i<grades.length; i++) {
			System.out.print(grades[i]+",");
		}
		System.out.println();
		
		//loop for printing numbers
		for (int j = 0; j<numbers.length; j++) {
			System.out.print(numbers[j]+" ");
		}
		System.out.println();
		
		//loop for printing argumrnts
		for (int h = 0; h<arguments.length; h++) {
			System.out.print(arguments[h]+"_");
		}
		System.out.println();
		
		//Print the contents of grades using Arrays.toString(grades)
		System.out.println(Arrays.toString(grades));
		
		//Print the contents of numbers using Arrays.toString(numbers)
		System.out.println(Arrays.toString(numbers));
		
		//Print the contents of arguments using Arrays.toString(arguments)
		System.out.println(arguments.toString());//Arrays.toString(arguments));
		
		
		//print array average
		System.out.printf("%.3f\n", arrayAverage(grades));
		
		//bonus
		System.out.println(Arrays.toString(swapArray(grades)));
		
	}
    public static double arrayAverage(double [] array) {
    	double average;
    	double sum = 0;
    	for (int i = 0; i<array.length; i++) {
    		sum += array[i];
    	}
    	average = sum/array.length;
    	return average;
    }
    
    
    public static double [] swapArray(double [] array) {
    	double [] newArray = new double [array.length];
    	for (int i = 0; i<array.length; i++) {
    		newArray[i] = array[array.length-1-i];
    	}
    	
    	return newArray;
    }
    
    
    
    
    
}
