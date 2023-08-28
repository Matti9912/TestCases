package Live;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Etest7 extends BaseClass{
	
	
	
	
	@Test
	public void etest7()
	{
		driver.findElement(By.xpath("//span[text()='Account']")).click();
		driver.findElement(By.xpath("//a[text()='My Orders']")).click();
		driver.findElement(By.xpath("//a[text()='View Order']")).click();
		driver.findElement(By.xpath("//a[text()='View All']")).click();
		String rares= driver.findElement(By.cssSelector("td[class='number']")).getText();
		Reporter.log(rares,true);
		String reres="100019626";
		
		String sres= driver.findElement(By.cssSelector("td[class='status']")).getText();
		Reporter.log(sres,true);
	  
	  driver.findElement(By.xpath("//a[text()='View Order']")).click();
	  driver.findElement(By.cssSelector("a[class='link-print']")).click();
	
	
	}

}
