package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
	
	WebDriver driver;

	
  public homePage(WebDriver driver)
	{
	
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="a#menu_pim_viewPimModule")
	WebElement pimelement;
	
	@FindBy(xpath="//a[text()='Add Employee']")
	WebElement addemployee;
	
	
	public void mouseHoverPIM()
	{
	 	Actions act=new Actions(driver);
		act.moveToElement(pimelement).perform();
		
	}
	
	public void selectAddEmployee()
	{
		addemployee.click();
	}
	
}
