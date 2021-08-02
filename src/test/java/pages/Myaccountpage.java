package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myaccountpage {
	
	WebDriver driver1 = null;
	
	public Myaccountpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		driver1 = driver;
		PageFactory.initElements(driver, this);
	}
	 
	@FindBy(xpath="//h1[@class='page-heading']")
	private WebElement mytext;

	@FindBy(xpath="//i[@class='icon-home']")	//i[@class='icon-home']
	private WebElement hometext;
	
	@FindBy(xpath="//a[@class='logout']")
	private WebElement signout;

	public WebElement getHometext() {
		return hometext;
	}

	public WebElement getMytext() {
		return mytext;
	}

	public WebElement getSignout() {
		return signout;
	}

}
