package packg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Leave 
{
	
		String bpath="http://apps.qaplanet.in/qahrm/login.php";
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

	//verify functionality of 'Leave' link
	  //Leave=leaves summery
	    @Test(enabled=true, priority=1, groups="admin")
		 public void Tc4_1() throws InterruptedException
		 {
		  Actions acr=new Actions(bo);
		  acr.moveToElement(bo.findElement(By.xpath("//span[@class='drop'][contains(text(),'Leave')]"))).perform();
		  Thread.sleep(3000);
		  acr.moveToElement(bo.findElement(By.xpath("//a[@class='l2_link parent leavesummary']//span[contains(text(),'Leave Summary')]"))).perform();
		  Thread.sleep(3000);
		  acr.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'Employee Leave Summary')]"))).perform();
		  Thread.sleep(3000);
		  bo.findElement(By.xpath("//span[contains(text(),'Employee Leave Summary')]")).click(); 
		  Thread.sleep(3000);
		  Assert.assertEquals(bo.getTitle(),"OrangeHRM");
		  bo.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 }
	    //Leave=days summery
	  	 @Test(enabled=true, priority=1, groups="admin")
	  	 public void Tc4_2() throws InterruptedException
	  	 {
	  	  Actions acr=new Actions(bo);
	  	  acr.moveToElement(bo.findElement(By.xpath("//span[@class='drop'][contains(text(),'Leave')]"))).perform();
	  	  Thread.sleep(3000);
	  	  acr.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'Define Days Off')]"))).perform();
	  	  Thread.sleep(3000);
	  	  acr.moveToElement(bo.findElement(By.xpath("//a[@class='daysoff']//span[contains(text(),'Days Off')]"))).perform();
	  	  Thread.sleep(3000);
	  	  bo.findElement(By.xpath("//a[@class='daysoff']//span[contains(text(),'Days Off')]")).click(); 
	  	  Thread.sleep(3000);
	  	  Assert.assertEquals(bo.getTitle(),"OrangeHRM");
	  	  bo.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	  	 }
	  	//Leave=Define leave types
	  		 @Test(enabled=true, priority=1, groups="admin")
	  		 public void Tc4_3() throws InterruptedException
	  		 {
	  		  Actions acr=new Actions(bo);
	  		  acr.moveToElement(bo.findElement(By.xpath("//span[@class='drop'][contains(text(),'Leave')]"))).perform();
	  		  Thread.sleep(3000);
	  		  acr.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'Define Leave Types')]"))).perform();
	  		  Thread.sleep(3000);
	  		  bo.findElement(By.xpath("//span[contains(text(),'Define Leave Types')]")).click(); 
	  		  Thread.sleep(3000);
	  		  Assert.assertEquals(bo.getTitle(),"OrangeHRM");
	  		  bo.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	  		 } 
	  		//Leave=Assign Leave
	  		 @Test(enabled=true, priority=1, groups="admin")
	  		 public void Tc4_4() throws InterruptedException
	  		 {
	  		  Actions acr=new Actions(bo);
	  		  acr.moveToElement(bo.findElement(By.xpath("//span[@class='drop'][contains(text(),'Leave')]"))).perform();
	  		  Thread.sleep(3000);
	  		  acr.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'Assign Leave')]"))).perform();
	  		  Thread.sleep(3000);
	  		  bo.findElement(By.xpath("//span[contains(text(),'Assign Leave')]")).click(); 
	  		  Thread.sleep(3000);
	  		  Assert.assertEquals(bo.getTitle(),"OrangeHRM");
	  		  bo.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	          }
	  		//Leave=Assign Leave
	  		 @Test(enabled=true, priority=1, groups="admin")
	  		 public void Tc4_5() throws InterruptedException
	  		 {
	  		  Actions acr=new Actions(bo);
	  		  acr.moveToElement(bo.findElement(By.xpath("//span[@class='drop'][contains(text(),'Leave')]"))).perform();
	  		  Thread.sleep(3000);
	  		  acr.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'Leave List')]"))).perform();
	  		  Thread.sleep(3000);
	  		  bo.findElement(By.xpath("//span[contains(text(),'Leave List')]")).click(); 
	  		  Thread.sleep(3000);
	  		  Assert.assertEquals(bo.getTitle(),"OrangeHRM");
	  		  bo.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	  		 } 
}
