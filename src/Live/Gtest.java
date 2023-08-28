package Live;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Glistners.class)
public class Gtest extends BaseClass {
	
	@Test
	public void Gadd() throws Throwable
	{
		Calander c= new Calander();
		//RandomNumber R= new RandomNumber();
		
		driver.findElement(By.xpath("//a[text()='New Customer']")).click();
		
		driver.findElement(By.name("name")).sendKeys("bharath");
		driver.findElement(By.name("rad1")).click();
		driver.findElement(By.name("dob")).sendKeys(c.da());
		
		Thread.sleep(5000);
		
	driver.findElement(By.name("sub")).click();
	
	}
	

}
