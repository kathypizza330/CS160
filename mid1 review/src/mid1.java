import java.util.Scanner;


public class mid1 {
	public static void main(String[] args) {
		// Declaring and initializing variables
        int i = 123;
        int j = 456;
        double x = 0.5;
        double y = 0.12;
        char c0 = '%';
        char c1 = 'Z';
        String s0 = "Whatever";
        String s1 = "MoreOfTheSame";
        
        // Console output
        System.out.println("s0 = " + s0);
        System.out.println(i + "," + x + "," + c0 + "," + s1);
        System.out.printf("%d\t%.4f\t%c\t%s\n", j, y, c1, s0);
        
        // Expressions, order of precedence, integer math
        System.out.println("15 - 10 * 2 = " + (15 - 10 * 2));
        System.out.println("15 % 10 = " + (15 % 10));
        System.out.println("17 * 0.5 = " + (17 * 0.5));
        
        // String manipulation
        System.out.println("s1 = " + s1);
        System.out.println("s1.length() = " + s1.length());
        System.out.println("s1.indexOf('t') = " + s1.indexOf('t'));
        System.out.println("s1.indexOf('z') = " + s1.indexOf('z'));
        System.out.println("s1.charAt(0) = " + s1.charAt(0));
        System.out.println("s1.charAt(s1.length()-1) = " + s1.charAt(s1.length()-1));
        System.out.println("s1.substring(1,11) = " + s1.substring(1,11));
        
        // Console input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String l = in.nextLine();
        System.out.print("Enter a string: ");
        String s = in.next();
        System.out.print("Enter an integer: ");
        int k = in.nextInt();
        System.out.print("Enter a double: ");
        double z = in.nextDouble();
        System.out.println(k + "," + z + "," + s + "," + l);

        // String equality
        if (s.equals(l)) // == does not work
            System.out.println("Strings are equal.");
        else
            System.out.println("Strings are unequal!");
	}

}
