import java.util.Scanner;

// P3 Assignment
// Author: Lingyang Zhu
// Date:   Sep 14, 2015
// Class:  CS160
// Email:  lyzhu@rams.colostate.edu
public class P3 {
	public static void main(String[] args) {
		//Declare variables
		double assign0, assign1, assign2, assign3;
		double lab0, lab1, lab2;
		double exam0, exam1;
		double assignAverage, labAverage, examAverage;
		double classGrade;
		
		//Keyboard input
		Scanner keyboard = new Scanner(System.in);
		System.out.print("First assignment: ");
		assign0 = keyboard.nextDouble();
		System.out.print("Second assignment: ");
		assign1 = keyboard.nextDouble();
		System.out.print("Third assignment: ");
		assign2 = keyboard.nextDouble();
		System.out.print("Fourth assignment: ");
		assign3 = keyboard.nextDouble();
		System.out.print("First lab: ");
		lab0 = keyboard.nextDouble();
		System.out.print("Second lab: ");
		lab1 = keyboard.nextDouble();
		System.out.print("Third lab: ");
		lab2 = keyboard.nextDouble();
		System.out.print("First exam: ");
		exam0 = keyboard.nextDouble();
		System.out.print("Second exam: ");
		exam1 = keyboard.nextDouble();
		
		//Compute
		assignAverage = ((assign0 + assign1 + assign2 + assign3)/4);
		labAverage = ((lab0 + lab1 + lab2)/3);
		examAverage = ((exam0 + exam1)/2);
		classGrade = (assignAverage * 0.25 + labAverage * 0.15 + examAverage * 0.6);
		System.out.printf("Assignment average: %.2f\n", assignAverage);
		System.out.printf("Lab average: %.2f\n", labAverage);
		System.out.printf("Exam average: %.2f\n", examAverage);
		System.out.printf("Class total: %.2f\n", classGrade);
		
		//Close scanner
		keyboard.close();
	
	}

}
