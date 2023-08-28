package Live;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Etest6 extends BaseClass {
	
	
	@Test
	public void etest6() throws Throwable
	{
RandomNumber r=new RandomNumber();
		
		driver.findElement(By.xpath("//span[text()='Account']")).click();
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.id("firstname")).sendKeys("Raju",Keys.TAB,"kumar",Keys.TAB,"matti",Keys.TAB,"raju87690"+r.RN()+"@gmail.com",Keys.TAB,"Raju@123",Keys.TAB,"Raju@123");
		
		driver.findElement(By.xpath("//span[text()='Register']")).click();
	
		driver.findElement(By.xpath("//a[text()='TV']")).click();
		driver.findElement(By.xpath("//a[text()='Add to Wishlist']")).click();
		driver.findElement(By.xpath("//span[text()='Account']")).click();
		driver.findElement(By.xpath("//a[text()='My Wishlist (1 item)']")).click();
		driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
		driver.findElement(By.xpath("//span[text()='Proceed to Checkout']")).click();
		  WebElement ele10= driver.findElement(By.cssSelector("input[id='billing:street1']"));
		  ele10.clear();
		  ele10.sendKeys("ABC");
		  WebElement ele11= driver.findElement(By.cssSelector("input[id='billing:city']"));
		  ele11.clear();
		  ele11.sendKeys("New York");
		WebElement rele=driver.findElement(By.cssSelector("select[id='billing:region_id']"));
		
		Select s= new Select(rele);
		s.selectByIndex(43);
		
		 WebElement ele13= driver.findElement(By.cssSelector("input[id='billing:postcode']"));
		 ele13.clear();
		 ele13.sendKeys("542896");
		 WebElement ele14= driver.findElement(By.cssSelector("input[id='billing:telephone']"));
		 ele14.clear();
		 ele14.sendKeys("12345678");
		 Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='button']")).click();
		
		Thread.sleep(10000);
		// driver.findElement(By.xpath("//div[@id='shipping-method-buttons-container']/p[1]/following-sibling::button[1]/span[1]")).click();
		String pres=driver.findElement(By.className("sp-methods")).getText();
		
		Reporter.log(pres,true);
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='button']/../../../../following-sibling::li[1]/div[1]/following-sibling::div[1]/form[1]/div[1]//following-sibling::div[2]/button[1]")).click();
		
		Reporter.log(pres,true);
		
		
		driver.findElement(By.cssSelector("input[id='p_method_checkmo']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='payment-tool-tip']/following-sibling::div[1]/p[1]/following-sibling::button[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("button[class='button btn-checkout']")).click();
		Thread.sleep(5000);
		String fres= driver.findElement(By.xpath("//h1[text()='Your order has been received.']")).getText();
		Reporter.log(fres,true);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Continue Shopping']")).click();
		
		
		
		
	}

}
