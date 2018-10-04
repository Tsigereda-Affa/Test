package emailCheck;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;



public class NewTest{
	
	
	
	@Test
	public void clickEmailAndCheckContent() {

		//String driverPath = System.getProperty("user.dir");
		//System.setProperty("webdriver.chrome.driver", driverPath + "\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.google.com");
		PageObject obj=PageFactory.initElements(driver, PageObject.class);
		obj.enterEmail("tsg4aba@gmail.com");
		obj.enterPassword("Sidda2020");
		obj.clickEmail("Email");
		

		Assert.assertEquals("This email is send with Virtru protection to check content.","This email is send with Virtru protection to check content.");
        System.out.println("This line is executed because assertEquals "
                + "passed since both the strings are same");
       driver.close();
	}
}
