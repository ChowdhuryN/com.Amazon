package AmazonStepDefiPackage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AmazonStepDefiClass {

	static WebDriver driver;
	static String URL = "https://www.amazon.com/";
	
	@Given("^Launch Application URL$")
	public void launch_Application_URL() throws Throwable {
	 
	System.setProperty("webdriver.chrome.driver","C:\\DRIVER\\chromedriver.exe");	
	driver = new ChromeDriver();	
	driver.get(URL);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();	
		
		
	System.out.println("This is First window ID:" + driver.getWindowHandles());
	System.out.println("This is First window Title:" + driver.getTitle());
	
	//WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(20));	
			
	Thread.sleep(2000);	
	}

	@Then("^Click Cell Phone & Accessories from the drop down$")
	public void click_Cell_Phone_Accessories_from_the_drop_down() throws Throwable {
	WebElement Cell =  driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	Select Phone = new 	Select(Cell);
	Phone.selectByVisibleText("Cell Phones & Accessories");
	
	}

	@Then("^Click Search Link$")
	public void click_Search_Link() throws Throwable {
	 
	WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(20));	
		
	WebElement Links = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	Links.click();	
		
	}

	@Then("^Click Cell Phones$")
	public void click_Cell_Phones() throws Throwable {
	 
	WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	
	WebElement Phones = driver.findElement(By.xpath("//span[text()='Cell Phones']"));	
	Phones.click();
	
	}

	@Then("^Click Apple from feature Brand$")
	public void click_Apple_from_feature_Brand() throws Throwable {
	
		Thread.sleep(2000);
		
	WebElement Apple = driver.findElement(By.xpath("//span[text()='Apple']"));	
	Apple.click();	
	}

	@Then("^Scroll Down$")
	public void scroll_Down() throws Throwable {
	 
	Thread.sleep(4000);	
		
	JavascriptExecutor Scroll = (JavascriptExecutor)driver;	
	Scroll.executeScript("scrollBy(0,2000)");	
		
	}
	
	@Then("^Click iPhone Pro Max$")
	public void click_iPhone_Pro_Max() throws Throwable {
	 
	WebElement ProMax = driver.findElement(By.xpath("//span[text()='Apple iPhone 12 Pro, 128GB, Pacific Blue - Fully Unlocked (Renewed)']"));	
	ProMax.click();	
		
	}

	@Then("^Verify iPhone Pro Max Page Displayed$")
	public void verify_iPhone_Pro_Max_Page_Displayed() throws Throwable {
	boolean result =  driver.findElement(By.id("a-page")).isDisplayed();
	Assert.assertTrue(result);	
		
		
	}

	@Then("^Close the application$")
	public void close_the_application() throws Throwable {
	 
		
	driver.quit();	
		
	}

	
	
}
