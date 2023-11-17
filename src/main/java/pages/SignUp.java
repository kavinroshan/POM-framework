package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpec;

public class SignUp extends ProjectSpec {
	
	@FindBy(xpath = "//a[text()='Sign up']")
	WebElement signup;
	
	
	@FindBy(xpath = "//input[@id='sign-username']")
	WebElement username;
	
	@FindBy(xpath = "//input[@id='sign-password']")
	WebElement password;
	
	@FindBy(xpath = "//button[text()='Sign up']")
	WebElement SignUpButton;
	
	
	public SignUp(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public SignUp SignupClick() {
		click(signup);
		return this;
	}
	
	public SignUp userName(String Username) {
		sendKeys(username, Username);
		return this;
	}
	
	public SignUp passWord (String pass) {
		sendKeys(password, pass);
		return this;
	}
	
	
	public SignUp signupButton () {
		click(SignUpButton);
		return this;
	}
	
	public SignUp getAlert() throws InterruptedException {
	 
	 Alert();
		
		return this;
	}
	
	public SignUp getAssert() {
		Assertion();
		return this;
	}

}
