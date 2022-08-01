package basefactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;	

public class BaseClass {
	public static WebDriver driver;
	public Properties prop;

	public BaseClass() {
		this.prop = propRead();
	}

	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SAI PAVEEN\\OneDrive\\Desktop\\Testing\\Java\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
	}

	public Properties propRead() {
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("./src/test/resources/config/config.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
//	public void tearDown() {
//		driver.quit();
//	}
}
