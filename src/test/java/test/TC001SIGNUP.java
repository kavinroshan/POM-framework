package test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpec;
import pages.SignUp;

public class TC001SIGNUP extends ProjectSpec{

	@BeforeTest
	  public void beforeTest() {
		 excelfile ="TC001_SignUpDemoBlaze";
		 
	  }
	

	  @Test(dataProvider = "getData")
	  public void SignUpTest(String username, String Password) throws InterruptedException {
		  
		  new SignUp(driver)
		  .SignupClick()
		  .userName(username)
		  .passWord(Password)
		  .signupButton()
		  .getAlert()
		  .getAssert();
		
		  
	  }
	 
}
