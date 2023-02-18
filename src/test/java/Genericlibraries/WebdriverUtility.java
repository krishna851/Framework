package Genericlibraries;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtility {
	WebDriver driver;
	public WebDriver openApplication(String browser, String url, long time) {
		switch(browser) {
		case "chrome": driver=new ChromeDriver();break;
		case "firefox": driver=new FirefoxDriver();break;
		case "edge": driver=new EdgeDriver();break;
		default: System.out.println("Invalid browsr data");
		
		}           
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		return driver;
	}
public void mouseHover(WebElement element) {
	Actions a=new Actions(driver);
	a.moveToElement(element).perform();
	
}
public void doubleClickOnElement(WebElement element) {
	Actions a=new Actions(driver);
	a.doubleClick(element).perform();
	
}
public void dragAndDropElemnet(WebElement des, WebElement src) {
	Actions a=new Actions(driver);
	a.dragAndDrop(src, des).perform();
	
}
public void dropdown1(WebElement elemnet, int text) {
	Select s=new Select(elemnet);
	
	s.selectByIndex(text);
	
}
public void dropdown(WebElement element, WebElement elemnet, String text) {
	Select s=new Select(elemnet);
	
	s.selectByVisibleText(text);
	
}
public void dropdown3(WebElement elemnet, String Value ) {
	Select s=new Select(elemnet);
	
	s.selectByValue(Value);
	
}
 public void swicthToFrame() {
	 driver.switchTo().frame(0);
	 
 }
 public void switchToFrame() {
	 driver.switchTo().defaultContent();
 }
 public void handleAlert() {
	 driver.switchTo().alert().accept();
	 
 }
 public void handlechildbrowser() {
	 Set<String> windowIDs=driver.getWindowHandles();
	 for (String string : windowIDs) {
		driver.switchTo().window(string);
	}
	 
 }
public void switchToParentwidow() {
	driver.switchTo().window(driver.getWindowHandle());
}
public void scrollToElement(WebElement element) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("Arguments[0], scrollIntoView(true)",element);
}
	public void takescreenshot() {
		TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./screenshot/picture.png");
		try {
			FileUtils.copyFile(src, dest);
	}catch(IOException e) {
		e.printStackTrace();
	}
	}
	public void explicitlywait(long time, WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void closeCurrentwindow() {
		driver.close();
	}
	public void quitbrowser() {
		driver.quit();
	}

}
