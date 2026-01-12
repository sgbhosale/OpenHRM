package TestCase;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageObject.*;
import base.BaseClass;

public class TC_001_AddEmployee extends BaseClass {
	
	public homePage homepage;
	public Login loginpage;
	private PIM_Page pimpage;
		
	@BeforeMethod	
	public void preconditions() 
	{
		  homepage=new homePage(driver);
		  loginpage=new Login(driver);
		  pimpage=new PIM_Page(driver);
		  loginpage.enterUsername(prop.getProperty("username"));
		  loginpage.enterPass(prop.getProperty("pass"));
		  
		  loginpage.loginToApp();
		  homepage.mouseHoverPIM();
		  homepage.selectAddEmployee();
	}
	
	@Test(dataProvider="dataSet")
	public void SampleTest(String[] para)
	{
	
		pimpage.enterFirstName(para[0]);
		pimpage.enterMiddleName(para[1]);
		pimpage.enterLastName(para[2]);
		pimpage.enterEmpId(para[3]);
		pimpage.clickToSave();
		
	}
	
	@DataProvider(indices= {1})
	public Iterator<String[]> dataSet()
	{
		ArrayList<String[]> l=new ArrayList<String[]>();
		l.add(new String[] {"Sandeep"});

		  
		return l.iterator();
		
		
	}

}
