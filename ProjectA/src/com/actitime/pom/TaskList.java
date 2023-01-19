package com.actitime.pom;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TaskList {

	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;

	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustOptions;

	@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class]")
	private WebElement enterCustNameTbx;

	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement enterCustDescTbx;

	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectCustDD;

	@FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
	private WebElement ourCompany;

	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustBtn;

	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement actualCustomer;
	
	@FindBy(xpath = "//div[text()='HDFC_001']")
	private WebElement  namebtn;
	
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[2]")
	private WebElement settingbtn;
	
	
	@FindBy(xpath="(//div[@class='action' ])[1]")
	private WebElement actionsbtn;
	
	@FindBy(xpath = "//div[@class='deleteButton'  and  @style='display: inline-block;']/div")
	private WebElement deleteOption;
	
	@FindBy(xpath = "//span[text()='Delete permanently']")
	private WebElement deletepermanently;
	

	public WebElement getNamebtn() {
		return namebtn;
	}
	public WebElement getSettingbtn() {
		return settingbtn;
	}
	public WebElement getActionsbtn() {
		return actionsbtn;
	}
	public WebElement getDeleteOption() {
		return deleteOption;
	}
	public WebElement getDeletepermanently() {
		return deletepermanently;
	}
	public TaskList(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getAddNewBtn() {
		return addNewBtn;
	}
	public WebElement getNewCustOptions() {
		return newCustOptions;
	}
	public WebElement getEnterCustNameTbx() {
		return enterCustNameTbx;
	}
	public WebElement getEnterCustDescTbx() {
		return enterCustDescTbx;
	}
	public WebElement getSelectCustDD() {
		return selectCustDD;
	}
	public WebElement getOurCompany() {
		return ourCompany;
	}
	public WebElement getCreateCustBtn() {
		return createCustBtn;
	}
	public WebElement getActualCustomer() {
		return actualCustomer;
	}

	
}










