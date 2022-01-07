package com.tvoMpower.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {

	
WebDriver ldriver;
	
	public RegistrationPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(name="firstName")
	@CacheLookup
	WebElement firstname;
	
	@FindBy(name="lastName")
	@CacheLookup
	WebElement lastname;
	
	@FindBy(name="educatorRoleId")
	@CacheLookup
	WebElement role;
	
	@FindBy(name="boardId")
	@CacheLookup
	WebElement board;
	
	@FindBy(name="schoolId")
	@CacheLookup
	WebElement school;
	
	
	@FindBy(name="emailEducator")
	@CacheLookup
	WebElement email;
	
	
	@FindBy(name="userPassword")
	@CacheLookup
	WebElement pwd;
	
	@FindBy(name="source")
	@CacheLookup
	WebElement source;
	
	@FindBy(id="registerSubmit")
	@CacheLookup
	public WebElement regsubmit;
	
	
	public void setFirstName(String fname)
	{
		firstname.sendKeys(fname);
	}
	
	public void setLastName(String lname)
	{
		lastname.sendKeys(lname);
	}
	public void roleDropdown(int roleindex)
	{
		Select drop = new Select(role);
	      drop.selectByIndex(roleindex);
	}
	public void boardDropdown(int boardindex)
	{
		Select drop = new Select(board);
	      drop.selectByIndex(boardindex);
	}
	
	public void schoolDropdown(int schoolindex)
	{
		Select drop = new Select(school);
	      drop.selectByIndex(schoolindex);
	}
	
	public void setEmail(String emailid)
	{
		email.sendKeys(emailid);
	}
	
	public void setPassword(String password)
	{
		pwd.sendKeys(password);
	}
	public void sourceDropdown(int sourceindex)
	{
		Select drop = new Select(source);
	      drop.selectByIndex(sourceindex);
	}
	
	public void clicksubmit()
	{
		regsubmit.submit();
	}

}
	

