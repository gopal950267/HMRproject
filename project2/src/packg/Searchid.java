package packg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Searchid 
{
	String bpath="http://apps.qaplanet.in/hrm/login.php";
	WebDriver bo;
	//to click on login button
    @BeforeMethod
	public void login() throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\QA6\\Downloads\\Gjar\\chromedriver.exe");
		bo= new ChromeDriver();
		bo.get(bpath);
		bo.manage().window().maximize();
		bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
		Thread.sleep(3000);
		bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		Thread.sleep(3000);
		bo.findElement(By.xpath("//input[@name='Submit']")).click();
		Assert.assertEquals(bo.getTitle(),"OrangeHRM");
		 bo.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}
    @AfterMethod
    public void close()
    {
    	bo.close();
    }
  //verify functionality of 'PIM' link
  //PIM=Employee List
  @Test(enabled=true, priority=1, groups="admin")
  public void Tc3_1() throws InterruptedException
  {
   Actions acr=new Actions(bo);
   acr.moveToElement(bo.findElement(By.xpath("//span[@class='drop current']"))).perform();
   Thread.sleep(3000);
   acr.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'Employee List')]"))).perform();
   Thread.sleep(3000);
   bo.findElement(By.xpath("//span[contains(text(),'Employee List')]")).click(); 
   Thread.sleep(3000);
   bo.switchTo().frame("rightMenu");
   
   WebElement search=bo.findElement(By.name("loc_code"));
   Thread.sleep(3000);
   
   Select drop=new Select(search);
   Thread.sleep(3000);
   
   
   drop.selectByVisibleText("Emp. ID");
   Thread.sleep(3000);
   
   bo.findElement(By.xpath("//input[@id='loc_name']")).sendKeys("6608");
   Thread.sleep(3000);
   
   bo.findElement(By.xpath("//div[@class='searchbox']//input[2]")).click();
  
   

   Assert.assertEquals(bo.getTitle(),"OrangeHRM");
   bo.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
  }
}
