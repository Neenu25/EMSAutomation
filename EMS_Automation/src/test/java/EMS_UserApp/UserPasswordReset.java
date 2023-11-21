package EMS_UserApp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserPasswordReset {
	
	WebDriver driver ;
	

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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		
		
		
		String loginSuccessToast1 = "ログインしました";
		
		String toastText = driver.findElement(By.id("toast-container")).getText();
		
		if(toastText.contains(loginSuccessToast1)) {
			
			System.out.println("Login success and displayed message is : "+toastText );
			
		}
		
		else 
		{
			System.out.println("Login failed and displayed message is : "+toastText);
		}
		
			}
	
	
	
	
	@Test
	
	public void verifyWeCanUpdatePassword() {
	

	driver.findElement(By.xpath("//div[@class='user-detail']/div/img")).click();	
	
	driver.findElement(By.xpath("//button[@class='change-password-button']")).click();

	
	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-change-password/div/div/form/div/div[1]/input")).sendKeys("Subha@123");
	driver.findElement(By.xpath("/html/body/div/div[2]/div/mat-dialog-container/app-change-password/div/div/form/div/div[2]/input")).sendKeys("Password@123");
	driver.findElement(By.xpath("//button[@class='update-btn']")).click();
	driver.findElement(By.xpath("//button[@class='save-change-button']")).click();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
	
	
	// Locate the toast message within a div element by its aria-label attribute
    WebElement toastMessage = driver.findElement(By.xpath("//div[@aria-label='プロフィールが更新されました']"));

    // Perform actions on the toast message, e.g., retrieve text
    String toastText = toastMessage.getText();
    //System.out.println("Toast Message Text: " + toastText);

	
	
	
    if (toastText.contains("プロフィールが更新されました")) {
    	
        System.out.println("Toast message is displayed with the expected content : プロフィールが更新されました");
        
  } 
   else {
        System.out.println("Toast message is not displayed or does not have the expected content.");
    }

    	
	
	driver.findElement(By.xpath("//h3[@class='log-out']")).click(); //logout
	
	
	
	
	//loginwithupdatedPassword
	

	driver.findElement(By.xpath("//button[@class='submit-button btn-margin']")).click();
	driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[1]/input")).sendKeys("subhaganeshan10@gmail.com");
	driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[2]/input")).sendKeys("Password@123");
	driver.findElement(By.xpath("//button[@class='submit-button ng-star-inserted']")).click();
	
	}
	
	
}
