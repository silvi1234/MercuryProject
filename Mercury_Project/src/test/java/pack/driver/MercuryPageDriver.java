package pack.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

  public  class  MercuryPageDriver {
	
	public WebDriver getChromeDrive() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
		
	}
public WebDriver getFirefoxDrive() {
		
		System.setProperty("webdriver.firefox.driver", "gecodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;

}

}
