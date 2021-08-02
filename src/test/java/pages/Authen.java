package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Authen {
	
	private static final WebDriver engine = null;

	WebDriver driver1 = null;
	
	public Authen(WebDriver driver) {
		// TODO Auto-generated constructor stub
		driver1 = driver;
		PageFactory.initElements(driver, this);
	}
	 
	//{"method":"xpath","selector":"//input[@id='email_create']"}
	
	@FindBy(xpath="//input[@name='email_create']")
	private WebElement usrnme1;
	
	@FindBy(xpath="//button[@id='SubmitCreate']")
	private WebElement lock1;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement usrnm3;
	
	@FindBy(xpath="	//input[@id='passwd']")
	private WebElement pswd2;
	
	@FindBy(xpath="//button[@id='SubmitLogin']")			//h1[@class='page-heading']
	private WebElement lock3;

	@FindBy(xpath="//a[@class='logout']")
	private WebElement signoutbutton;	
	
	@FindBy(xpath="//div[@id='facebook_block']")
	private WebElement facetext;
	
	public WebElement getUsrnme1() {
		return usrnme1;
	}

	public void setUsrnme1(String mail1) {
		this.usrnme1.sendKeys(mail1);
	}

	public WebElement getUsrnm3() {
		return usrnm3;
	}

	public void setUsrnm3(String mail2) {
		this.usrnm3.sendKeys(mail2);
	}

	public WebElement getPswd2() {
		return pswd2;
	}

	public void setPswd2(String psd4) {
		this.pswd2.sendKeys(psd4);
	}

	public WebElement getLock1() {
		return lock1;
	}

	public WebElement getLock3() {
		return lock3;
	}
	
	public void login2that(String username , String password)
	{
		
		this.setUsrnm3(username);
		this.setPswd2(password);
		this.getLock3().click();
	}

	public void login2(String username, String password) {
		// TODO Auto-generated method stub
		
	}

	public WebElement getSignoutbutton() {
		return signoutbutton;
	}

	public WebElement getFacetext() {
		return facetext;
	}
}
