package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPassword {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/user/Documents/Neelu/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Forgot password?")).click();
	}

}
