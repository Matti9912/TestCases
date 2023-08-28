package Live;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Etest8 extends BaseClass {
	
	@Test
	public void etest8()
	{
		driver.findElement(By.xpath("//span[text()='Account']")).click();
		driver.findElement(By.xpath("//a[text()='My Orders']")).click();
		
		
		driver.findElement(By.xpath("//a[text()='Reorder']")).click();
		WebElement qele=driver.findElement(By.xpath("//td[@class='product-cart-actions']/input[1]"));
		qele.click();
		qele.clear();
		qele.sendKeys("10");
		driver.findElement(By.xpath("//span[text()='Update']")).click();
		driver.findElement(By.xpath("//span[text()='Proceed to Checkout']")).click();
		
WebElement rele=driver.findElement(By.cssSelector("select[id='billing-address-select']"));
		
		Select s= new Select(rele);
		s.selectByIndex(1);
		driver.findElement(By.xpath("//button[@class='button']")).click();
		
		driver.findElement(By.xpath("//button[@class='button']/../../../../following-sibling::li[1]/div[1]/following-sibling::div[1]/form[1]/div[1]//following-sibling::div[2]/button[1]")).click();
		
		

		driver.findElement(By.cssSelector("input[id='p_method_checkmo']")).click();
		driver.findElement(By.xpath("//div[@id='payment-tool-tip']/following-sibling::div[1]/p[1]/following-sibling::button[1]")).click();
		driver.findElement(By.cssSelector("button[class='button btn-checkout']")).click();
		
		String fres= driver.findElement(By.xpath("//h1[text()='Your order has been received.']")).getText();
		Reporter.log(fres,true);
		driver.findElement(By.xpath("//span[text()='Continue Shopping']")).click();
		
	}

}
