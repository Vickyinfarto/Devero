package wwwwwwww;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.pageObjModel.CreateLeadPage;
import com.pageObjModel.HomePage;
import com.pageObjModel.LoginPage;
import com.propery.TestDataProperties;
import com.utils.FunctionalLibrary;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sq extends FunctionalLibrary{

	
	@DataProvider(name= "employee")
	public Object[][] test(){                                                                                                                                                                
		return new Object[][] {{"INFOSYS", "Denver","James"  }};
		
	}
	
	
	
	@BeforeSuite
	
	public void name1() throws IOException, Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/crmsfa/control/createLeadForm");
		driver.manage().window().maximize();
		LoginPage lp = new LoginPage();
		lp.getLoginUserName().sendKeys(TestDataProperties.getTestProperties().getProperty("usrname"));
		lp.getLoginPassword().sendKeys(TestDataProperties.getTestProperties().getProperty("password"));
	

			lp.getSubmitButton().click();
	}
	
	
	@Test(dataProvider = "employee")
	public void name2(String companyName1, String firstName1, String lastName1) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		CreateLeadPage cl = new CreateLeadPage();
		HomePage hp = new HomePage();

		hp.getClickCreateLead().click();
		cl.getCompanyName().sendKeys(companyName1);
		cl.getFirstName().sendKeys(firstName1);
		cl.getLastName().sendKeys(lastName1);
		cl.getCreateLeadButton().click();
		String text1 = cl.getIdNumber().getText();
		System.out.println(text1);
		
	
	}
	@BeforeMethod
	public void name3() {
		System.out.println("before method");
	}
	
	@Test
	public void name4() {
		System.out.println("test1");
	}
	@Test	
	public void name5() {
		System.out.println("test2");
	}
	@AfterMethod
	public void name6() {
		System.out.println("after method");
	}

	@AfterClass
	public void name7() {
		System.out.println("after class");
	}
	@AfterSuite
	public void name8() {
		System.out.println("after suite");
	}
}




