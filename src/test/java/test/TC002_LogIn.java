package test;

import org.testng.annotations.Test;

import base.ProjectSpec;
import pages.LogIn;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

public class TC002_LogIn extends ProjectSpec {
	
	 @BeforeTest
	  public void beforeTest() {
		 excelfile = "TC002_DemoBlazeLogIn";
	  }

	
	
  @Test(dataProvider = "getData")
  public void LogInTest( String username, String Password) throws InterruptedException {
	  
	  new LogIn(driver)
	  .LogInLink()
	  .userName(username)
	  .passWord(Password)
	  .loginButton()
	  .alert();
	  
	  
	  
  }
	  
  }

  
 

