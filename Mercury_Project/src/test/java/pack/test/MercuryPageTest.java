package pack.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pack.actions.MercuryPageAction;
import pack.driver.MercuryPageDriver;

public class MercuryPageTest extends MercuryPageDriver {

	WebDriver driver;
	MercuryPageAction pageaction;
	
	@BeforeClass(alwaysRun= true)
    @Parameters(value = { "browser" })
	
	public void beforeMethod(String browser) {

		if (browser.equalsIgnoreCase("Chrome")) {
			this.driver = getChromeDrive();
			this.pageaction = new MercuryPageAction(this.driver);

		} else if (browser.equalsIgnoreCase("Firefox")) {
			this.driver = getFirefoxDrive();
			this.pageaction = new MercuryPageAction(this.driver);
		}

		final String URL = "http://newtours.demoaut.com/mercuryreservation.php?";
		
		driver.get(URL);
		//driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
}
	
	@Test(priority=1) 
	public void testLoginPage() {
		pageaction.userName("mercury");
		pageaction.userPassword("mercury");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		pageaction.signinBtn();
		
	}
	@Test(priority=2)
	public void testMercuryPage() {
		pageaction.flightType();
		pageaction.paasengerCount("2");
		pageaction.departCity("New York");
		pageaction.departMonth("June");
		pageaction.departDate("8");
		pageaction.arrivingCity("London");
		pageaction.arrivingMonth("July");
		pageaction.arrivingDate("9");
		pageaction.serviceClass("Business class");
		pageaction.continueButton();
	}
	@AfterClass(alwaysRun = true)
	public void afterTest() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.quit();

	}
	
	
}
