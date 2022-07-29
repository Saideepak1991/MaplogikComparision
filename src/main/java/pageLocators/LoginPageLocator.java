package pageLocators;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import basefactory.BaseClass;
import io.cucumber.java.Scenario;
import utilities.Utiliesclass;

public class LoginPageLocator extends BaseClass {

	Utiliesclass util;

	public LoginPageLocator() {
		util = new Utiliesclass(driver);
	}

	// public static By testOtpLocator = By.id("test_otp");

	public static By stuId = By.id("login-student-id");

	public static By phoneNo = By.id("login-mobile");

	public static By loginButton = By.xpath("//*[text()='Log in']");

	private By testOtp = By.id("test_otp");

	private By loginOtpTextBox = By.id("login-otp");

	private By submitButton = By.xpath("//button[text()='Submit']");

	public static By logout = By.xpath("//*[@href='http://maplogik.com/index.php/student/logout']");

	public static By college = By.id("ovpb");

	public static By district = By.id("ovpb1");

	public static By state = By.id("ovpb2");

	public static By college1 = By.id("scib1");

	public static By district1 = By.id("scib2");

	public static By state1 = By.id("scib3");

	public static By dashBoard = By.xpath("//*[text()='Dashboards']");

	public static By overallskillpointCollege = By.xpath("(//*[@class='digit-rating arrowBox curve-left width-two'])[1]");

	public static By trainingCollege = By.xpath("(//*[@class='col-md-4'])[7]/p");
	
	public static By overallskillpointDistrict = By.xpath("(//*[@class='digit-rating arrowBox curve-left width-two'])[2]");

	public static By trainingDistrict = By.xpath("(//*[@class='col-md-4'])[14]/p");
	
	public static By overallskillpointState = By.xpath("(//*[@class='digit-rating arrowBox curve-left width-two'])[3]");

	public static By trainingState = By.xpath("(//*[@class='col-md-4'])[21]/p");

	public void loginstd(String stdid, String phoneNumber) {
		util.sendKey(stuId, stdid);
		util.sendKey(phoneNo, phoneNumber);
		util.click(loginButton);
		util.waitForTextMatch(testOtp);
		String otp = util.getText(testOtp);
		util.sendKey(loginOtpTextBox, otp);
		util.click(submitButton);

	}

	public String overallcomparisionCollege() {
		String overallskill = util.waitForElementPresent(overallskillpointCollege).getText();
		// String overallskill = util.getText(overallskillpoint); // 0 point
		String[] overallskillpoint = overallskill.split(" ");
		String firstpoint = overallskillpoint[0];
		System.out.println(firstpoint);
		return firstpoint;
	}

	public String skillTrainingCollege() {
		String skillTraining = util.waitForElementPresent(trainingCollege).getText();
		// String skilltraining = util.getText(training);
		System.out.println(skillTraining);
		return skillTraining;
	}

	public String overallcomparisionDistrict() {
		util.waitForElementPresent(district);
		// util.click(dashBoard);
		util.click(district);
		String overallskill = util.waitForElementPresent(overallskillpointDistrict).getText();
		// String overallskill = util.getText(overallskillpoint); // 0 point
		String[] overallskillpoint = overallskill.split(" ");
		String firstpoint = overallskillpoint[0];
		System.out.println(firstpoint);
		return firstpoint;
	}
	

	public String skillTrainingDistrict() {
		util.waitForElementPresent(district1);
		util.click(district1);
		String skillTraining = util.waitForElementPresent(trainingDistrict).getText();
		// String skilltraining = util.getText(training);
		System.out.println(skillTraining);
		return skillTraining;
	
	}

	public String overallcomparisionState() {
		util.waitForElementPresent(district);
		// util.click(dashBoard);
		util.click(district);
		String overallskill = util.waitForElementPresent(overallskillpointDistrict).getText();
		// String overallskill = util.getText(overallskillpoint); // 0 point
		String[] overallskillpoint = overallskill.split(" ");
		String firstpoint = overallskillpoint[0];
		System.out.println(firstpoint);
		return firstpoint;
	}
	

	public String skillTrainingState() {
		util.waitForElementPresent(district1);
		util.click(district1);
		String skillTraining = util.waitForElementPresent(trainingDistrict).getText();
		// String skilltraining = util.getText(training);
		System.out.println(skillTraining);
		return skillTraining;
	
	}

	public void logOut() {
		util.click(logout);
	}

}
