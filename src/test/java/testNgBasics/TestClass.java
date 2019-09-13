package testNgBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("beforeSuite executed");
	}
	
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("beforeTest executed");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeClass executed");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforeMethod executed");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("afterMethod executed");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("afterCLass executed");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("afterTest executed");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("afterSuite executed");
	}
	
	
	
	@Test(priority=1)
	public void tc_01()
	{
		System.out.println("tc 01 execution started");
		System.out.println("clicked on something");
		System.out.println("typed something");
		System.out.println("clicked on submited");
	}
	
	@Test(priority=0)
	public void tc_02()
	{
		System.out.println("tc 02 execution started");
		System.out.println("clicked on something");
		System.out.println("typed something");
		System.out.println("clicked on submited");
	}

}
