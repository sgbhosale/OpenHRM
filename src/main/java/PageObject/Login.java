package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	public WebDriver driver;
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="input#txtUsername")
	WebElement username;
	
	@FindBy(css="input#txtPassword")
	WebElement password;
	
	@FindBy(css="input#btnLogin")
	WebElement submitbtn;
	
	
	public void enterUsername(String userpara)
	{
		username.sendKeys(userpara);
	}
	
	public void enterPass(String userpass)
	{
		password.sendKeys(userpass);
	}
	
	public void loginToApp()
	{
		submitbtn.click();
	}
	

}
