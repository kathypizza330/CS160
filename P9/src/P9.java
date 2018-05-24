import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//P9 Assignment
//Author: Lingyang Zhu
//Date:   Nov. 9, 2015
//Class:  CS160
//Email:  lyzhu@rams.colostate.edu
public class P9 implements Interface {

	//Declare variables
	public String [] pieLable;
	public double [] pieElement;
	public double [] barFirst;
	public double [] barSecond;
	public double [] lineFirst;
	public double [] lineSecond;
	public double [] lineThird;
	
	//Methods
	public boolean readFile(String filename) {
		try {
			
			File inFile = new File(filename);
			Scanner fileReader = new Scanner(inFile);
			
			int pielength = fileReader.nextInt();
			pieLable = new String [pielength];
			pieElement = new double [pielength];
			int barlength = fileReader.nextInt();
			barFirst = new double [barlength];
		    barSecond = new double [barlength];
		    int linelength = fileReader.nextInt();
			lineFirst = new double [linelength];
			lineSecond = new double [linelength];
			lineThird = new double [linelength];
			
			System.out.println(pielength+","+barlength+","+linelength);
			
			for (int i = 0; i<pielength; i++){
				pieLable[i] = fileReader.next();
			}
			
			for (int j = 0; j<pielength; j++){
				pieElement[j] = fileReader.nextDouble();
			}
			
			for (int k = 0; k<barlength; k++){
				barFirst[k] = fileReader.nextDouble();
			}
			
			for (int l = 0; l<barlength; l++){
				barSecond[l] = fileReader.nextDouble();
			}
			
			for (int m = 0; m<linelength; m++){
				lineFirst[m] = fileReader.nextDouble();
			}
			
			for (int n = 0; n<linelength; n++){
				lineSecond[n] = fileReader.nextDouble();
			}
			
			for (int o = 0; o<linelength; o++){
				lineThird[o] = fileReader.nextDouble();
			}
				
			fileReader.close();
			//System.out.println(pieElement.toString());
		
		} catch (FileNotFoundException e) {
			System.exit(0);
			return false;
		}
		return true;
	}

	public String getTitle(eType type) {
		String title = "";
//		switch (type){
//		case PIECHART: title = "My Pie Chart";
//		case BARCHART: title = "My Bar Chart";
//		case LINEGRAPH: title = "My Line Graph";
//		}
		if (type == Interface.eType.PIECHART)
			title = "My Pie Chart";
		else if (type == Interface.eType.BARCHART)
			title = "My Bar Chart";
		else if (type == Interface.eType.LINEGRAPH)
			title = "My Line Graph";
		return title;
	}

	public String[] getLabels(eType type) {
		String [] label;
		if (type == Interface.eType.PIECHART)
			label = pieLable;
		else label = null;
		return label;
	}

	public double[] getData(eType type, int series) {
		double [] data = null;
		if (type == Interface.eType.PIECHART)
			data = pieElement;
		else if (type == Interface.eType.BARCHART){
			if (series == 0)
				data = barFirst;
			else if (series == 1)
				data = barSecond;
		}
		else if (type == Interface.eType.LINEGRAPH){
			if (series == 0)
				data = lineFirst;
			else if (series ==1)
				data = lineSecond;
			else if (series ==2)
				data = lineThird;
		}
		return data;
	}
	   public static void main(String[] args){
		   P9 p9 = new P9();
		   p9.readFile(args[0]);
	   }
}
