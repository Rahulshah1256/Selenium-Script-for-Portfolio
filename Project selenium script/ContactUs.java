package rahulSelenium;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class ContactUs {

	public static void main(String[] args) {
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\itctesting27\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://selenium.dev");
		driver.close();*/
		
		String path="C:\\Users\\itctesting27\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("file:///C:/Users/itctesting27/Downloads/Portfolio-Web_Application-Project-main/Portfolio-WebApplication/Registration%20Form/Login%20Form/Home%20Page/priyangaPortfolio/contact.html");
		driver.findElement(By.id("name")).sendKeys("rahul");
		driver.findElement(By.id("email")).sendKeys("rahul@gmail.com");
		driver.findElement(By.id("subject")).sendKeys("Send your Resume");
		driver.findElement(By.id("message")).sendKeys("I'am quite impressed with your portfolio. May I know what is the good time to talk with you?");
		driver.findElement(By.id("submit")).click();
		//alert
		driver.switchTo().alert().accept();
	}

}