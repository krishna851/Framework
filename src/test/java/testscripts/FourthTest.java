package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Genericlibraries.BaseClass;

public class FourthTest  extends BaseClass{
	@Test
	public void fourthTest() {
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
