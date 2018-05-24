
import java.util.Scanner;
//P4 Assignment
//Author: Lingyang Zhu
//Date:   Sep 21, 2015
//Class:  CS160
//Email:  lyzhu@rams.colostate.edu
public class P4 {
	
	public static void main(String[] args) {
		//Define
		double grossSalary, interestIncome, capGain, totIncome, adjIncome, totTax, stateTax;
		int numExemption;
		
		adjIncome = 0;
		totTax = 0;
		
		//Open Scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Input
		System.out.print("Gross Salary: ");
		grossSalary = keyboard.nextDouble();
		System.out.print("Number of Exemptions: ");
		numExemption = keyboard.nextInt();
		System.out.print("Interest Income: ");
		interestIncome = keyboard.nextDouble();
		System.out.print("Capital Gains: ");
		capGain = keyboard.nextDouble();
		
		//Compute
		//Total Income
		totIncome = grossSalary + interestIncome + capGain;
		
		//Adjusted Income
		if (numExemption >= 5)
			adjIncome = totIncome - (numExemption*1800.00);
		
		//Total Tax
		if (adjIncome < 15000)
			totTax = adjIncome * 0.0;
		else if (adjIncome < 25000)
			totTax = (adjIncome - 15000) * 0.15;
		else if (adjIncome < 45000)
			totTax = (adjIncome - 25000) * 0.25+1500.00;
		else if (adjIncome >= 45000)
			totTax = (adjIncome - 45000) * 0.3+1500.00+5000.00;
		
		//State Tax
		stateTax = adjIncome*0.055;
		
		//Output
		System.out.printf("Total Income: $%.2f\n", totIncome);
		System.out.printf("Adjusted Income: $%.2f\n", adjIncome);
		System.out.printf("Total Tax: $%.2f\n", totTax);
		System.out.printf("State Tax: $%.2f\n", stateTax);
		
				
		//Close Scanner
		keyboard.close();
	}
}
