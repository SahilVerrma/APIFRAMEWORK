package org.testing.Utilities;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadPropertiesFile {
	LoadPropertiesFile(){
		
	}
	
	public static Properties  propertiesfile(String path) throws IOException
	{
		
	File  f = new File(path);
	FileInputStream fi = new FileInputStream(f);
	Properties pr = new Properties();
    pr.load(fi);
    return pr;
	
	}
}
