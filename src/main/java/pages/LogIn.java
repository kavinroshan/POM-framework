package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpec;

public class LogIn extends ProjectSpec {
	
	
	@FindBy(xpath = "//a[text()='Log in']")
	WebElement loginLink;
	
	@FindBy(xpath = "//input[@id='loginusername']" )
	WebElement username;
	
	@FindBy(xpath = "//input[@id='loginpassword']")
	WebElement password;
	
	@FindBy(xpath = "//button[text()='Log in']")
	WebElement LogInButton;
	
	
	public LogIn(WebDriver driver) {             //constructor
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public LogIn LogInLink() {
		click(loginLink);
		return this;
	}
	
	
	public LogIn userName(String Username) {
		
		sendKeys(username, Username);
		return this;
	}
	
	public LogIn passWord(String pass) {
		sendKeys(password, pass);
		return this;
	}

	
	public LogIn loginButton() {
		click(LogInButton);
		return this;
	}
	
	public LogIn alert() throws InterruptedException {
		Alert();
		return this;
	}
	
	public LogIn getAssert() {
		Assertion();
		return this;
	}
	
}
