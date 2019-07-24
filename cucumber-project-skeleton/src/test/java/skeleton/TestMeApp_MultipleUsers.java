package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestMeApp_MultipleUsers {
	WebDriver driver;
	@Given("I am launchiung the test me application in chrome")
	public void i_am_launchiung_the_test_me_application_in_chrome() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		
	}

	@Given("I click on signin link")
	public void i_click_on_signin_link() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		driver.findElement(By.linkText("SignIn")).click();
	}

	@When("I provide username {string}")
	public void i_provide_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(string);
		
	}

	@When("I provide password {string}")
	public void i_provide_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(string);
	}

	@Then("I click on login and verify the login status")
	public void i_click_on_login_and_verify_the_login_status() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		driver.close();
	}


}
