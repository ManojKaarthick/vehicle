package Test_NG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data {
	
	
	@Test(dataProvider="logindata")
	public void method(String email,String pwd) {
		
		System.out.println(email+" "+pwd);
		
	}
	
	
	
	
	
	@DataProvider(name="logindata")
	public Object[][] getdata(){
	   Object[][] data= {{"kumar@gmail.com","hi"},{"hari@gmail.com","helooo"}};
	   return data;
	}

}
