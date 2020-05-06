package pack.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MercuryPageElements {
	
	@FindBy(xpath="//input[@name='userName']")
	public WebElement Name;
	@FindBy(xpath="//input[@name='password']")
	public WebElement Password;
	@FindBy(xpath="//input[@value='Login']")
	public WebElement Signinbtn;
	
	@FindBy(xpath="//input[contains(@name,'tripType')][(@value='roundtrip')]")
	 public WebElement Type;
	
	@FindBy(xpath="//select[@name='passCount']")
	 public WebElement Passenger;
	
	@FindBy(xpath="//select[@name=\"fromPort\"]")
	 public WebElement DepartFrom;
	
	@FindBy(xpath="//select[@name=\"fromMonth\"]")
	 public WebElement Month;
	
	@FindBy(xpath="//select[@name=\"fromDay\"]")
	 public WebElement Day;
	
	@FindBy(xpath="//select[@name=\"toPort\"]")
	 public WebElement ArrivingFrom;
	
	@FindBy(xpath="//select[@name=\"toMonth\"]")
	 public WebElement ArrivingMonth;
	
	@FindBy(xpath="//select[@name=\"toDay\"]")
	 public WebElement ArrivingDay;
	
	@FindBy(xpath="//input[contains(@name,'servClass')][(@value='Business')]")
	 public WebElement ServiceClss;
	
	
	@FindBy(xpath="//input[@name=\"findFlights\"]")
	 public WebElement ContinueBtn;
	
	
}
