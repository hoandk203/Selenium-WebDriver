package Dangnhap;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest {
	public static void main(String[] args) {
		//thiet lap chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64/chromedriver.exe");
				
		//khoi tao chromedriver
		WebDriver driver= new ChromeDriver();
		
		try {
			driver.get("https://student.hunre.edu.vn/congthongtin/login.aspx");
			
			
			WebDriverWait wait= new WebDriverWait(driver, Duration.ofMinutes(2));
			
			WebElement username= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
			username.sendKeys("21111064607");
			
			WebElement password= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
			password.sendKeys("18/09/2003");
			
			WebElement loginBtn= wait.until(ExpectedConditions.elementToBeClickable(By.className("btn-login")));
			loginBtn.click();
			
			wait.until(ExpectedConditions.urlContains("congthongtin/Index.aspx"));
			
			WebElement dashboardElement= wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class='user-image']")));
			if(dashboardElement.isDisplayed()) {
				System.out.print("Test Passed");
			}else {
				System.out.print("Test Failed");
			}
		}catch(Exception e) {
			System.out.print("Test Failed: " + e.getMessage());
		}finally {
			driver.quit();
		}
	}
}
