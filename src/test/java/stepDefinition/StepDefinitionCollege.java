package stepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.testng.Assert;

import pageLocators.LoginExcelReadClass;
import pageLocators.LoginPageLocator;

public class StepDefinitionCollege {
	LoginPageLocator loginPageLocator;
	LoginExcelReadClass loginexcelreadclass;
	@Given("login with student url")
	public void login_with_student_url() {
		loginPageLocator = new LoginPageLocator();
		//loginPageLocator.loginstd();
		loginPageLocator.loadpage();
	}
	@When("login with students in {string} and skill comparision")
	public void login_with_students_in_and_skill_comparision(String choice) {
		loginexcelreadclass = new LoginExcelReadClass();
		loginexcelreadclass.loginMultipleStudents(choice);
		System.out.println("College level");
//		String overall = loginPageLocator.overallcomparisionCollege();
//		String skill = loginPageLocator.skillTrainingCollege();
//		Assert.assertEquals(skill, overall, "pass");
	}
	@When("login with multiple students in {string} and skill comparision")
	public void login_with_multiple_students_in_and_skill_comparision(String choice) {
		loginexcelreadclass = new LoginExcelReadClass();
		loginexcelreadclass.loginMultipleStudents(choice);
		System.out.println("District level");
//		String overall =loginPageLocator.overallcomparisionDistrict();
//		String skill = loginPageLocator.skillTrainingDistrict();
	//	Assert.assertEquals(skill, overall, "pass"); 
	}
	@When("login students in {string} and skill comparision")
	public void login_students_in_and_skill_comparision(String choice) {
		loginexcelreadclass = new LoginExcelReadClass();
		loginexcelreadclass.loginMultipleStudents(choice);
		System.out.println("State level");
//		String overall =loginPageLocator.overallcomparisionState();
//		String skill = loginPageLocator.skillTrainingState();
		
		//Assert.assertEquals(skill, overall, "pass"); 
	}
	@Then("logout dashboard")
	public void logout_dashboard() {
		loginexcelreadclass.logOut();
	}

}
