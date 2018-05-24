import java.util.Arrays;

//Q5 quiz
//Author: Lingyang Zhu
//Date:   Nov. 30, 2015
//Class:  CS160
//Email:  lyzhu@rams.colostate.edu
public class Q5 {
	public static void main(String[] args) {
		QuizInterface inter = new QuizClass();
		
		String[] a = {"There", "is", "a lot", "of words!","","?","123456"};
		double[] b = {-1,0,999,-50};
		String filename="new";
		String[] contents = {"abcd efghijklmnopqrstuvwxyz","0123456789",""};
		
		//Test Encode String
		System.out.println("Test Encode String");
		System.out.println(inter.EncodeString("0123456789"));
		
		//Test Decode String
		System.out.println("Test Decode String");
		System.out.println(inter.DecodeString("5J%cdef"));
		
		//Test sum Ascii
		System.out.println("Test sum Ascii");
		System.out.println(Arrays.toString(inter.sumAscii(a)));
		
		//Test quadruple Array
		inter.quadrupleArray(b);
		System.out.println("Test quadruple Array");
		System.out.println(Arrays.toString(b));
		
		//Test write File
		inter.writeFile(filename,contents);
		System.out.println("Test write File");
		
	}
}
