package authoringApp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;


public class SaveAsFile {
	private String ext;
	private File file;

	//Initializes the class with the save file to be extension "ext".
	SaveAsFile (String ext, File f){
		this.ext = ext;
		this.file = f;
	}
	
	//Save a string array with extension appropriate extension.
	public void stringArrayToFile(LinkedList<String> s) throws IOException{
		FileWriter fw = new FileWriter(this.file);
		
		if (this.ext == "txt") {

		    for (int i = 0; i < s.size(); i++) {
		      fw.write(s.get(i) + "\n");
		    }
		    fw.close();
		  }
			
		}
		

	
	//Returns the file.
	public File getFile() {
		return this.file;
	}
	
}
