import java.util.Arrays;

//P9 Assignment
//Author: Lingyang Zhu
//Date:   Nov. 30, 2015
//Class:  CS160
//Email:  lyzhu@rams.colostate.edu
public class P11 {
	public static void main(String[] args) {
		double[] o = { 0.0, 0.0 };
		double[] rr = { -5.5, -5.5, -5.5 };
		int[] iArray0 = { 0, 0 };
		int[] iArray1 = { 999, 99999 };
		int[] iArray2 = { 2,2,0};
		String[] dup = { "", "a_b c" };

		// Instantiate test class
		TestInterface inter = new TestClass();

		// Test reverse string ok
		System.out.println("Test reverse string:");
		System.out.println(inter.reverseString("abcdef"));
		System.out.println(inter.reverseString("123a"));
		System.out.println();

		// Test duplicate string
		System.out.println("Test duplicate string:");
		for (int i = 0; i < dup.length; i++) {
			System.out.println(inter.duplicateString(dup[i]));
		}
		System.out.println();
		
		// Test create strings
		System.out.println("Test create strings:");
		System.out.println(Arrays.toString(inter.createStrings("xaaX")));// exception x
		System.out.println(Arrays.toString(inter.createStrings("a7c")));
		System.out.println();

		// Test cube array ok
		System.out.println("Test cube array:");
		inter.cubeArray(o);
		inter.cubeArray(rr);
		System.out.println(Arrays.toString(o));
		System.out.println(Arrays.toString(rr));
		System.out.println();

		// Test sum array ok
		System.out.println("Test sum array:");
		System.out.println(inter.sumArray(iArray0));
		System.out.println(inter.sumArray(iArray1));
		System.out.println();

		// Test sort array ok
		inter.sortArray(iArray2);
		inter.sortArray(iArray1);
		System.out.println(Arrays.toString(iArray2));
		System.out.println(Arrays.toString(iArray1));

	}

}
