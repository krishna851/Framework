package pomproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genericlibraries.WebdriverUtility;

public class Demopage {
	private static final WebElement contactusLink = null;

	//declaration
	@FindBy(xpath="//div[@class='navbar-header']")
private WebElement pageHeader;
	
	@FindBy(id="Course")
	
	private WebElement CourseTab;
	@FindBy(xpath="//span[@class='wrappers']/a[text()='Selenium Training']")
	private  WebElement seleniumtrainingclick;
	@FindBy(name="addresstype")
	private WebElement catagorydropdown;
	@FindBy(xpath="//a[text()='Contact us']")
	private WebElement contectusLink;
	
	
	
	
	//initialization
	public Demopage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	//utilization
	public WebElement getpageHeader() {
		return pageHeader;
		
	}
	public void mouseHovertocourse(WebdriverUtility web) {
	web.mouseHover(CourseTab);
	
		
	}
	public void clickseleniumtraining() {
		seleniumtrainingclick.click();
	}
	public void selectcatagery(WebdriverUtility web, int index) {
		web.dropdown1(catagorydropdown, index);
	}
	public void clickcontacUs() {
		contactusLink.click();
		
	}
}
