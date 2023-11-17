package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utility.UtilityClass;

public class ProjectSpec extends UtilityClass {
	
	@Parameters({"browser", "url"})
	@BeforeMethod
	public void browserLaunch(String browser, String url) {
		 
		//launchBrowser("chrome", "https://www.demoblaze.com/");
		launchBrowser(browser, url);
	}
	
	
	@DataProvider(name= "getData")
	public String[][] getdData() throws IOException{
		String[][]	data = readExcel(excelfile);
		return data;
	}
	
	
	@AfterMethod
	public void closeBrowser() {
		close();
	}
	
}
	
	
	
	
	
	
	
	
	
//	public static void main(String[] args) {        //launch url
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.demoblaze.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		System.out.println("url launched");
//	}
//	
//	
//	public class SignUp{
//		public void signup() {
//			
//		}
//	}
//	
//	
//	
//	
//	
//
//}
