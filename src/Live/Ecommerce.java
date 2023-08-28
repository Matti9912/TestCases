package Live;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Ecommerce extends BaseClass {
	
	
	
	@Test(priority = 1)
	public void etest() throws IOException
	{   
		RandomNumber r= new RandomNumber();
		
		
		//String tittle=driver.getTitle();
	
	
	//Reporter.log(tittle,true);
	
         // 	String Atittle="Home page";
          	
         // Assert.assertEquals(Atittle, tittle);
	
		driver.findElement(By.className("level0")).click();
		  String mtittle=  driver.getTitle();
		  Reporter.log(mtittle,true);
		  String mactual="Mobile";
		 /* Assert.assertEquals(mactual, mtittle);
		  File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(f,new File("C:\\screenshots\\bharath"+r.RN()+"BEFORE.jpg"));
			//System.out.println("hi");
		  
		  WebElement ele=driver.findElement(By.cssSelector("select[title='Sort By']"));
		  Select s= new Select(ele);
		  s.selectByVisibleText("Name");
		  File g=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(g,new File("C:\\screenshots\\bharath"+r.RN()+"AFTERsort.jpg"));
			
			
			
			
			driver.navigate().refresh();*/
		  
		
		
		
		
		
	}
	
	
	@Test(priority = 2)
	public void Etest2()
	{
		
		
		driver.navigate().refresh();
		
			driver.findElement(By.xpath("//a[text()='Mobile']")).click();
			String price=driver.findElement(By.xpath("//span[text()='$100.00']")).getText();
			Reporter.log(price,true);
			driver.findElement(By.id("product-collection-image-1")).click();
			String Price2= driver.findElement(By.className("price")).getText();
			Reporter.log(Price2,true);
			Assert.assertEquals(price, Price2);
			
		
		
	}
	
	@Test(priority = 3)
	public void Etest3()
	{
		
		driver.findElement(By.xpath("//a[text()='Mobile']")).click();
		//driver.findElement(By.xpath("//button[@class='button btn-cart']/../../../following-sibling::li[2]/a[1]/following-sibling::div[1]/h2[1]/following-sibling::div[2]/button[1]/span[1]/span[1]")).click();
		driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
		WebElement qty= driver.findElement(By.cssSelector("input[class='input-text qty']"));
		qty.clear();
		qty.click();
		qty.sendKeys("1000");
	driver.findElement(By.xpath("//span[text()='Update']")).click();
	
	String res=driver.findElement(By.cssSelector("p[class='item-msg error']")).getText();
	String res1="* The maximum quantity allowed for purchase is 500.";
	Assert.assertEquals(res, res1);
	driver.findElement(By.xpath("//span[text()='Empty Cart']")).click();
	
	String acm=driver.findElement(By.xpath("//h1[text()='Shopping Cart is Empty']")).getText();
	String ecm="SHOPPING CART IS EMPTY";
	Assert.assertEquals(acm, ecm);
	Reporter.log(acm);
	
	
	
		
		
		
		
		
		
		
		
		
	}

	










}
