package skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class MercuryLoginStefDef {
	@Given("I have the application ready")
	public void i_have_the_application_ready() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("code for launching the app");
	}

	@Given("i login the test")
	public void i_login_the_test() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("code for valid cred set");
	}

	@When("I complete the purchase")
	public void i_complete_the_purchase() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("code for item purchase");
	}

}
