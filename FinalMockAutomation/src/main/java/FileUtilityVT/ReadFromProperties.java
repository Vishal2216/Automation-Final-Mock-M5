package FileUtilityVT;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFromProperties
{
	public static String propertyData(String key) throws IOException {
		   Properties prop=new Properties();
		   FileInputStream fis=new FileInputStream("D:\\selenium\\FinalMockAutomation\\src\\test\\resources\\DataConformation.Propeties");
		   prop.load(fis);
		   String data = prop.getProperty(key);
		   return data;
}
}