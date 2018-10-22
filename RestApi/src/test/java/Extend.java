import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extend {

	
	@Test()
	public void testm()
	{
	
		 ExtentHtmlReporter reporter=new  ExtentHtmlReporter(".\\Report\\Learn.html");
		 		
		 
		  ExtentReports extent =new ExtentReports();
		  
		    extent.attachReporter(reporter);
		    
		   ExtentTest loger = extent.createTest("my first " , "DISC");
		   
		    loger.log(Status.INFO, "see your info");
		    loger.log(Status.PASS, "see your info");
		    
		  extent.flush();
		  
		  ExtentTest loger2=extent.createTest("my second" , "if script is pass");
		  
		  loger2.log(Status.PASS, "if script is pass");
		  extent.flush();
		  
        ExtentTest loger3=extent.createTest("my second" , "if script is pass");
		  
		  loger3.log(Status.FAIL, "if script is FAIL");
		  extent.flush();
		  
				  
		    
	}
}
