package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (className = "cmp-primary-header_logo-image")
	WebElement logo;
	
	public void clickLogo () throws InterruptedException {
		logo.clear();
		Thread.sleep(5000);
	}
}
