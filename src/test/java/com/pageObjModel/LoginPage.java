package com.pageObjModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.FunctionalLibrary;

public class LoginPage extends FunctionalLibrary{

	public LoginPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name="USERNAME")
	private WebElement loginUserName;
	
	@FindBy(name="PASSWORD")
	private WebElement loginPassword;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement submitButton;
	
	
	


	public WebElement getLoginUserName() {
		return loginUserName;
	}

	public WebElement getLoginPassword() {
		return loginPassword;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}
	
	
	
	
	
}
