package com.vti.ultis.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DatabaseProperties {
	public static final String RESOURCE_PATH="C:\\Users\\Admin\\Downloads\\Rocket_12-master\\Rocket_12-master\\Java\\Testing_system_11\\src\\main\\java\\resources\\resources.properties";
	private Properties properties;
	
	public DatabaseProperties() throws FileNotFoundException, IOException {
		properties=new Properties();
		properties.load(new FileInputStream(RESOURCE_PATH)); // ko sử lý exepsition
	}
	public String getValue(String key)
	{
		return properties.getProperty(key);
	}
	

}
