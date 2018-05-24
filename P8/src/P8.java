import java.util.Arrays;

//P8 project
//Author: Lingyang Zhu
//Date:   Oct. 26, 2015
//Class:  CS160
//Email:  lyzhu@rams.colostate.edu
public class P8 {
	public static int [] createIntegers() {
		int [] array = {16, 21, 34, 49, 55, 60, 72, 83, 101};
		return array;
	}
	
	public static double [] createDoubles() {
		double [] array = new double [7];
		for (int i = 0; i<7; i++){
			array[i] = Math.pow(10.0+0.5*i, 2);
		}
		return array;
	}
	
	public static String [] createStrings(String string){
		String removed = "";
		for (int i = 0; i<string.length(); i++){
			char c = string.charAt(i);
			if (i!=0)
				removed+=c;
		}
		String [] array = {string, string.toUpperCase(), string.toLowerCase(), removed};
		return array;
	}
	
	public static char [] createChars(String string){
		char [] array = new char [string.length()];
		for (int i=0; i<string.length(); i++){
			array[i]=string.charAt(i);
		}
		return array;
	}
	
	public static int sumArray(int [] array){
		int sum = 0;
		for (int i=0; i<array.length; i++){
			sum+=array[i];
		}
		return sum;
	}
	
	public static double findLargest(double [] array){
		double max = array[0];
		for (int i=1; i<array.length; i++){
			if (array[i]>array[i-1])
				max = array[i];
		}
		return max;
	}
	
	public static int charFrequency(String [] array, char c){
		int count = 0;
		for (int i = 0; i<array.length; i++){
			String element = array[i];
			for (int j = 0; j<element.length(); j++){
				if (element.charAt(j) == c)
					count+=1;
			}
		}
		return count;
	}
	
	public static int [] translateChars(char [] array){
		int [] newArray = new int [array.length];
		for (int i = 0; i<array.length; i++){
			newArray[i]=(int) array[i];
		}
		return newArray;
	}
	public static void main(String[] args) {

        // Create arrays
        int[] integerArray = createIntegers();
        System.out.println(Arrays.toString(integerArray));
        double[] doubleArray = createDoubles();
        System.out.println(Arrays.toString(doubleArray));
        String[] stringArray = createStrings("Hello There");
        System.out.println(Arrays.toString(stringArray));
        char[] charArray = createChars("Java1234!&");
        System.out.println(Arrays.toString(charArray));

        // Test processing
        System.out.println("Sum of integer array = " + sumArray(integerArray));
        System.out.println("Largest of double array = " + findLargest(doubleArray));
        System.out.println("Frequency of 'e' = " + charFrequency(stringArray, 'e'));
        System.out.println("Translated characters = " + Arrays.toString(translateChars(charArray)));
    }
}
