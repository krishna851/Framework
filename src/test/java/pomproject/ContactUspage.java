package pomproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUspage {
	//declaration
			@FindBy(xpath="//img[contains(@src,'contactus')]")
			private WebElement pageHeader;
			
			@FindBy(name="name")
		    private WebElement fullNameTF;
			@FindBy(name="sender")
		    private WebElement emailTF;
			@FindBy(name="subject")
		    private WebElement subjectTF;
			@FindBy(name="massege")
		    private WebElement massegeTextArea;
			@FindBy(xpath="//button[text()='Send us mail']")
			private WebElement sendusmailbutton;
			
			//initialization
			public ContactUspage(WebDriver driver) {
				PageFactory.initElements(driver,this);
				
				}
			
			//utilization
			public WebElement getPageHeader() {
				return pageHeader;
				
			}
			public void submitsdetails(String name, String subject, String massege) {
				fullNameTF.sendKeys(name);
				emailTF.sendKeys(subject);
				subjectTF.sendKeys(massege);
				sendusmailbutton.click();
				
			}
			
			


}

