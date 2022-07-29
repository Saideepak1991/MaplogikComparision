package hooks;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

import basefactory.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {
	
	@Before
	public void openBrowser1() throws FileNotFoundException, IOException {
		openBrowser();
		driver.get(propRead().getProperty("student_login_url"));
	}

	@After
	public void tearDown() {
		driver.close();

	}
}
