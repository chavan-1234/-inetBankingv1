package com.inetbanking.utilities; 

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import BaseTest.BaseClass;

public class ExtentreportManager implements ITestListener  {
	   // 3 classes 
	   public ExtentSparkReporter sparkreporter;
	   public ExtentReports  extent;
	   public  ExtentTest test;
	   
	   public  String repname;
	   
	   public void onStart() {
		         String timestamp = new SimpleDateFormat("yymmddhhmmss").format(new Date());
		         
		         repname= "Test-Report-" + timestamp + ".html";
		         sparkreporter=new ExtentSparkReporter(".\\reports\\" +repname);//location of report
		         
		         sparkreporter.config().setDocumentTitle("opencart automation report"); //title of the report
		         sparkreporter.config().setReportName("Automation fuctional testing"); //name of the report
		         sparkreporter.config().setTheme(Theme.DARK); // theme
		         
		         extent=new ExtentReports();
		         extent.attachReporter(sparkreporter);
		         extent.setSystemInfo("application", "opencart");
		         extent.setSystemInfo("module", "admin");
		         extent.setSystemInfo("submodule", "customer");
		         extent.setSystemInfo("username" , System.getProperty("user.name"));
		         extent.setSystemInfo("environment" , "qa");
		         
		         
	   }
	   public void onTestSucces(ITestResult result) {
		       test  = extent.createTest(result.getTestClass().getName());
		       test.assignCategory(result.getMethod().getGroups());
		       test.log(Status.PASS,result.getName()+ "got succesfully executed");
		       
		   
	   }
	   public void onTestFailure(ITestResult result) {
		         test=extent.createTest(result.getTestClass().getName());
		         test.assignCategory(result.getMethod().getGroups());
		         test.log(Status.FAIL, result.getName() + "got failed" );
		         test.log(Status.INFO, result.getThrowable().getMessage());
		            
		           try {
		            String imgpath = new BaseClass().captureScreen(result.getName());
		            test.addScreenCaptureFromPath(imgpath);
		           }
		           catch (Exception e1) {
					e1.printStackTrace();
				}
		            
		                            
		   
	   }
	   
	           public void onTestSkipped(ITestResult result) {
		       test  = extent.createTest(result.getTestClass().getName());
		       test.assignCategory(result.getMethod().getGroups());
		       test.log(Status.SKIP, result.getName()+ "got skipped");
		       test.log(Status.INFO, result.getThrowable().getMessage());
		       
	        }
	            
	            
	            public void onFinish(ITestContext testcontext) {
	            	extent.flush();
	            	
	            }
	   

}
