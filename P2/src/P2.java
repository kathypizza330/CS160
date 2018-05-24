// P2 Assignment
// Author: Lingyang Zhu
// Date:   Sep 8, 2015
// Class:  CS160
// Email:  lyzhu@rams.colostate.edu
public class P2 {
	public static void main(String[] args) {
		//Declear varibles
		byte b0 = 32;
		short sh0 = 15477;
		int i0 = 664422;
		long l0 = 3984759871l;
		float f0 = 8.112f;
		double d0 = 56.4444;
		char c0 = '&', c1 = 'S', c2 = '5';
		String st0 = "Computer", st1 = "Science", st2 = "Excellent";
		
		//Print
		System.out.println(b0+":"+sh0+":"+i0+":"+l0);
		System.out.println(f0+","+d0);
		System.out.println((b0+sh0+i0+l0)/99999);
		System.out.printf("%.3f\n",Math.sqrt(f0+d0));
		System.out.printf("%.5f\n",b0/f0);
		System.out.println(c0+"="+c1+"="+c2);
		System.out.println((char)(c0-3)+"~"+(char)(c1-3)+"~"+(char)(c2-3));
		System.out.println(st0+" "+st1+" is "+st2+"!");
		System.out.println(st0.length()+","+st1.length()+","+st2.length());
		System.out.println(st2.toUpperCase());
		System.out.println(st0.substring(2,7));
		System.out.println(st1.indexOf("e"));
		System.out.println(st0.charAt(3));
		
	}

}
