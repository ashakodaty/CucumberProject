package prjtest.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	public static String readDataFromPropertyFile(String Key) throws FileNotFoundException
	{
		
		FileInputStream fs=new FileInputStream("C://Users//ashle//eclipse-workspace//Project/appconfig.properties");
		Properties prop = new Properties();
		try {
			prop.load(fs);
		} catch (IOException e) {
				// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					String data = prop.getProperty(Key);
					return data;
				}
}
