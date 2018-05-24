import java.lang.reflect.Array;

//P7 project
//Author: Lingyang Zhu
//Date:   Oct. 19, 2015
//Class:  CS160
//Email:  lyzhu@rams.colostate.edu
public class Pseudo {
	//Declare variables
	private char [] arrayChar = new char [80];
	private int length = 0;
	
	//methods
	public void setString(String a) {
		length = a.length();
		for (int i = 0; i<length; i++)
			arrayChar[i]=a.charAt(i);
	}
		
	public String getString(){
		String a = new String(arrayChar);
		return a;
	}
		
	public char charAt(int a){
		return arrayChar[a];
	}
	
	public int indexOf(char a){
		int index = -1;
		for (int i = 0; i<length; i++){
			if (arrayChar[i]==a){
				index = i;
				break;}
		}
		return index;
	}
	
	public String toUpperCase(){
		String a = new String(arrayChar);
		String s = "";
		for (int i = 0; i<length; i++){
			char b = a.charAt(i);
			if (b>='a' && b<='z'){
				b = (char) (b - 32);
			}
			s +=b;
		}
		return s;
	}
	
	public String substring(int a, int b){
		String s = "";
		for (int i = a; i<b; i++){
				s += arrayChar[i];
		}
		return s;
	}
	
	public boolean equals(String a){
		boolean result = true;
		if (a.length() != length){
			result = false;
		}
		else {
		for (int i = 0; i<length; i++){
		    if (a.charAt(i) != arrayChar[i]){
				result = false;
				break;
			}
		}
		}
		return result;
	}
	
	public static void main(String[] args) {

		// Instantiate class		
		Pseudo pseudo = new Pseudo();

		// Verify class
		System.out.println("Verifying Pseudo:");
		pseudo.setString("1234567890 Computer Science !(*@&#)*&");
		System.out.println("pseudo = " + pseudo.getString());
		System.out.println("pseudo.charAt(5) = " + pseudo.charAt(5));
		System.out.println("pseudo.indexOf('C') = " + pseudo.indexOf('C'));
		System.out.println("pseudo.toUpperCase() = " + pseudo.toUpperCase());
		System.out.println("pseudo.substring(11, 19) = " + pseudo.substring(11, 19));
		pseudo.setString("Compare");
		System.out.println("pseudo.equals(\"Compare\") = " + pseudo.equals("Compare"));
		System.out.println("pseudo.equals(\"Compare!\") = " + pseudo.equals("Compare!"));
		
		// String equivalent (should match!)
		System.out.println("\nComparing String:");
		String string = "1234567890 Computer Science !(*@&#)*&";
		System.out.println("string = " + string);
		System.out.println("string.charAt(5) = " + string.charAt(5));
		System.out.println("string.indexOf('C') = " + string.indexOf('C'));
		System.out.println("string.toUpperCase() = " + string.toUpperCase());
		System.out.println("string.substring(11, 19) = " + string.substring(11, 19));
		string = "Compare";
		System.out.println("string.equals(\"Compare\") = " + string.equals("Compare"));
		System.out.println("string.equals(\"Compare!\") = " + string.equals("Compare!"));
	}
	
}
