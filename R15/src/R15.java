import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

//R15 Recitation
//Author: Lingyang Zhu
//Date:   Nov. 2, 2015
//Class:  CS160
//Email:  lyzhu@rams.colostate.edu
public class R15 {
	public static void readFile(String filename){ 
		
		try {
			File inFile = new File(filename);
			Scanner fileReader = new Scanner(inFile);
			
			int count = 1;
			while (fileReader.hasNextLine()){
				String line = fileReader.nextLine();
				System.out.println(count+": "+line);
				
				count++;
			}
		
		} catch (FileNotFoundException e) {
			System.out.println("ERROR!!");
			System.exit(0);
		}
	}

	public static void writeFile( String filename ){ 
		Scanner in = new Scanner(System.in);
		File outFile = new File(filename);
		
		try {
			PrintWriter fileOutput = new PrintWriter(outFile);
			System.out.println("Enter text:");
			//loop
			String line = "";
			while (true){
				line = in.nextLine();
				if (line.equalsIgnoreCase("stop"))break;
				fileOutput.println(line);
				
			}
			
			// Important! Save the file
			fileOutput.close();
			System.out.println("You just made a file within " + outFile.length()+" bytes");
			
		} catch (FileNotFoundException e) {
			System.out.println("ERROR!");
			System.exit(0);
		}
	}
	
public static void read(String filename){ 
		
		try {
			File inFile = new File(filename);
			Scanner fileReader = new Scanner(inFile);
			while (fileReader.hasNext()){
				String name = fileReader.next();
				if (name.equalsIgnoreCase("circle")){
					double radius = fileReader.nextDouble();
					System.out.println("Circle with radius of "+ radius + " has the area of "+ computeAreaCircle(radius));
				}
				if (name.equalsIgnoreCase("rectangle")){
					double height = fileReader.nextDouble();
					double width = fileReader.nextDouble();
					System.out.println("Rectangle with height of "+ height + " and the width of "+width+" has the area of "+ computeAreaRectangle(height,width));
				}
				if (name.equalsIgnoreCase("triangle")){
					double height = fileReader.nextDouble();
					double base = fileReader.nextDouble();
					System.out.println("Triangle with height of "+ height + " and the base of "+base+" has the area of "+ computeAreaTriangle(height,base));
					
				}
			}
		
		} catch (FileNotFoundException e) {
			System.out.println("ERROR!!");
			System.exit(0);
		}
	}
	
	public static double computeAreaCircle(double radius){	
		return Math.PI*Math.pow(radius, 2);
	}

	public static double computeAreaRectangle(double height, double width){ 
		return height*width;
	}

	public static double computeAreaTriangle(double height, double base){ 
		return 0.5*height*base;
	}
	
	public static void main(String[] args) {
		
		//writeFile(args[0]);
		readFile(args[0]);
		read(args[0]);


	}

}
