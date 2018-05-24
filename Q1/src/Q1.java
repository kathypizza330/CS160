import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//Q1 quiz
//Author: Lingyang Zhu
//Date:   Sep 23, 2015
//Class:  CS160
//Email:  lyzhu@rams.colostate.edu
public class Q1 {
	public static void main(String[] args) {
		// Declare variables
		int int0=0, int1=0, int2=0;
		double real0=0.0, real1=0.0, real2=0.0;
		String string0="", string1="", string2="";
		boolean p = true, q = true, r = false;

		try {

		    // Open input stream
		    Scanner scan = new Scanner(new File("data.txt"));

		    // Read contents
		    string0 = scan.nextLine();
		    string1 = scan.nextLine();
		    string2 = scan.nextLine();
		    int0 = scan.nextInt();
		    int1 = scan.nextInt();
		    int2 = scan.nextInt();
		    real0 = scan.nextDouble();
		    real1 = scan.nextDouble();
		    real2 = scan.nextDouble();
		    p = scan.nextBoolean();
		    q = scan.nextBoolean();
		    r = scan.nextBoolean();

		    // Close input stream
		    scan.close();
		    
		    //A
		    System.out.println((int0+int1+int2)*321); 
		    //B
		    System.out.println((real2+real1)/17.5); 
		    //C
		    System.out.printf("%.6f\n", Math.pow(int2*real1,3)); 
		    //D
		    System.out.println("Java programming is " + string0.charAt(13)+string0.charAt(11)+string0.charAt(14)+string0.charAt(12)); 
		    //E
		    System.out.println(string0.charAt(3)+","+string1.charAt(3)+","+string2.charAt(3)); 
		    //F
		    System.out.println(string0.compareTo(string1)); 
		    //G
		    System.out.println((p && q) || (!q && r)); 
		    //H
		    if (string1.length()<=10) {
		    	System.out.println("10 characters or fewer.");
		    }
		    else if (string1.length()>=11) {
		    	System.out.println("11 characters or more.");
		    }
		    //I
		    if (real1<15.15) {
		    	System.out.println(real1*33.44);
		    }
		    else if (real1>29.3 && real1<=99.99) {
		    	System.out.println(real1/2.123);
		    }
		    else {
		    	System.out.println(real1*real1/9.876);
		    }
		    //J
		    switch (string1) {
		    case "Veracruz" :
		    case "Fort Collins" :
		    	System.out.println("North America");
		    	break;
		    case "Temuco" :
		    case "La Paz" :
		    	System.out.println("South America");
		    	break;
		    default :
		    	System.out.println("Unknown City!");
		    	
		    }
		    
		    

		} catch (IOException e) {
		    System.out.println("Cannot read file: data.txt");
		    System.exit(0);
		}
	}

}
