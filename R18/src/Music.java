//R18 Recitation
//Author: Lingyang Zhu
//Date:   Nov. 16, 2015
//Class:  CS160
//Email:  lyzhu@rams.colostate.edu
public class Music {
	private String songTitle;
    private String albumName;
    private String artistName;
    private int releaseYear;
    // Constructor
    public Music(String title, String album, String artist, int year) { 
    	songTitle = title;
    	albumName = album;
    	artistName = artist;
    	releaseYear = year;
    }

    // Accessor methods
    public String getTitle() { 
    	return songTitle;
    }
    public String getAlbum() { 
    	return albumName;
    }
    public String getArtist() { 
    	return artistName;
    }
    public int getYear() { 
    	return releaseYear;
    }
    
    // toString method
 	public String toString() {
 		String name = "";
 		name = songTitle + ", " + albumName +", "+ artistName +", "+releaseYear;
 		return name;
 	}
 	
 	public double getPrice() { 
 		double price = 0.0;
 		if (releaseYear<1970){price+=1.29;}
 		if (releaseYear<1980 && releaseYear>=1970){price+=1.89;}
 		if (releaseYear<1990 && releaseYear>=1980){price+=0.69;}
 		if (releaseYear<2000 && releaseYear>=1990){price+=0.99;}
 		if (releaseYear<=2009 && releaseYear>=2000){price+=1.39;}
 		if (releaseYear>=2010){price+=0.59;}
 		return price;
 	}
 	
 	

}
