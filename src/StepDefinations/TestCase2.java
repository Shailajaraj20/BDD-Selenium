package StepDefinations;

import org.openqa.selenium.By;

import cucumber.api.java.en.When;

public class TestCase2 {

	@When("^user selects (.*) fom to Port$")
	public void selectDropdown(String countyName){
		AbstractStepDefination.driver.findElement(By.xpath("//select[@name='toPort']"
				+ "/option[@value='"+countyName+"']")).click();
	}
	
}
