package StepDefinations;

import org.openqa.selenium.By;
import cucumber.api.java.en.When;

public class TestCase01 {
	
	@When("^user selects Oneway radio$")
    public void SelectRadios(){
		AbstractStepDefination.driver.findElement(By.xpath("//input[@value='oneway']")).click();
 }

}
