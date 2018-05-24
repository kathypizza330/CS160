//Q3 Quiz
//Author: Lingyang Zhu
//Date:   Oct. 14, 2015
//Class:  CS160
//Email:  lyzhu@rams.colostate.edu
public class Q3 {
	
	//Declare variables
			private double pi = 3.1416;
			private String state = "Colorado";
			
	public static void main(String[] args) {
		//create an instance of the Q3 object
		Q3 q3 = new Q3();
		
		//Test
		
		System.out.println(q3.getState());
		
		System.out.println(q3.calculateQuadratic(5, 7, 4, 2.0));
		
		System.out.println(q3.calculateAverage(14.32, 37.65, 68.98));
		
		System.out.println(q3.areaOfCircle(9.2));
	    
		
	}
	
	public String getState() {
		
		return state;
	}
		
	public double calculateQuadratic(int a, int b, int c, double x) {
		
		return a*Math.pow(x, 2) + b*x + c;
	}
	
	public double calculateAverage(double value0, double value1, double value2){
		
		return (value0+value1+value2)/3;
	}
	
	public double areaOfCircle(double d){
		
		return pi*Math.pow(d/2.0, 2);
	}


}
