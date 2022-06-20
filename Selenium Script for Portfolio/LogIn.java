package rahulSelenium;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class LogIn {

	public static void main(String[] args) {
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\itctesting27\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://selenium.dev");
		driver.close();*/
		
		String path="C:\\Users\\itctesting27\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("file:///C:/Users/itctesting27/Downloads/Portfolio-WebApplication/index.html");
		driver.findElement(By.id("phone-email")).sendKeys("rahulshah");
		driver.findElement(By.id("password")).sendKeys("Rahul@123");
		driver.findElement(By.id("submittion")).click();

	}

}
