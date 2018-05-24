// R2 Recitation
// Author: Lingyang Zhu
// Date:   Aug 31, 2015
// Class:  CS160
// Email:  lyzhu@rams.colostate.edu
public class R2 {

	public static void main(String[] args) {
		
		//Declare variables
        char c0 = '$', c1 = 'W';
        byte b0 = 15, b1 = 4;
        short s0 = 5577, s1 = 1234;
        int i0 = 12345, i1 = -99999;
        long l0 = 8000000000l, l1 = -7000000000l;
        float f0 = 1.2345f, f1 = 66.7788f;
        double d0 = 0.00001, d1 = 83475.29837;

        //Print expressions
        System.out.println(b0 + b1);
        System.out.println((b0 + b1) / 4);
        System.out.println((b0 + b1) / 4.0);
        System.out.println(s0 / 1000);
        System.out.println(s0 / 1000.0);
        System.out.println(s1 % 100);
        System.out.println((i0 - 2345) * 10);
        System.out.println(i0 - 2345 * 10);
        System.out.println(l0 + l1);
        System.out.println((f0 + f1) / (d0 * d1));
        System.out.println(0.1 + 0.2 - 0.3);
        System.out.println(6 % 4 + 12 - 3 * (8 + 3) / 2 );
        //6 % 4 + 12 - 3 * (8 + 3) / 2
        //6 % 4 + 12 - 3 * 11 / 2
        //6 % 4 + 12 - 33 / 2
        //2 + 12 - 33 / 2
        //2 + 12 - 16
        //14 - 16
        //-2
        
        //Increment c0 and c1, then print (c0 + "," + c1) using System.out.println;
        c0++; c1++;
        System.out.println(c0 + "," + c1);
        //Print ("5577 + 1234 = " + s0 + s1) using System.out.println.
        System.out.println("5577 + 1234 = " + s0 + s1);
        //Print ("5577 + 1234 = %d\n", s0 + s1), using System.out.printf.
        System.out.printf("5577 + 1234 = %d\n", s0 + s1);
        //Print ("0.00001 + 83475.29837 = %.2f\n", d0 + d1) using System.out.printf.
        System.out.printf("0.00001 + 83475.29837 = %.2f\n", d0 + d1);
        //Print ("0.00001 + 83475.29837 = %.5f\n", d0 + d1) using System.out.printf. 
        System.out.printf("0.00001 + 83475.29837 = %.5f\n", d0 + d1);
	}

}
