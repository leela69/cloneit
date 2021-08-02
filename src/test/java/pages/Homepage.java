package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Homepage {
	
	private static final WebDriver seat = null;

	WebDriver driver3 = null;
	
	public Homepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		driver3 = driver;
		PageFactory.initElements(driver, this);
		
	}

	
	@FindBy(xpath = "//input[@id='search_query_top']")
	private WebElement searchbox;
	
	@FindBy (linkText = "Sign in")
	private WebElement signin;
	
	@FindBy(linkText = "Contact us")
	private WebElement contactus;

	
	public WebElement getSearchbox() {
		return searchbox;
	}

	public void setSearchbox(String seabox) {
		this.searchbox.sendKeys(seabox);
	}

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getContactus() {
		return contactus;
	}
	

}
