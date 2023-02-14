package com.pageObjModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.FunctionalLibrary;

public class HomePage extends FunctionalLibrary{


	public HomePage(){
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Create Lead']")
	private WebElement clickCreateLead;
	
	@FindBy(xpath = "//a[text()='Find Leads']")
	private WebElement clickFindLead;
	
	@FindBy(xpath = "//a[text()='Merge Lead']")
	private WebElement cliccMergeLead;
	
	@FindBy(xpath = "//a[text()='Leads']")
	private WebElement clickLeadBtn;
	
	public WebElement getClickLeadBtn() {
		return clickLeadBtn;
	}

	public WebElement getClickCreateLead() {
		return clickCreateLead;
	}

	public WebElement getClickFindLead() {
		return clickFindLead;
	}

	public WebElement getCliccMergeLead() {
		return cliccMergeLead;
	}

	
}
