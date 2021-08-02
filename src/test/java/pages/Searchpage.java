package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchpage {

WebDriver driver1 = null;
	
	public Searchpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		driver1 = driver;
		PageFactory.initElements(driver, this);
	}
	 
	@FindBy(xpath="//input[@id='search_query_top']")
	private WebElement search;
	
	@FindBy(xpath="//button[@name='submit_search']")
	private WebElement buttonsearch;
	
	@FindBy(xpath="//span[@class='heading-counter']") //Unable to locate element: {"method":"xpath","selector":"//span[@class='lighter']"}
	private WebElement tshirttext;
	
	@FindBy(xpath="//span[@class='heading-counter']")
	private WebElement dresstext;


	public WebElement getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search.sendKeys(search);
	}

	public WebElement getButtonsearch() {
		return buttonsearch;
	}

	
	public WebElement getTshirttext() {
		return tshirttext;
	}

	public WebElement getDresstext() {
		return dresstext;
	}
	
}
