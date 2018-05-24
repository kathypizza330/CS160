import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Library {

	public static Music[] arrayTitles;

	public static void main(String[] args) {
		
		readLibrary(args[0]);
		writeLibrary(args[1]);
		System.out.println();
		searchTitles("John");
		System.out.println();
		sortTitles();
		
	}

	public static void readLibrary(String inputFile) {
		try {
			File inFile = new File(inputFile);
			Scanner fileReader = new Scanner(inFile);
			int length = fileReader.nextInt();
			fileReader.nextLine();
			arrayTitles = new Music[length];
			for (int i = 0; i < length; i++) {
				String title = fileReader.nextLine();

				String album = fileReader.nextLine();
				String artest = fileReader.nextLine();
				int year = fileReader.nextInt();
				fileReader.nextLine();
				arrayTitles[i] = new Music(title, album, artest, year);
			
			}
			fileReader.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void writeLibrary(String outputFile){
		double price = 0.0;
		File outFile = new File(outputFile);
		try {
			PrintWriter fileOutput = new PrintWriter(outFile);
			for (int i = 0; i<arrayTitles.length; i++){
				System.out.println(i+1+": "+arrayTitles[i].toString());
				price += arrayTitles[i].getPrice();
			}
			System.out.printf("Total cost: $%.2f\n",price);
			// Important! Save the file
			fileOutput.close();
			System.out.println("You just made a file " + outputFile.toString());
						
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}		
	}
	
    public static void searchTitles(String search){
    	double price = 0.0;
    	for (int i = 0; i<arrayTitles.length; i++){
			if (arrayTitles[i].toString().contains(search)){
				System.out.println(i+1+": "+arrayTitles[i].toString());
			    price += arrayTitles[i].getPrice();
			    System.out.printf("Total cost: $%.2f\n",price);
			}
		}
    }
    
    public static void sortTitles(){
    	double price = 0.0;
    	String a = "";
		String b = "";
		String c = "";
		int d = 0;
		Music e = new Music(a, b, c, d);
    	for (int i = 0; i<arrayTitles.length-1; i++){
    		for(int j=i+1;j>0;j--){
    		if (arrayTitles[j].toString().charAt(0)<arrayTitles[j-1].toString().charAt(0)){
    			e =arrayTitles[j];
    			arrayTitles[j]=arrayTitles[j-1];
    			arrayTitles[j-1] = e;
    		}
    		else if (arrayTitles[j].toString().charAt(0) == arrayTitles[j-1].toString().charAt(0)){
    			if (arrayTitles[j].toString().charAt(1)<arrayTitles[j-1].toString().charAt(1)){
    			e =arrayTitles[j];
    			arrayTitles[j]=arrayTitles[j-1];
    			arrayTitles[j-1] = e;
    		    }
    			else if (arrayTitles[j].toString().charAt(1) == arrayTitles[j-1].toString().charAt(1)){
    				if (arrayTitles[j].toString().charAt(2)<arrayTitles[j-1].toString().charAt(2)){
    	    			e =arrayTitles[j];
    	    			arrayTitles[j]=arrayTitles[j-1];
    	    			arrayTitles[j-1] = e;
    			}
    		}
    		}
    	}
    	}

    	for (int x = 0; x<arrayTitles.length; x++){
			System.out.println(arrayTitles[x].toString());
			price += arrayTitles[x].getPrice();
		}
		System.out.printf("Total cost: $%.2f\n",price);
    }

}
