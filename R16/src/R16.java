//R16 Recitation
//Author: Lingyang Zhu
//Date:   Nov. 9, 2015
//Class:  CS160
//Email:  lyzhu@rams.colostate.edu
public class R16 implements RecitationInterface{
	
	//Declare Variables
	public PictureLibrary pic= null;
	public int width = 0;
	public int height = 0;
	public int [][] data;
	
    public R16(){
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

	public void negateImage() {
		for (int i = 0; i<height; i++){
			for (int j = 0; j<width; j++){
				int pixel = data [i][j];
				pixel = PictureLibrary.MAXVAL - pixel;
				data [i][j] = pixel;
			}
		}
	}

	public void increaseContrast() {
		for (int i = 0; i<height; i++){
			for (int j = 0; j<width; j++){
				int pixel = data [i][j];
				if (pixel >= 0 && pixel <= 127)
				data [i][j] = pixel +16;
				else if (pixel >= 128 && pixel <= PictureLibrary.MAXVAL){
					data [i][j] = pixel - 16;}
			}
		}
	}

	public void decreaseContrast() {
		for (int i = 0; i<height; i++){
			for (int j = 0; j<width; j++){
				int pixel = data [i][j];
				if (pixel >= 0 && pixel <= 127)
				data [i][j] = pixel -16;
				else if (pixel >= 128 && pixel <= PictureLibrary.MAXVAL){
					data [i][j] = pixel + 16;}
			}
		}
	}

}
