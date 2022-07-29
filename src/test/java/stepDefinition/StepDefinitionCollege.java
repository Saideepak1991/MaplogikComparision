package stepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import pageLocators.LoginPageLocator;

public class StepDefinitionCollege {
	LoginPageLocator loginPageLocator;

	@Given("login with student credential {string} and {string}")
	public void login_with_student_credential_and(String studentid, String phonenumber) {
		loginPageLocator = new LoginPageLocator();
		loginPageLocator.loginstd(studentid, phonenumber);

	}


	@Then("compare the overall position skill field with skill comparision indicator in training field in college level")
	public void compare_the_overall_position_skill_field_with_skill_comparision_indicator_in_training_field_in_college_level() {
		System.out.println("College level");
		String overall = loginPageLocator.overallcomparisionCollege();
		String skill = loginPageLocator.skillTrainingCollege();
		
		Assert.assertEquals(skill, overall, "pass");

	}
	
	@Then("compare the overall position skill field with skill comparision indicator in training field in district level")
	public void compare_the_overall_position_skill_field_with_skill_comparision_indicator_in_training_field_in_district_level() {
		System.out.println("District level");
		String overall =loginPageLocator.overallcomparisionDistrict();
		String skill = loginPageLocator.skillTrainingDistrict();
		
		Assert.assertEquals(skill, overall, "pass"); 
	}
	
	@Then("compare the overall position skill field with skill comparision indicator in training field in state level")
	public void compare_the_overall_position_skill_field_with_skill_comparision_indicator_in_training_field_in_state_level() {
		System.out.println("State level");
		String overall =loginPageLocator.overallcomparisionState();
		String skill = loginPageLocator.skillTrainingState();
		
		Assert.assertEquals(skill, overall, "pass"); 
	}
	@Then("logout dashboard")
	public void logout_dashboard() {
		loginPageLocator.logOut();
	}

}
