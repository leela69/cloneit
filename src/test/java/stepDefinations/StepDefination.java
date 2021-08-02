package stepDefinations;

import java.sql.Driver;
import java.util.List;

import javax.naming.AuthenticationException;
import javax.naming.directory.SearchResult;

import org.junit.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Authen;
import pages.Contactpage;
import pages.Homepage;
import pages.Myaccountpage;
import pages.Searchpage;
import testbase.TestBase;

public class StepDefination extends TestBase {
	
	protected Authen authobj;
	protected Contactpage conobj;
	protected Homepage homobj;
	protected Myaccountpage myaobj;
	protected Searchpage seaobj;

    @Given("^Open browser Navigate to \"([^\"]*)\"$")
    public void open_browser_navigate_to_something(String strArg1) throws Throwable {
    	driver = TestBase.setup();
    	
		authobj = new Authen(driver);
		conobj = new Contactpage(driver);
		homobj = new Homepage(driver);
		myaobj = new Myaccountpage(driver);
		seaobj = new Searchpage(driver);
		
    }

    @When("^Click on the SignIn link$")
    public void click_on_the_signin_link() throws Throwable {
       homobj.getSignin().click();
    }

    @When("^Enter Username and Password \"([^\"]*)\" \"([^\"]*)\"$")
    public void enter_username_and_password_something_something(String strArg1, String strArg2) throws Throwable {
    	 authobj.setUsrnm3(strArg1);
    	 authobj.setPswd2(strArg2);
    	 authobj.getLock3().click();
    	
    }

    @Then("^Veirfy MyAccount Page displayed or not$")
    public void veirfy_myaccount_page_displayed_or_not() throws Throwable {
    	String heading = myaobj.getMytext().getText();
    	Assert.assertEquals(heading, "MY ACCOUNT");
    }

    @When("^click on the search box and type \"([^\"]*)\"$")
    public void click_on_the_search_box_and_type_something(String strArg1) throws Throwable {
      seaobj.setSearch(strArg1);
    }

    @When("^click on the button$")
    public void click_on_the_button() throws Throwable {
       seaobj.getButtonsearch().click();
    }

    @Then("^verify the thirts page is opened or not$")
    public void verify_the_thirts_page_is_opened_or_not() throws Throwable {
    	String head1 = seaobj.getTshirttext().getText();
    	Assert.assertEquals(head1, "1 result has been found.");
    }

    @When("^Click on the ContactUs link$")
    public void click_on_the_contactus_link() throws Throwable {
      homobj.getContactus().click();
    }

    @Then("^Veirfy ContactUs Page displayed or not$")
    public void veirfy_contactus_page_displayed_or_not() throws Throwable {
    	String head2 = conobj.getContacthead().getText();
    	Assert.assertEquals(head2, "CUSTOMER SERVICE - CONTACT US");
    }
   
}
