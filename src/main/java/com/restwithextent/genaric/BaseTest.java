package com.restwithextent.genaric;

import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseTest 
{
	public RequestSpecification httprequest;
	public Response response;
	/*public  static  ExtentHtmlReporter htmlreport;
	public  static  ExtentReports extent;
	public  static  ExtentTest logger;
	
	
	@BeforeTest
	public void precondition()
	{
		htmlreport = new ExtentHtmlReporter("./Reports/Reports.html");
		htmlreport.config().setTheme(Theme.DARK);
		htmlreport.config().setReportName("Test Report");
		htmlreport.config().setDocumentTitle("API Automation Report");
		
		extent = new ExtentReports();
		extent.attachReporter(htmlreport);	
		
	}
	
	
	@AfterTest
	public void postcondition(ITestResult res)
	{
		
		if(res.getStatus() == ITestResult.FAILURE)
		{
			logger.log(Status.FAIL, "Test is failed"+res.getName());
		}
		else if(res.getStatus() == ITestResult.SUCCESS)
		{
			logger.log(Status.PASS, "Test is passed"+  res.getName());
		}
		else if(res.getStatus() == ITestResult.SKIP)
		{
			logger.log(Status.SKIP, "Test is skipped"+ res.getName());
		}
		
		
		extent.flush();
	}*/

}
