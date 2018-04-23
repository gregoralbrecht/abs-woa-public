/*
 * This is an example of how to read from a properties file.
 * We will store all global configuration in the file "configuration.properties".
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {

	private static final String PROPERTIES_FILE_NAME = "configuration.properties";

	private static final String MAX_DURATION_REGISTRATION_KEY = "max.duration.registration";
	private static final String MAX_DURATION_REGISTRATION_DEFAULT_VALUE = "180";

	public static void main(String[] args) {
		Properties properties = new Properties();

		File file = new File(PROPERTIES_FILE_NAME);
		try {
			properties.load(new FileInputStream(file));
		} catch (FileNotFoundException e) {
			System.err.println("File " + file.getAbsolutePath() + " was not found!");
		} catch (IOException e) {
			e.printStackTrace();
		}

		String value = properties.getProperty(MAX_DURATION_REGISTRATION_KEY, MAX_DURATION_REGISTRATION_DEFAULT_VALUE);
		int duration = Integer.parseInt(value);
		System.out.println(duration);
	}

}