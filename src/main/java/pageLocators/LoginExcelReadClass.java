package pageLocators;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.text.Utilities;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import basefactory.BaseClass;
import utilities.Utiliesclass;

public class LoginExcelReadClass extends BaseClass {
	LoginPageLocator loginpage;
	Utiliesclass util;

	public LoginExcelReadClass() {
		this.util = new Utiliesclass(driver);
		loginpage = new LoginPageLocator();
	}

	public static By college = By.id("ovpb");
	private By logout = By.xpath("//*[@href='http://maplogik.com/index.php/student/logout']");
	// private LoginPageLocator loginPage = new LoginPageLocator();
	Map<String, String> stdRankAndName = new LinkedHashMap<>();

	Map<String, String> loginCredentials;

//	static int rankInc =1;
//	static int nameInc =1;

	public void loginMultipleStudents(String choice) {
		// int ch=0;
		LoginPageLocator loginPageLocator = new LoginPageLocator();
		loginCredentials = readExcelSheet();
		loginCredentials.forEach((k, v) -> {
			loginpage.loadpage();
			loginpage.loginstd(k, v);
			//util.waitForElementClickable(college);
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(college));
			switch (choice) {
			case "college": {
				loginpage.overallcollege();
				loginpage.skillcollege();
				String overall =loginPageLocator.overallcomparisionCollege();
				String skill = loginPageLocator.skillTrainingCollege();
				Assert.assertEquals(skill, overall, "pass"); 
				break;
			}
			case "district": {
				//driver.findElement(By.id("ovpb1")).click();
				loginpage.overalldistrict();
				loginpage.skilldistrict();
				String overall =loginPageLocator.overallcomparisionDistrict();
				String skill = loginPageLocator.skillTrainingDistrict();
				
				Assert.assertEquals(skill, overall, "pass"); 
				break;
			}
			case "state": {
				loginpage.overallstate();
				loginpage.skillstate();
				String overall =loginPageLocator.overallcomparisionState();
				String skill = loginPageLocator.skillTrainingState();
				Assert.assertEquals(skill, overall, "pass"); 
				break;
			}
			}
			logOut();
		});
		// System.out.println(stdRankAndName);
	}

	public Map<String, String> readExcelSheet() {
		XSSFWorkbook wb = null;
		try {
			wb = new XSSFWorkbook(new FileInputStream("./src/test/resources/Mapligikstudentid.xlsx"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Map<String, String> loginCredentials = new LinkedHashMap<>();
		XSSFSheet sheetAt = wb.getSheetAt(0);
		int lastRow = sheetAt.getLastRowNum();
		DataFormatter format = new DataFormatter();
		for (int i = 1; i <= lastRow; i++) {
			String stdId = format.formatCellValue(sheetAt.getRow(i).getCell(0));
			String mobNum = format.formatCellValue(sheetAt.getRow(i).getCell(1));
			loginCredentials.put(stdId, mobNum);
		}
		return loginCredentials;
	}

	public void logOut() {
		util.waitForElementClickable(logout).click();
	}
}
