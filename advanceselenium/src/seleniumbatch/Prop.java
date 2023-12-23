package seleniumbatch;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Prop {
public static void main(String[] args) throws IOException {
	FileInputStream f=new FileInputStream("data2/data.properties");
	Properties p=new Properties();
	p.load(f);
	String url=p.getProperty("url");
	System.out.println(url);
	
}
	
}

