package base;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {
	public Properties prop;
	public FileInputStream fis;
	public static  WebDriver driver;
	public String browser;
	
	
	
	@Parameters("browser")
	@BeforeTest	
	public void browserSetUp(@Optional("chrome")String browser )
	{
		
		prop=new Properties();
		try 
		{
			fis=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\com.open_hrm\\src\\main\\resources\\operHRM.properties");
			prop.load(fis);
		} 
		catch (IOException e)
		{
			System.out.println("Properties File Not Found");
		}
		
		
		if(browser.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", prop.getProperty("chromepath"));
		
		driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", prop.getProperty("firefoxpath"));
			
			driver=new FirefoxDriver();
			}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com");
		
	}

}
