package es.upm.grise.prof2022.ex2;

import java.io.FileInputStream;
import java.util.Properties;

public class ColaboradoraPropiedades {
	private Properties propertiesF;
	
	public void propiedades(Language language) throws Exception {
		String file = language.toString() + "-strings.properties";
		 try {
	            propertiesF.load(new FileInputStream("resources/" + file));
	     } catch (Exception e) {
	            throw new CannotFindPropertyFileOrWrongFileException();
	     }
		
	}
	
	public String getProperty(String key, Language language) throws Exception {
		propiedades(language);
		return key;
	}
	
	
}