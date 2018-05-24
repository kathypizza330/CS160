
public class P10 implements ImageInterface{
	
	//Declare variables
	public PictureLibrary pic= null;
	public int width = 0;
	public int height = 0;
	public int [][] data;
	
	//Create a constructor
	public P10(){
        pic = new PictureLibrary();
    }

	public void readImage(String inFile) {
		try {
			pic.readPGM(inFile);
			width = pic.getWidth();
			height = pic.getHeight();
			data = pic.getData();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void writeImage(String outFile) {
		try {
			pic.setData(data);
			pic.writePGM(outFile);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public int[][] imageData() {
		return data;
	}

	public void decode() {
		for (int i = 0; i<height; i++){
			for (int j = 0; j<width; j++){
				int pixel = data [i][j];
				int upper = pixel/16;
				int lower = pixel%16;
				upper = 15 - upper;
				pixel = (upper*16)+lower;
				data [i][j] = pixel;
			}
		}
	}

	public void swap() {
		for (int i = 0; i<height; i++){
			for (int j = 0; j<width; j++){
				int pixel = data [i][j];
				int upper = pixel & 0b11100000;
				int middle = pixel & 0b00011000;
				int lower = pixel & 0b00000111;
				pixel = (lower << 5) + middle + (upper >> 5);
				data [i][j] = pixel;
			}
		}
	}

	public void mirror() {
		int [][] newdata = new int[height][width];
		for (int i = 0; i<height; i++){
			for (int j = 0; j<width; j++){
				int pixel = data [i][j];
				pixel = data [i][width - 1 - j];
				newdata [i][j] = pixel;
			}
		}
		data = newdata;
	}

	public void exchange() {
		for (int i = 0; i<height; i++){
			for (int j = 0; j<width; j++){
				if (i>=10 && i<310 && j>=10 && j<240){
				int pixel = data [i][j];
				data [i][j] = data [i][j+250];
				data [i][j+250] = pixel;
				}
			}
		}
		
	}

}
