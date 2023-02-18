package pomproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class testingpsge {
	//declaration
	
@FindBy(xpath="//h1[@class='page hader']")
private WebElement pageHeader;
@FindBy(id="Selenium Training")
private WebElement seleniumimage;
@FindBy(id="cartArea")
private WebElement cartArea;
@FindBy(xpath="//foot[@class='main-footer']/descendant::i[@class='fa fa-facebook']")
private WebElement facebookIcon;

//initialization
		public testingpsge(WebDriver driver) {
			PageFactory.initElements(driver, this);
			
		}
		//utilization
				public String getpageHeader() {
					return pageHeader.getText();
					
				}
				public WebElement getseleniumImage() {
					return seleniumimage;
					
				}
				public WebElement getCartArea() {
					return cartArea;
					
				}
				public WebElement getFacebookIcon() {
					return facebookIcon;
					
				}
				public void clickFacebookIcon() {
					facebookIcon.click();
					
				}
				
				

	

}
