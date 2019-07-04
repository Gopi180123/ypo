package com.ypo.base;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Baseclasss 
{
	public static WebDriver driver;
	public Logger logger;
	@Parameters("browser")
	@BeforeClass
    public void setupbrowser(String br)
    {
		 logger=Logger.getLogger("ypoconnect");
    	 PropertyConfigurator.configure("log4j.properties");  	 
   	 if(br.equals("chrome"))
   	 {
   	 System.setProperty("webdriver.chrome.driver","D:\\workspace\\sample\\chromedriver.exe");
   	 driver=new ChromeDriver();
   	 }
   	 else if(br.equals("Firefox"))
   	 {
   	 System.setProperty("webdriver.chrome.driver","D:\\\\workspace\\\\sample\\\\chromedriver.exe");
     driver=new ChromeDriver();
   	 }
   	 driver.get("https://www.google.com");
   	 logger.info("url lauynched");
   	 driver.manage().window().maximize();
     }
	 @AfterClass
     public void teardown()
     {
    	 driver.quit();
     }
	 public void Capturescreeen(WebDriver driver,String tname) throws IOException 
     {
    	 File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	 FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"\\screenshots\\"+tname+".png"));
    	 System.out.println("screen captured");
     }
	 public String Randomstring(int i)
	    {
	    	String generatedstring=RandomStringUtils.randomAlphabetic(i);
	    	return generatedstring;
	    }
	 
	 public void waitforpage()
	 {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 }
	 public void waitforstep() throws Throwable
	 {
		 Thread.sleep(3000);
	 }
	 
	 public void webtable(WebDriver driver,int x,int y)
	    {
	    	int i=x,j=y;
	    	String tpath="//table[@id='customer']/tbody";
			String tablevalue;
	    	WebElement tablepath=driver.findElement(By.xpath(tpath));
	    	List<WebElement> rows=tablepath.findElements(By.tagName("tr"));
	    	  	 for( i=x;i<rows.size();i++)
	    		{
	    			WebElement dynamicrows=rows.get(i);
	    			List<WebElement> cells=dynamicrows.findElements(By.tagName("td"));
	    				for( j=y;j<=cells.size();j++)
	    				{
	    					System.out.println(i);
	    					System.out.print(" "+j+" "+cells.size());
	    					tablevalue="//table[@id='customer']/tbody/tr["+i+"]/td["+j+"]";
	    					System.out.print(driver.findElement(By.xpath(tablevalue)).getText()+"    ");
	    				}
	    			System.out.println();
	     		}
	
	    
	
}
