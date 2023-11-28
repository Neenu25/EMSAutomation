package EMS_AdminApp;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class RedirectionAdmin {
	
WebDriver driver;
	
	@BeforeMethod
	
	public void setup()  {
		driver = new ChromeDriver();
		driver.get("http://admin-panel-staging-ebay.s3-website-ap-northeast-1.amazonaws.com/auth/home");
		driver.manage().window().maximize();
		
		
		
		
		
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login/div/div/div[2]/div/div/form/div/div[1]/input")).sendKeys("rosemary@stunntech.com");
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login/div/div/div[2]/div/div/form/div/div[2]/input")).sendKeys("ebayweb@login");
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login/div/div/div[2]/div/div/form/div/div[4]/button")).click();
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	}
	
	@Test(priority=1)
	
	public void redirectionsadmin()  {
		
		
		//haamburger
		
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div[1]/app-admin-sidebar/div/div[1]/button")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div[1]/app-admin-sidebar/div/div[1]/button")).click();
		
		//administrator account
		
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div[1]/app-admin-sidebar/div/div[2]/button[2]/div")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		//user account
		
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div[1]/app-admin-sidebar/div/div[2]/button[3]/div")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		//access code
		
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div[1]/app-admin-sidebar/div/div[2]/button[4]/div")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		//keyword management
		
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div[1]/app-admin-sidebar/div/div[2]/button[5]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		//subscription management
		
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div[1]/app-admin-sidebar/div/div[2]/button[6]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		//EC site management
		
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div[1]/app-admin-sidebar/div/div[2]/button[7]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8000));
		
		//inventory control
		
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div[1]/app-admin-sidebar/div/div[2]/button[8]/div")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8000));
		
		//payment management
		
		// driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div[1]/app-admin-sidebar/div/div[2]/button[9]/div")).click();
		
	//	Thread.sleep(4000);
		
		//SETTINGS
		
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div[1]/app-admin-sidebar/div/div[2]/button[10]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8000));
		
		driver.quit();
		
	}
	
	@Test(priority=2)
	
	public void profileiconredirections() {
		
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div[2]/div/app-dashboard/div/div/div[1]/div/img")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8000));
		
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/button[1]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8000));
		
		driver.quit();
		
	}
	
	
	@Test (priority=3)
	
public void profileIconsettingsredirections()  {
		
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div[2]/div/app-dashboard/div/div/div[1]/div/img")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8000));
		
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/button[2]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8000));
		
		driver.quit();
		
	}

}
