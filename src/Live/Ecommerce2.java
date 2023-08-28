package Live;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ecommerce2 extends BaseClass{
	
	@Test
	public void Etest2()
	{
		
		
		
		
			driver.findElement(By.xpath("//a[text()='Mobile']")).click();
			String price=driver.findElement(By.className("price")).getText();
			Reporter.log(price,true);
			driver.findElement(By.cssSelector("img[id='product-collection-image-1']")).click();
			String Price2= driver.findElement(By.className("price")).getText();
			Reporter.log(Price2,true);
			Assert.assertEquals(price, Price2);
			
		
		
	}
	

}
