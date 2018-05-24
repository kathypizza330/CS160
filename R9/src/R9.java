import java.util.Scanner;

//R9 Recitation
//Author: Lingyang Zhu
//Date:   Sep 30, 2015
//Class:  CS160
//Email:  lyzhu@rams.colostate.edu
public class R9 {
	public static void main(String[] args) {
//Question 1:
//1
//3
//5
//7
//9
//11
//Question 2:
//1
//2
//3
//4
//5
//6
//7
//8
//9
//Question 3:
//7 6 5 4 3 2 1 0
//Question 4:
//Nothing
//Question 5:
//0
	
	Scanner in = new Scanner(System.in);
	//Test reversed string
	System.out.println("Test reversed string");
	String original = "abcdefg";
	System.out.println(original);
	reverseString(original);
	System.out.println();
	
	//Test Print Ascii
	System.out.println("Test Print Ascii");
	printAscii('A','Z');
	System.out.println();
	
	//Test Compute Factorial
	System.out.println("Test Compute Factorial");
	int number = in.nextInt();
	int answer = computeFactorial(number);
	System.out.println(answer);
	System.out.println();
	
	
	//Test areWeThereYet
	System.out.println("Test areWeThereYet");
	areWeThereYet(in);
	System.out.println();
	in.close();
	
	
	
	
	
	
	
	}
	public static void reverseString(String s) {
	    for (int i=s.length()-1; i>=0; i--)
	    	System.out.print(s.charAt(i));
	    System.out.println();
	}
	
	public static void printAscii(char start, char end) {
	    for (char c=start; c<= end; c++)
	    		System.out.print(c);
	    		System.out.println();
	}

	public static int computeFactorial(int num) {
        int answer = 1;
		while (num > 1) 
			answer*= num--;
		return answer;
	}

	public static void areWeThereYet(Scanner keyboard) {
		String cmd = keyboard.next();
	    do {
	    	
	    	System.out.print("Are we there yet?");
	    	cmd = keyboard.next();
	    }
	    while (!cmd.equalsIgnoreCase("yes"));
	    System.out.print("Finally!");
	    	
	    	
	    	
	}
	}


