package packg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Deletedid
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
   
  WebElement radiobox= bo.findElement(By.xpath("//tr[3]//td[1]//input[1]"));
  radiobox.click();
  WebElement delete= bo.findElement(By.xpath("//div[@class='actionbar']//input[2]"));
  delete.click();
  
   Assert.assertEquals(bo.getTitle(),"OrangeHRM");
   bo.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
  }
}
