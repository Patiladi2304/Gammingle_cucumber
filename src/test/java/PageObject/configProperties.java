package PageObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class configProperties {

	public static Properties property;
	static  String configpath ="./configfile/config.properties";

	 public  static void  initializePropertyFile() {
		 
		 property=new Properties();
		 try {
			InputStream is=new FileInputStream(configpath);
			property.load(is);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}

}