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

public class Adminp 
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
	  
	    
	    //verify functionality of 'admin' link
	    //admin=company Info=General
	   @Test(enabled=true, priority=1, groups="admin")
	 public void Tc2_1() throws InterruptedException
	 {
		 Actions acr=new Actions(bo);
		 acr.moveToElement(bo.findElement(By.xpath("//span[@class='drop'][contains(text(),'Admin')]"))).perform();
		 Thread.sleep(3000);
		 acr.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'Company Info')]"))).perform();
		 Thread.sleep(3000);
		 acr.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'General')]"))).perform();
		 Thread.sleep(3000);
		 bo.findElement(By.xpath("//span[contains(text(),'General')]")).click(); 
		 Thread.sleep(3000);
		 Assert.assertEquals(bo.getTitle(),"OrangeHRM");
		 bo.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	 }
	   
	   
	   //admin=company Info=locations
	   @Test(enabled=true, priority=2, groups="admin")
	 public void Tc2_2() throws InterruptedException
	 {
		 Actions acr=new Actions(bo);
		 acr.moveToElement(bo.findElement(By.xpath("//span[@class='drop'][contains(text(),'Admin')]"))).perform();
		 Thread.sleep(3000);
		 acr.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'Company Info')]"))).perform();
		 Thread.sleep(3000);
		 acr.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'Locations')]"))).perform();
		 Thread.sleep(3000);
		 bo.findElement(By.xpath("//span[contains(text(),'Locations')]")).click();
		 Assert.assertEquals(bo.getTitle(),"OrangeHRM");
		 bo.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	 }
	   
	   
	 //admin=company Info=Company structure
	   @Test(enabled=true, priority=3, groups="admin")
	 public void Tc2_3() throws InterruptedException
	 {
		 Actions acr=new Actions(bo);
		 acr.moveToElement(bo.findElement(By.xpath("//span[@class='drop'][contains(text(),'Admin')]"))).perform();
		 Thread.sleep(3000);
		 acr.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'Company Info')]"))).perform();
		 Thread.sleep(3000);
		 acr.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'Company Structure')]"))).perform();
		 Thread.sleep(3000);
		 bo.findElement(By.xpath("//span[contains(text(),'Company Structure')]")).click();
		 Assert.assertEquals(bo.getTitle(),"OrangeHRM");
		 bo.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	 }
	 
	   
	   //admin=company Info=company structure
	   @Test(enabled=true, priority=4, groups="admin")
	   public void Tc2_4() throws InterruptedException
	   {
	  	 Actions acr=new Actions(bo);
	  	 acr.moveToElement(bo.findElement(By.xpath("//span[@class='drop'][contains(text(),'Admin')]"))).perform();
	  	 Thread.sleep(3000);
	  	 acr.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'Company Info')]"))).perform();
	  	 Thread.sleep(5000);
	  	 acr.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'Company Property')]"))).perform();
	  	 Thread.sleep(4000);
	  	 bo.findElement(By.xpath("//span[contains(text(),'Company Property')]")).click();
	  	 Assert.assertEquals(bo.getTitle(),"OrangeHRM");
	  	 bo.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	   }
	 
	   //admin=company Info=Job Titles
	   @Test(enabled=true, priority=5, groups="admin")
		 public void Tc2_5() throws InterruptedException
		 {
			 Actions acr=new Actions(bo);
			 acr.moveToElement(bo.findElement(By.xpath("//span[@class='drop'][contains(text(),'Admin')]"))).perform();
			 bo.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			 acr.moveToElement(bo.findElement(By.xpath("//a[@class='l2_link parent job']//span[contains(text(),'Job')]"))).perform();
			 Thread.sleep(5000);
			 acr.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'Job Titles')]"))).perform();
			 Thread.sleep(5000);
			 bo.findElement(By.xpath("//span[contains(text(),'Job Titles')]")).click();
			 Thread.sleep(5000);
			 Assert.assertEquals(bo.getTitle(),"OrangeHRM");
			 bo.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 } 

	   //admin=company Info=Job Specifications
	   @Test(enabled=true, priority=6, groups="admin")
		 public void Tc2_6() throws InterruptedException
		 {
			 Actions acr=new Actions(bo);
			 acr.moveToElement(bo.findElement(By.xpath("//span[@class='drop'][contains(text(),'Admin')]"))).perform();
			 bo.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			 acr.moveToElement(bo.findElement(By.xpath("//a[@class='l2_link parent job']//span[contains(text(),'Job')]"))).perform();
			 Thread.sleep(5000);
			 acr.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'Job Specifications')]"))).perform();
			 Thread.sleep(5000);
			 bo.findElement(By.xpath("//span[contains(text(),'Job Specifications')]")).click();
			 Thread.sleep(5000);
			 Assert.assertEquals(bo.getTitle(),"OrangeHRM");
			 bo.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 } 

	   
	   
	   //admin=company Info=Pay Grades
	   @Test(enabled=true, priority=7, groups="admin")
		 public void Tc2_7() throws InterruptedException
		 {
			 Actions acr=new Actions(bo);
			 acr.moveToElement(bo.findElement(By.xpath("//span[@class='drop'][contains(text(),'Admin')]"))).perform();
			Thread.sleep(5000);
			 acr.moveToElement(bo.findElement(By.xpath("//a[@class='l2_link parent job']//span[contains(text(),'Job')]"))).perform();
			 Thread.sleep(5000);
			 acr.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'Pay Grades')]"))).perform();
			 Thread.sleep(5000);
			 bo.findElement(By.xpath("//span[contains(text(),'Pay Grades')]")).click();
			 Thread.sleep(5000);
			 Assert.assertEquals(bo.getTitle(),"OrangeHRM");
			 bo.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 } 
	 //admin=company Info=Employe Status
	   @Test(enabled=true, priority=78, groups="admin")
		 public void Tc2_8() throws InterruptedException
		 {
			 Actions acr=new Actions(bo);
			 acr.moveToElement(bo.findElement(By.xpath("//span[@class='drop'][contains(text(),'Admin')]"))).perform();
			Thread.sleep(5000);
			 acr.moveToElement(bo.findElement(By.xpath("//a[@class='l2_link parent job']//span[contains(text(),'Job')]"))).perform();
			 Thread.sleep(5000);
			 acr.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'Employment Status')]"))).perform();
			 Thread.sleep(5000);
			 bo.findElement(By.xpath("//span[contains(text(),'Employment Status')]")).click();
			 Thread.sleep(5000);
			 Assert.assertEquals(bo.getTitle(),"OrangeHRM");
			 bo.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 } 
	 //admin=company Info=job categories
	   @Test(enabled=true, priority=78, groups="admin")
		 public void Tc2_9() throws InterruptedException
		 {
			 Actions acr=new Actions(bo);
			 acr.moveToElement(bo.findElement(By.xpath("//span[@class='drop'][contains(text(),'Admin')]"))).perform();
			Thread.sleep(5000);
			 acr.moveToElement(bo.findElement(By.xpath("//a[@class='l2_link parent job']//span[contains(text(),'Job')]"))).perform();
			 Thread.sleep(5000);
			 acr.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'EEO Job Categories')]"))).perform();
			 Thread.sleep(5000);
			 bo.findElement(By.xpath("//span[contains(text(),'EEO Job Categories')]")).click();
			 Thread.sleep(5000);
			 Assert.assertEquals(bo.getTitle(),"OrangeHRM");
			 bo.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 } 
}
