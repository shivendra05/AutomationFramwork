package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath = "//*[@class='modal__close']")
	WebElement popUpClosebtn;

	@FindBy(xpath = "//a[@class='navbar__tutorial-menu']/*[text()='Tutorials']")
	WebElement navbarTutorials;

	@FindBy(xpath = "//*[text()='DevOps Tools']")
	WebElement devOps;

	@FindBy(xpath = "//ul[@class='active']//a[contains(text(),'Git')]")
	WebElement git;

	@FindBy(xpath = "//h1[text()='Git Tutorial']")
	WebElement getTutorial;

	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public void closePopUp() {
		System.out.println("Verify Pop is present:: "+popUpClosebtn.isDisplayed());

		if(popUpClosebtn.isDisplayed()) {
			popUpClosebtn.click();
		}else {
			System.out.println("Pop isnt present");
		}
	}

	public void navBar() {
		System.out.println("LoginPage.navBar()");
		navbarTutorials.isDisplayed();
		navbarTutorials.click();
	}

	public void devOps() {
		System.out.println("LoginPage.devOps()");
		devOps.isDisplayed();
		devOps.click();
	}

	public void clickOnGit() {
		System.out.println("LoginPage.clickOnGit()");
		git.isDisplayed();
		git.click();
	}

	public void verifyGitTutorailTxt() {
		System.out.println("LoginPage.verifyGitTutorailTxt()");
		getTutorial.isDisplayed();
		getTutorial.click();
	}
}
