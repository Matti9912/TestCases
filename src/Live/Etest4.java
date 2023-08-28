package Live;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Etest4 extends BaseClass {
	
	
	
	@Test
	public void etest4()
	{
		driver.findElement(By.xpath("//a[text()='Mobile']")).click();
	driver.findElement(By.xpath("//a[text()='Add to Compare']")).click();
	driver.findElement(By.xpath("//a[text()='Add to Compare']/../../../../../following-sibling::li[2]/a[1]/following-sibling::div[1]/h2[1]/following-sibling::div[3]/button[1]/following-sibling::ul[1]/li[2]/span[1]/following-sibling::a[1]")).click();

	driver.findElement(By.xpath("//span[text()='Compare']")).click();
	
	
	
	
	/*Alert alt= driver.switchTo().alert();
	
	 String pres= alt.getText();
	 alt.dismiss();*/
	
	String iares=driver.findElement(By.xpath("//a[text()='IPhone']")).getText();
	String ieres = "IPHONE";

		Assert.assertEquals(iares, ieres);

 String xares=  driver.findElement(By.xpath("//a[text()='Sony Xperia']")).getText();
	String xeres="SONY XPERIA";
	
	
	Assert.assertEquals(xares, xeres);
	
	//driver.close();
	
	
	
	
	}
	

}
