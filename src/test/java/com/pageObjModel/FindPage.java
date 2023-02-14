package com.pageObjModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.FunctionalLibrary;

public class FindPage extends FunctionalLibrary{

	
public FindPage(){
		
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath = "//input[@name='id']")
private WebElement searchLeadId;


@FindBy(xpath = "//button[text()='Find Leads']")
private WebElement clickIdFindButton;

@FindBy(xpath = "(//thead//following::tbody/tr/td/div/a[@class='linktext'])[1]")
private WebElement clickIdFromTable;

@FindBy(xpath = "(//thead//following::tbody/tr/td/div/a[@class='linktext'])[5]")
private WebElement companyFromTable;


@FindBy(xpath = "//span[@id='viewLead_firstName_sp']")
private WebElement actualFirstName;

@FindBy(xpath = "//span[@id='viewLead_lastName_sp']")
private WebElement actualLastName;


public WebElement getCompanyFromTable() {
	return companyFromTable;
}


public WebElement getSearchLeadId() {
	return searchLeadId;
}

public WebElement getActualLastName() {
	return actualLastName;
}

public WebElement getActualFirstName() {
	return actualFirstName;
}


public WebElement getClickIdFindButton() {
	return clickIdFindButton;
}

public WebElement getClickIdFromTable() {
	return clickIdFromTable;
}

	
}
