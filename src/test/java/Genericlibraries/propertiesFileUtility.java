package Genericlibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertiesFileUtility {
	private Properties property;
	/**
	 * 
	 * @param filepath
	 */
	
	
	
	public void propertyFileInitialization(String filepath) {
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(filepath);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		property=new Properties();
		
		try {
			property.load(fis);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	/**
	 * 
	 * 
	 * 
	 */
	public String fetchproperty(String key) {
		return property.getProperty(key);
		
	}
	


}
