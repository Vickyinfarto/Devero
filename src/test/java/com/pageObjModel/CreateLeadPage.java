package com.pageObjModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.FunctionalLibrary;

public class CreateLeadPage extends FunctionalLibrary {

	
	public CreateLeadPage(){
		
		PageFactory.initElements(driver, this);
	}
	
	

	
	@FindBy(xpath = "//input[@id='createLeadForm_companyName']")
	private WebElement companyName;
	
	@FindBy(xpath = "//input[@id='createLeadForm_firstName']")
	private WebElement firstName;
	
	@FindBy(xpath = "//input[@id='createLeadForm_lastName']")
	private WebElement lastName;
	
	@FindBy(xpath = "//input[@value='Create Lead']")
	private WebElement createLeadButton;
	
	@FindBy(xpath = "//span[@id='viewLead_companyName_sp']")
	private WebElement idNumber;

	public WebElement getIdNumber() {
		return idNumber;
	}

	

	public WebElement getCompanyName() {
		return companyName;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getCreateLeadButton() {
		return createLeadButton;
	}
	
}
