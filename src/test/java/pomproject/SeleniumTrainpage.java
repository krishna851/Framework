package pomproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genericlibraries.WebdriverUtility;

public class SeleniumTrainpage {
	@FindBy(xpath="//h1[@class='page-header']")
	private WebElement pageHeader;
		
		@FindBy(id="add")
		
		private WebElement plusButton;
		@FindBy(xpath="//button[text()=' Add to Cart']")
		private  WebElement addtocartButton;
		@FindBy(xpath="//div[@id='callout']/span")
		private WebElement iteamaddmassege;
		
		
		//initialization
		public SeleniumTrainpage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			
		}
		//utilization
		public String getpageHeader() {
			return pageHeader.getText();
			
		}
		public void DubleclickplusButton(WebdriverUtility web) {
			web.doubleClickOnElement(plusButton);
			
		}
public void clickaddtocart() {
	addtocartButton.click();
}
public WebElement getIteamaddmassege() {
	return iteamaddmassege;
	
}
}
