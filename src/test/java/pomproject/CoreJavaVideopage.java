package pomproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaVideopage {
	//declaration
		@FindBy(xpath="//h1")
		private WebElement pageHeader;
		
		@FindBy(xpath="//button[@aria-label='Play']")
	    private WebElement playbutton;
		
		@FindBy(xpath="//button[@aria-label='Pause']")
	    private WebElement pausebutton;
		
		@FindBy(xpath="//span[text()='Add To Wishlist']")
	    private WebElement addToWishlistTab;
		
		@FindBy(xpath="//a[@class='close_cookies']")
	    private WebElement closecookiesicon;
		
		
		
		//initialization
		public CoreJavaVideopage(WebDriver driver) {
			PageFactory.initElements(driver,this);
			
			}
		
		//utilization
		public String getPageHeader() {
			return pageHeader.getText();
			
		}
		public void clickplaybutton() {
			playbutton.click();
			
		}
	
		public void pasuebutton() {
			pausebutton.click();
			
		}
		public void clickaddtoWhishlistTab() {
			addToWishlistTab.click();
			
		}
		public void clickcloseCookies() {
			closecookiesicon.click();
			
		}
		
		
		
}
