package Test_NG;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tc_1 {
	
	@BeforeMethod
	void beforemethod() {
		System.out.println("This is beforemethod");
	}
	@AfterMethod
	void aftermethod() {
		System.out.println("This is aftermethod");
	}
	@BeforeClass
	void beforeclass() {
		System.out.println("this is before class");
		
	}
	@AfterClass
	void afterclass() {
		System.out.println("this is after class");
	}
	@Test
	void test1() {
		System.out.println("this is test1");
	}
	@Test
	void test2() {
		System.out.println("this is test2");
	}
	
	@BeforeTest
	void beforetest() {
		System.out.println("this is before test");
	}
	@AfterTest
	void aftertest() {
		System.out.println("this is aftertest");
	}
	

}
