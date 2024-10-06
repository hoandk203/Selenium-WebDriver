package Dangnhap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {
	public static void main(String[] args) {
		//thiet lap chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64/chromedriver.exe");
		
		//khoi tao chromedriver
		WebDriver driver= new ChromeDriver();
		
		try {
			//1. toi da hoa cua so trinh duyet
			driver.manage().window().maximize();
			
			//2. dieu huong den URL
			driver.navigate().to("https://final-project-js-seven.vercel.app");
			
			//3. lay tieu de va in ra console
			System.out.print(driver.getTitle());
			
			//4. thoat han trinh duyet
			driver.quit();
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			// dam bao rang trinh duyet duoc dong neu co loi
			if(driver != null) {
				driver.quit();
			}
		}
	}
}
