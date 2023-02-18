package testscripts;

import org.testng.asserts.SoftAssert;


import Genericlibraries.BaseClass;

public class FistTest  extends BaseClass{
	public void fistTest() {
		SoftAssert soft=new SoftAssert();
		
		home.clickGears();
		home.clickSkillraryDemoapp();
		web.handlechildbrowser();
		
		soft.assertTrue(skillraryDemo.getpageHeader().isDisplayed());
		
		skillraryDemo.mouseHovertocourse(web);
		skillraryDemo.clickseleniumtraining();
		
		soft.assertEquals(selenium.getpageHeader(),"selenium training");
		selenium.DubleclickplusButton(web);
		selenium.clickaddtocart();
		web.handleAlert();
		web.explicitlywait(time,selenium.getIteamaddmassege() );
		web.takescreenshot();
		soft.assertTrue(selenium.getIteamaddmassege().isDisplayed());
		soft.assertAll();
	}

}
