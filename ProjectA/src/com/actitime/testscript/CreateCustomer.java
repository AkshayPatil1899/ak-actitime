package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.seleniumhq.jetty9.server.HomeBaseWarning;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.Baseclass;
import com.actitime.generic.Filelib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskList;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CreateCustomer  extends Baseclass{
	@Test
	public void testCreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		Reporter.log("CreateCustomer",true);
		Filelib f= new Filelib();
		String customername = f.getExcelData("CustomerName", 1, 2);
		String description = f.getExcelData("CustomerName", 1, 3);
		HomePage h=new HomePage(driver);
		h.getTaskTab();
		TaskList t=new TaskList(driver);
		t.getAddNewBtn().click();
		t.getNewCustOptions().click();
		t.getEnterCustNameTbx().sendKeys(customername);
		t.getEnterCustDescTbx().sendKeys(description);
		t.getSelectCustDD().click();
		t.getOurCompany().click();
		t.getCreateCustBtn().click();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBePresentInElement(t.getActualCustomer(), customername));
		String actualCustText = t.getActualCustomer().getText();
		Assert.assertEquals(actualCustText, customername);
	}
	
	@Test 
	public void testDeleteCustomer() throws InterruptedException {
		HomePage h= new HomePage(driver);
		h.getTaskTab();
		TaskList t= new TaskList(driver);
		t.getNamebtn().click();
		t.getSettingbtn().click();
		Thread.sleep(2000);
		t.getActionsbtn().click();
		t.getDeleteOption().click();
		t.getDeletepermanently().click();
		
		}
   }

