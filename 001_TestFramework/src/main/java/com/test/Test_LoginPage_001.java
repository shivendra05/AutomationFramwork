package com.test;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.LoginPage;

public class Test_LoginPage_001 extends BaseClass{

	
	@Test
	@Parameters({"url"})
	public void verifyGitPage(String url) {
		System.out.println("Launch URL::"+url);
		logger.info("lauch URL"+url);
		driver.get(url);
		LoginPage login = new LoginPage(driver);
		logger.info("lauch URL"+url);
		login.closePopUp();
		login.navBar();
		login.devOps();
		login.clickOnGit();
		login.verifyGitTutorailTxt();
		logger.info("test case compelted ");
		Assert.assertTrue(false);
		
	}
	
}
