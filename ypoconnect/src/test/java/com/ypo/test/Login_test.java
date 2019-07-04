package com.ypo.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login_test

{
	WebDriver driver;
	public Login_test(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
	@FindBy(xpath="//input[@id='username_input']")
	WebElement username;

	@FindBy(xpath="//input[@id='password_input']")
	WebElement password;
	
	@FindBy(xpath="//button[@id='submit_login_btn']")
	WebElement submit;
	
	@FindBy(xpath="i[@id='username_assistance_icon']")
	WebElement usrnameassist;
	
	
	@FindBy(xpath="i[@id='password_assistance_icon']")
	WebElement passwrdassist;
	
	@FindBy(xpath="button[@class='text-capitalize v-btn v-btn--flat v-btn--small theme--light']/div")
	WebElement privacy;
	
	@FindBy(xpath="login-card__termsofuse v-btn v-btn--flat v-btn--small theme--light")
	WebElement termsofuse;
	
	//@FindBy(xpath="button[@class='text-capitalize v-btn v-btn--flat v-btn--small theme--light']/div")
	//WebElement contactus;
	
	
	////button[@class='text-capitalize v-btn v-btn--flat v-btn--small theme--light']/div


public void setusername(String name)
{
	username.sendKeys(name);
	
}

public void setpassword(String passwrd)
{
password.sendKeys(passwrd);
	
}

public void click_login()
{
	submit.click();
	
}

public void clickonasstusrname(String name)
{
	usrnameassist.click();

}

public void clickprivacy()
{
	privacy.click();

}

}

	
	

