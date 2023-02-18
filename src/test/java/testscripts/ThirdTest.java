package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Genericlibraries.BaseClass;

public class ThirdTest extends BaseClass {
	@Test
	public void ThirdTest() {
		SoftAssert soft=new SoftAssert();
		
		home.clickGears();
		home.clickSkillraryDemoapp();
		web.handlechildbrowser();
		
		
	}
}
