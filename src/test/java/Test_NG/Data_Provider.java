package Test_NG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	
	@Test(dataProvider="logindata")
	void method1(String email,String Pwd) {
		
		System.out.println(email+"  "+Pwd);
		
	}
	@DataProvider(name="logindata")
	public Object[][] data(){
		String[][] dd= {{"manoj@gmail.com","nopassword"},
		{"dinesh@gmail.com","hello"}};
		return dd;
		
		
	}
	

}
