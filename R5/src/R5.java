// R5 Recitation
// Author: Lingyang Zhu
// Date:   Sep. 14, 2015
// Class:  CS160
// Email:  lyzhu@rams.colostate.edu
import java.util.Scanner;
public class R5 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter a full name: ");
		String fullName = keyboard.nextLine().toLowerCase();
		System.out.println("Your name is: "+ fullName);
		System.out.print("Is the person happy? (y/n): ");
		char happyAnswer = keyboard.next().toLowerCase().charAt(0);
		boolean isHappy = (happyAnswer == 'y');

		{
		if ( fullName.equals("chris wilcox") && isHappy)
			System.out.println("It's so good to hear that."); 
		else if ( fullName.equals("chris wilcox") && !isHappy)
			System.out.println("Cheer up!");
		}
		{
		if ( fullName.equals("lingyang zhu") && !isHappy)	
			System.out.println("Lingyang is not Happy now!");
		else if	( fullName.equals("lingyang zhu") && isHappy)
            System.out.println("Lingyang Zhu is Happy now!");
		}
		keyboard.close();
		System.out.println("End of program.");
		
		
	}

}
