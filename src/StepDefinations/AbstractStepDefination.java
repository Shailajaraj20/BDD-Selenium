package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class AbstractStepDefination {
	
	static WebDriver driver;
	@Given("^user has opened website in chrome$")
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
	}
	
	
	@And("^user enters (.*) and (.*)$")
	public void enterDetails(String us, String ps){
		driver.findElement(By.name("userName")).sendKeys(us);
		driver.findElement(By.name("password")).sendKeys(ps    );
		driver.findElement(By.name("login")).click();
		syste
		
	}
}
