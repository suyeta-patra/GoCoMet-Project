package stepdefinition;

import org.openqa.selenium.By;

import dev.failsafe.internal.util.Assert;
import driverSetup.driversetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage {
	
	driversetup ds = new driversetup();
	
	@Given("User Navigated to Website after browser initialisation")
	public void homePage() {
		ds.open_chrome();
	}

	@When("Click on {string} Category")
	public void click_on_category(String PageClick) throws Exception {
	    ds.get_driver().findElement(By.xpath("//a[contains(text(),'Laptops')]")).click();
	    Thread.sleep(2000);
	}

	@Then("Click on Home Page Button")
	public void HomePage() throws InterruptedException {
		ds.get_driver().findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		Thread.sleep(2000);
		ds.close_chrome();
	    
	}

}
