package Live;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

public class Glistners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
		String s =result.getName();
		Reporter.log(s+"testcase is started",true);
		
		
		
		}

	@Override
	public void onTestSuccess(ITestResult result) {
		String s1 =result.getName();
		Reporter.log(s1+"testcase is successed",true);
		}

	@Override
	public void onTestFailure(ITestResult result) {
		String s =result.getName();
		
	File sh=((TakesScreenshot)BaseClass.driver).getScreenshotAs(OutputType.FILE);
	try {
		Files.copy(sh,new File("C:\\screenshots\\"+s+".jpg"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		Reporter.log(s+"testcase is failed",true);
		}

	@Override
	public void onTestSkipped(ITestResult result) {
		String s =result.getName();
Reporter.log(s+"testcase is skipped",true);
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		Reporter.log("is started",true);	
	}

	@Override
	public void onFinish(ITestContext context) {
	
		Reporter.log("project is ended",true);
		
	}
	
	
	
	
	

}
