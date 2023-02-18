package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Genericlibraries.BaseClass;



public class SecondTest extends BaseClass {
	
	@Test
	public void SecondTest() {
		SoftAssert soft=new SoftAssert();
		
		home.clickGears();
		home.clickSkillraryDemoapp();
		web.handlechildbrowser();
		
		soft.assertTrue(skillraryDemo.getpageHeader().isDisplayed());
		skillraryDemo.selectcatagery(web, 1);
		soft.assertEquals(testing.getpageHeader(),"Testing");
		
		web.dragAndDropElemnet(testing.getseleniumImage(), testing.getCartArea());
		web.scrollToElement(testing.getFacebookIcon());
		testing.clickFacebookIcon();
		
		soft.assertAll();
		
	}
	

	
	

}
