package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contactpage {
	
	WebDriver driver1 = null;
	
	public Contactpage (WebDriver driver) {
		// TODO Auto-generated constructor stub
		driver1 = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@id='contact-link']")
	private WebElement contactusthr;
	
	@FindBy(xpath="//h1[@class='page-heading bottom-indent']")
	private WebElement contacthead;

	public WebElement getContactusthr() {
		return contactusthr;
	}

	public WebElement getContacthead() {
		return contacthead;
	}
	 

}
