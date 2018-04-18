package framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyManager {

	private static Properties property = null;
	private static String propertyFileName = "D://Java Practice//OrangeHRMAutomation//src//Configuration//config.properties";
	private static FileInputStream fileInput = null;

	public static String getProperty(String key) {
		property = new Properties();

		File file = new File(propertyFileName);
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			property.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return property.getProperty(key);

	}

}
