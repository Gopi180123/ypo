package com.ypo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
	public WebDriver ldriver;
		public Homepage(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
		
	@FindBy(xpath="")
	@CacheLookup
	WebElement Hometab;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement Forumtab;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement Chaptertab;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement Networktab;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement Groupstab;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement Socialtab;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement Myquicklinkstab;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement Memberdirectorytab;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement Eventdirectorytab;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement Communitydirectorytab;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement Contentdirectorytab;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement Myprofiletab;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement Ypoconnecttab;
	
	public void Click_Hometab()
	{
		Hometab.click();
	}
	
	public void Click_Forumtab()
	{
		Forumtab.click();
	}
	
	public void Click_Chaptertab()
	{
		Chaptertab.click();
	}
	
	public void Click_Networktab()
	{
		Networktab.click();
	}
	
	public void Click_Groupstab()
	{
		Groupstab.click();
	}
	
	public void Click_Socialtab()
	{
		Socialtab.click();
	}
	
	public void Click_Myquicklinkstab()
	{
		Myquicklinkstab.click();
	}
	
	public void Click_Memberdirectorytab()
	{
		Memberdirectorytab.click();
	}
	
	public void Click_Eventdirectorytab()
	{
		Eventdirectorytab.click();
	}
	
	public void Click_Communitydirectorytab()
	{
		Communitydirectorytab.click();
	}
	
	public void Click_Contentdirectorytab()
	{
		Contentdirectorytab.click();
	}	
	
	public void Click_Myprofiletab()
	{
		Myprofiletab.click();
	}
	
	public void Click_Ypoconnecttab()
	{
		Ypoconnecttab.click();
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
