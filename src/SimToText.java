import java.io.FileWriter;
import java.io.IOException;

public class SimToText {

	public void writeToFile (String information, FileWriter file) {
	    try {  
	        file.write(information);
	    }
	    catch (IOException e) {
	        System.out.println("An error occurred with the .txt file!");
	        e.printStackTrace();
	    } 
	}

    public void closeFile(FileWriter file) throws IOException {
    	file.close();
    }
    
    public String getNumberSuffix(int number) {
    	String suffix = "";
    	if (number == 1) {
    		suffix = "st";
    	}
    	else if (number == 2) {
    		suffix = "nd";
    	}
    	else if (number == 3) {
    		suffix = "rd";
    	}
    	else if (number == 4) {
    		suffix = "th";
		}
    	return suffix;
    }
}
