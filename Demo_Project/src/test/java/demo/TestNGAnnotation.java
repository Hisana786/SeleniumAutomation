package demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotation {
	@Test
	public void sampleTestMethod()
	{
		System.out.println("This is a sample test method");
	}
	@BeforeMethod
	public void samplebeforemethod()
	{
		System.out.println("This is a sample before method");
	}
	@AfterMethod
	public void sampleaftermethod()
	{
		System.out.println("This is a sample after method");
	}
	@BeforeClass
	public void sampleBeforeClass()
	{
		System.out.println("This is a simple before class");
	}
	@AfterClass
	public void sampleafterclass()
	{
		System.out.println("This is a simple after class");
	}
	@BeforeTest
	public void samplebeforetest()
	{
		System.out.println("This is a sample before test");
	}
	@AfterTest
	public void sampleaftertest()
	{
		System.out.println("This is a sample after test");
	}
	@BeforeSuite
	public void samplebeforesuite()
	{
		System.out.println("This is a sample before suite");
	}
	@AfterSuite
	public void sampleaftersuite()
	{
		System.out.println("This is a sample after suite");
	}
}
