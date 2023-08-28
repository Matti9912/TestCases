package Live;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	
	static WebDriver driver;
	
	@BeforeClass
	public void Gopen() {
	

	
		
		   driver=new ChromeDriver();
		driver.get("http://live.techpanda.org/index.php/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 Reporter.log("app opned",true);
		
		
	}
    @BeforeMethod
	public void Glogin()
	{
		driver.findElement(By.xpath("//span[text()='Account']")).click();
		driver.findElement(By.xpath("//a[text()='Log In']")).click();
		WebElement ele1=  driver.findElement(By.id("email"));
		ele1.click();
		ele1.sendKeys("bharath1@gmail.com");
		WebElement pw=driver.findElement(By.id("pass"));
		pw.click();
		pw.sendKeys("Bharath@123");
		driver.findElement(By.id("send2")).click();
		Reporter.log("login successfull",true);
	}
	
	
  	@AfterMethod
	public void Glogout() throws Throwable
	{
		
		
		driver.findElement(By.xpath("//span[text()='Account']")).click();
		Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[text()='Log Out']")).click();
		 
		 
	
		Reporter.log("logout successfull",true);
	
	}
	
	
	@AfterClass
	public void close()
	{
		driver.quit();
		Reporter.log("app closed successfull",true);
	}
	

}
