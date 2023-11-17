package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpec;

public class HomePage extends ProjectSpec {
	
	@FindBy(xpath ="//a[text()='Sign up']")
	WebElement signup;
	
	@FindBy(xpath = "//a[text()='Log in']")
	WebElement login;
	
	
public HomePage(WebDriver driver) {
		
		this.driver = driver; 
		PageFactory.initElements(driver, this);
}
		
		public HomePage clickSignUp() {
			
			click(signup);
			return this ;
			
		}
		
		public HomePage clickLogin() {
			
			click(login);
			return this;
		}
	
}
