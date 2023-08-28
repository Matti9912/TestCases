package Live;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Glistners.class)
public class Day3 extends BaseClass {
	
	@Test
	public void CorrectUandP()
	{
		
		driver.findElement(By.name("uid")).sendKeys("mngr510460",Keys.TAB,"unAburA");
		driver.findElement(By.name("btnLogin")).click();
		String exResult="Guru99 Bank Manager HomePage"; 
		
		String result=    driver.getTitle();
		Reporter.log("login successfull",true);
		
		Assert.assertEquals(result, exResult);
		
	}

	@Test
	public void InCorrectUandCorrectP()
	{
		
		driver.findElement(By.name("uid")).sendKeys("mngr51046",Keys.TAB,"unAburA");
		driver.findElement(By.name("btnLogin")).click();
		String exResult="User or Password is not valid"; 
		
		String result=    driver.getTitle();
		Reporter.log("login successfull",true);
		
		Assert.assertEquals(result, exResult);
		
	}

	
	
	
	
}
