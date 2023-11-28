package EMS_UserApp;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class UserTopSeller {

	WebDriver driver;
	
	@AfterMethod
	public void teardown() {
		
		driver.quit();
	}
	
	@BeforeMethod
	public void setup() {
		
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get("https://di6mm4n235un2.cloudfront.net/auth/home");
		driver.findElement(By.xpath("//button[@class='submit-button btn-margin']")).click();
		
		
		
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[1]/input")).sendKeys("subhaganeshan10@gmail.com");
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[2]/input")).sendKeys("Password@123");
		driver.findElement(By.xpath("//button[@class='submit-button']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
		
		String loginSuccessToast = "ログインしました";
		
		String toastText = driver.findElement(By.id("toast-container")).getText();
		
		if(toastText.contains(loginSuccessToast)) {
			
			System.out.println("Login success");
			
		}
		
		else 
		{
			System.out.println("Login failed");
		}
		
	}
	
	@Test
	public void verifySortingCategoryInTopSeller() {
	
	
		
		driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[1]/app-sidebar/div/div/button[4]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		
		
		if(driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-top-selling/div/div/div[1]/button")).isDisplayed())
		{
		     
			System.out.println("TopSeller Button was successfully clicked.");
        } 
	else
		{
	         System.out.println("TopSeller Button  was not clicked.");
	        }

		
		
		
		
		//category button
		driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-top-selling/div/div/div[1]/button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		driver.findElement(By.xpath("//div[@class='cdk-overlay-container']/div/div/div/div/div/div/button[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12000));
		
		
		driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-top-selling/div/div/div[1]/button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		driver.findElement(By.xpath("//div[@class='cdk-overlay-container']/div/div/div/div/div/div/button[3]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12000));
		
		
		driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-top-selling/div/div/div[1]/button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		driver.findElement(By.xpath("//div[@class='cdk-overlay-container']/div/div/div/div/div/div/button[4]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12000));
		
		
		
		driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-top-selling/div/div/div[1]/button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		driver.findElement(By.xpath("//div[@class='cdk-overlay-container']/div/div/div/div/div/div/button[5]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12000));
		
		
		
		driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-top-selling/div/div/div[1]/button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		driver.findElement(By.xpath("//div[@class='cdk-overlay-container']/div/div/div/div/div/div/button[6]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12000));
		
	
		
		driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-top-selling/div/div/div[1]/button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		driver.findElement(By.xpath("//div[@class='cdk-overlay-container']/div/div/div/div/div/div/button[7]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12000));
		
		driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-top-selling/div/div/div[1]/button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		driver.findElement(By.xpath("//div[@class='cdk-overlay-container']/div/div/div/div/div/div/button[8]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12000));
		
		
		
		driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-top-selling/div/div/div[1]/button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		driver.findElement(By.xpath("//div[@class='cdk-overlay-container']/div/div/div/div/div/div/button[9]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12000));
		
		
		driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-top-selling/div/div/div[1]/button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		driver.findElement(By.xpath("//div[@class='cdk-overlay-container']/div/div/div/div/div/div/button[10]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12000));
	
	}
	
	

}
