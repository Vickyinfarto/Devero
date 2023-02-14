package com.propery;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.bouncycastle.util.test.Test;

public class TestDataProperties {
	
	static TestDataProperties tdr; 
	public static Properties prop;
	
	
	public TestDataProperties() throws Exception, IOException {
		
		 prop = new Properties();
		prop.load(new FileInputStream(new File(System.getProperty("user.dir")+"\\src\\test\\resources\\TestData\\Data.properties")));
	}
	
	
	public static TestDataProperties getTestProperties() throws IOException, Exception {
	if(tdr==null) {
		
		
		tdr = new TestDataProperties();
	}
	return tdr;
		}
		
		
		
	public String getProperty(String key) throws Exception {
		String value = prop.getProperty(key);
		if (key == null) {
			throw new Exception("Not a valid prop key");
		}
		return value;
	}
	}

	

