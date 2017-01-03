package util;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class ConfigManager {

	LinkedList settings;
	
	
	
	public void loadFile(){
		try{
			FileReader reader = new FileReader("config.cfg");
			Scanner file = new Scanner(reader);
			
			file.close();
			reader.close();
		} catch(IOException e) {
			
		}
		
	}
	
	public void changeSetting(String key, String value){
		
	}
	
	public void initFile(){
		try{
		    PrintWriter writer = new PrintWriter("config.cfg", "UTF-8");
		    writer.println("");
		    writer.close();
		} catch (IOException e) {
		   // do something
		}
		
	}
	
}
