package pack.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pack.elements.MercuryPageElements;

public class MercuryPageAction {

	MercuryPageElements pageElements;

	//constructor of action page
	public MercuryPageAction( WebDriver driver) {
		this.pageElements =new MercuryPageElements ();
		PageFactory.initElements(driver, pageElements);
	}
	public void userName(String str) {
		pageElements.Name.sendKeys(str);
	}
	public void userPassword(String str) {
		pageElements.Password.sendKeys(str);
	}
	public void signinBtn() {
		pageElements.Signinbtn.click();
	}
	
	public void flightType() {
		pageElements.Type.click();
	}
	
	public void paasengerCount(String str) {
		pageElements.Passenger.sendKeys(str);
	}
	
	public void departCity(String str) {
		pageElements.DepartFrom.sendKeys(str);
		
	}
	public void departMonth(String str) {
		pageElements.Month.sendKeys(str);
		
}
	public void departDate(String str) {
		pageElements.Day.sendKeys(str);
	
}
	public void arrivingCity(String str) {
		pageElements.ArrivingFrom.sendKeys(str);
	}
	public void arrivingMonth(String str) {
		pageElements.ArrivingMonth.sendKeys(str);
	}
	public void arrivingDate(String str) {
		pageElements.ArrivingDay.sendKeys(str);
	}
	
	public void serviceClass(String str) {
		pageElements.ServiceClss.sendKeys(str);
	}
	public void continueButton() {
		pageElements.ContinueBtn.click();
	}
	
}