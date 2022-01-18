package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class base {

	public WebDriver initialmethd() throws IOException{
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//main//resources//Drivers//chrome//chromedriver.exe");
			WebDriver d=new ChromeDriver();
			d.manage().window().maximize();
			
			return d;
	 }
	 public Properties getProperties() throws IOException{
		 String path=System.getProperty("user.dir")+"//src//main//java//gloabl.properties";
			FileInputStream fis=new FileInputStream(path);
			Properties prop = new Properties();
			prop.load(fis);
			return prop;
	 }
}
