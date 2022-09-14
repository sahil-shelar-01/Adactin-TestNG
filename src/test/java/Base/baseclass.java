package Base;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class baseclass {
	
	public static WebDriver driver;

	@BeforeSuite
	public void suitebefore() {
		// Timestamp
			
		 Date date = new Date();  
         Timestamp ts=new Timestamp(date.getTime());  
         SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
         System.out.println(formatter.format(ts));   
		
	}
	
	
	@AfterSuite
	public void suiteafter() {
		// Timestamp
		 Date date = new Date();  
         Timestamp ts=new Timestamp(date.getTime());  
         SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
         System.out.println(formatter.format(ts));   
		
	}
	 @BeforeTest
	 public void testbefore() {
		 System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\shela\\OneDrive\\Desktop\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
						
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://adactinhotelapp.com/");
	 }
	 @BeforeClass
		public void classbefore() {
		///Login application
			//username and password
			//login button

			WebElement a = driver.findElement(By.xpath("//input[@id='username']"));
			a.sendKeys("sahil123");
			WebElement b = driver.findElement(By.xpath("//input[@id='password']"));
			b.sendKeys("1234567");
			WebElement c = driver.findElement(By.xpath("//input[@id='login']"));
			c.click();
		}
		
		@AfterTest
		
		public void testafter() {
			driver.quit();
		}
}
