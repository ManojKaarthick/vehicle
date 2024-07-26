package Test_NG;

import org.testng.annotations.Test;

public class Grouping {
	
	
	@Test(groups = {"smoke"})
	void testone() {
		System.out.println("this is test1");
	}
	@Test(groups= {"sanity"})
	void testtwo() {
		System.out.println("this s test2");
	}
	@Test(groups= {"smoke","regression"})
	void testthree() {
		System.out.println("this is test 3");
	}

}
