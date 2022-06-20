package rahulSelenium;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class RegistrationForm {

	public static void main(String[] args) {
		
		String path="C:\\Users\\itctesting27\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("file:///C:/Users/itctesting27/Downloads/Portfolio-WebApplication/Registration%20Form/index.html");
		//first name
		driver.findElement(By.id("firstname")).sendKeys("rahul");
		
		//last name
		driver.findElement(By.id("lastname")).sendKeys("kumar");
		
		//date of birth
		WebElement dateDob = driver.findElement(By.xpath("//input[@id=\"dob\"]"));
		dateDob.sendKeys("20062022");
		
		//email
		driver.findElement(By.id("email")).sendKeys("rahul@gmail.com");
		
		//phone number
		driver.findElement(By.id("phonenumber")).sendKeys("9587456325");
		
		//gender
		Select gender = new Select(driver.findElement(By.id("gender")));
		gender.selectByVisibleText("Male");
		gender.selectByIndex(1);
		
		//address
		driver.findElement(By.id("address")).sendKeys("Soladevanahalli, Bengaluru");
		
		//state
		Select state = new Select(driver.findElement(By.id("state")));
		state.selectByVisibleText("Karnataka");
		state.selectByIndex(11);
		
		//resume upload
		WebElement uploadElement = driver.findElement(By.id("resume"));
		uploadElement.sendKeys("D:\\Rahul_Resume.pdf");
		
		//registration date
		WebElement dateBox = driver.findElement(By.xpath("//input[@id=\"registrationdate\"]"));
		dateBox.sendKeys("20062022");
		dateBox.sendKeys(Keys.TAB);
		dateBox.sendKeys("0130PM");
		
		////password
		driver.findElement(By.id("password")).sendKeys("Rahul@123");
		
		//confirm password
		driver.findElement(By.id("confirm-password")).sendKeys("Rahul@123");
		
		//agree terms and condition
		driver.findElement(By.id("agree")).click();
			
		//register
		driver.findElement(By.id("submit-btn")).click();
	}

}