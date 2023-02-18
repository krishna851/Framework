package Genericlibraries;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pomproject.ContactUspage;
import pomproject.CoreJavaSeleniumpage;
import pomproject.CoreJavaVideopage;
import pomproject.Demopage;
import pomproject.Homepage;
import pomproject.SeleniumTrainpage;
import pomproject.testingpsge;

public class BaseClass {
	protected propertiesFileUtility property;
	protected ExcelUtility excel;
	protected WebdriverUtility web;
	protected WebDriver driver;
	protected Homepage home;
	protected Demopage skillraryDemo;
	protected SeleniumTrainpage selenium;
	protected testingpsge testing;
	protected CoreJavaSeleniumpage corejava;
	protected CoreJavaVideopage corevideo;
	protected ContactUspage contact;
	protected long time;
	
	
	
	
	//@BeforeSuite
	//@BeforeTest
	@BeforeClass
	public void ClassConfigaration() {
		 property =new propertiesFileUtility();
		 excel=new ExcelUtility();
		 web=new WebdriverUtility();
		 
		 property.propertyFileInitialization(Iconstantpath.PROPERTES_FILE_PATH);
		 excel.excelInitialization(Iconstantpath.EXCEL_FILE_PATH);
		 
		
	}
	
	@BeforeMethod
	public void methodconfiguration() {
		time=Long.parseLong(property.fetchproperty("timeouts"));
		driver=web.openApplication(property.fetchproperty("browser"),property.fetchproperty("url"),time);
		
		home=new Homepage(driver);
		Assert.assertTrue(home.getLogo().isDisplayed());
		
		skillraryDemo =new Demopage(driver);
		selenium= new SeleniumTrainpage(driver);
		corejava=new CoreJavaSeleniumpage(driver);
		corevideo=new CoreJavaVideopage(driver);
		testing =new testingpsge(driver);
	 contact =new ContactUspage(driver);
		
		
		
	}
	
	
	@AfterMethod
	public void methodTearDown() {
		web.quitbrowser();
	}
	@AfterClass
	public void ClassTearDown() {
		excel.closeexcel();
	}
	//@AfterTest
	//@AfterSuite
}
