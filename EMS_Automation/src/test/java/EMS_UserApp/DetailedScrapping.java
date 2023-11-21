package EMS_UserApp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DetailedScrapping {
	
WebDriver driver  = new ChromeDriver();

	
	@BeforeMethod
	public void setup() {
		
		
		 

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get("https://di6mm4n235un2.cloudfront.net/auth/home");
		driver.findElement(By.xpath("//button[@class='submit-button btn-margin']")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[1]/input")).sendKeys("subhaganeshan10@gmail.com");
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[2]/input")).sendKeys("Password@123");
		driver.findElement(By.xpath("//button[@class='submit-button']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
		
		driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/app-header/div/div[2]/button")).click();	//extract button
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		
		
		}
	
	@Test()
	public void switchlocators() throws InterruptedException {
	
	 By iconLocator0 = By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/div[1]/div[1]/div[1]");
     By iconLocator1 = By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/div[1]/div[1]/div[2]");
     By iconLocator2 = By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/div[1]/div[1]/div[3]");
     By iconLocator3 = By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/div[1]/div[1]/div[5]");
     By iconLocator4 = By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/div[1]/div[1]/div[6]");
     By iconLocator5 = By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/div[1]/div[1]/div[7]");
     By iconLocator6 = By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/div[1]/div[1]/div[8]");
     By iconLocator7 = By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/div[1]/div[1]/div[9]");
     
     
     
     // Identify the icon elements
     WebElement iconElement0 = driver.findElement(iconLocator0);
     WebElement iconElement1 = driver.findElement(iconLocator1);
     WebElement iconElement2 = driver.findElement(iconLocator2);
     WebElement iconElement3 = driver.findElement(iconLocator3);
     WebElement iconElement4 = driver.findElement(iconLocator4);
     WebElement iconElement5 = driver.findElement(iconLocator5);
     WebElement iconElement6 = driver.findElement(iconLocator6);
     WebElement iconElement7 = driver.findElement(iconLocator7);
     
     
    
     String iconClicked = "/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/div[1]/div[1]/div[5]"; 
   
     switch (iconClicked) {
     
     
     //2nd street
         case "/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/div[1]/div[1]/div[1]":
             iconElement0.click();
             
             
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
     		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3000));
     		
     		
     		//switch to new tab
     		
     		String mainWindow0 = driver.getWindowHandle();
     		for (String handle : driver.getWindowHandles())
     		{
     			if(!handle.equals(mainWindow0)) {
     				driver.switchTo().window(handle);
     				break;
     			}
     		}
     		
     		
     		Thread.sleep(3000);
     		
     	WebElement searchInput0 =	driver.findElement(By.id("headSearchInput"));
     	searchInput0.sendKeys("T shirt");
     	searchInput0.submit();
     	Thread.sleep(3000);
     	
     	String sourceWebsiteURL0 = driver.getCurrentUrl();
     	Thread.sleep(3000);
     	
     	System.out.println("Current URL: " + sourceWebsiteURL0);
     	
     	Thread.sleep(3000);

     	
     	driver.switchTo().window(mainWindow0);
     	Thread.sleep(3000);
     	
     	 WebElement urlInput0 = driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[1]/div/input"));
             urlInput0.sendKeys(sourceWebsiteURL0);
             
             driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[2]/div/input")).sendKeys("3");
             driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[2]/div/button")).click();
     	
             
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
                
            
             break;
             
             
            // rakuten
         case "/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/div[1]/div[1]/div[2]":
             iconElement1.click();
             
             
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
     		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3000));
     		
     		
     		//switch to new tab
     		
     		String mainWindow1 = driver.getWindowHandle();
     		for (String handle : driver.getWindowHandles())
     		{
     			if(!handle.equals(mainWindow1)) {
     				driver.switchTo().window(handle);
     				break;
     			}
     		}
     		
     		
     		Thread.sleep(3000);
     		
     	WebElement searchInput1 =	driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[1]/div/div/div/form"));
     	searchInput1.sendKeys("T shirt");
     	searchInput1.submit();
     	Thread.sleep(3000);
     	
     	String sourceWebsiteURL1 = driver.getCurrentUrl();
     	Thread.sleep(3000);
     	
     	System.out.println("Current URL: " + sourceWebsiteURL1);
     	
     	Thread.sleep(3000);

     	
     	driver.switchTo().window(mainWindow1);
     	Thread.sleep(3000);
     	
     	 WebElement urlInput1 = driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[1]/div/input"));
             urlInput1.sendKeys(sourceWebsiteURL1);
             
             driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[2]/div/input")).sendKeys("3");
             driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[2]/div/button")).click();
     	
             
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
                
            
             break;
             
             
             //paypay

         case "/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/div[1]/div[1]/div[3]":
             iconElement2.click();
             
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
     		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3000));
     		
     		
     		//switch to new tab
     		
     		String mainWindow2 = driver.getWindowHandle();
     		for (String handle : driver.getWindowHandles())
     		{
     			if(!handle.equals(mainWindow2)) {
     				driver.switchTo().window(handle);
     				break;
     			}
     		}
     		
     		
     		Thread.sleep(3000);
     		
     	WebElement searchInput2 =	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/header/div/div[3]/form/div/input"));
     	searchInput2.sendKeys("T shirt");
     	searchInput2.submit();
     	Thread.sleep(3000);
     	
     	String sourceWebsiteURL2 = driver.getCurrentUrl();
     	Thread.sleep(3000);
     	
     	System.out.println("Current URL: " + sourceWebsiteURL2);
     	
     	Thread.sleep(3000);

     	
     	driver.switchTo().window(mainWindow2);
     	Thread.sleep(3000);
     	
     	 WebElement urlInput2 = driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[1]/div/input"));
             urlInput2.sendKeys(sourceWebsiteURL2);
             
             driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[2]/div/input")).sendKeys("3");
             driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[2]/div/button")).click();
     	
             
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
           
             break;
             
             
            //mercari 

         case "/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/div[1]/div[1]/div[5]":
             iconElement3.click();
             
             
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
     		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3000));
     		
     		
     		//switch to new tab
     		
     		String mainWindow3 = driver.getWindowHandle();
     		for (String handle : driver.getWindowHandles())
     		{
     			if(!handle.equals(mainWindow3)) {
     				driver.switchTo().window(handle);
     				break;
     			}
     		}
     		
     		
     		Thread.sleep(3000);
     		
     	WebElement searchInput3 =	driver.findElement(By.name("query"));
     	searchInput3.sendKeys("T shirt");
     	searchInput3.submit();
     	Thread.sleep(3000);
     	
     	String sourceWebsiteURL3 = driver.getCurrentUrl();
     	Thread.sleep(3000);
     	
     	System.out.println("Current URL: " + sourceWebsiteURL3);
     	
     	Thread.sleep(3000);

     	
     	driver.switchTo().window(mainWindow3);
     	Thread.sleep(3000);
     	
     	 WebElement urlInput3 = driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[1]/div/input"));
             urlInput3.sendKeys(sourceWebsiteURL3);
             
             driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[2]/div/input")).sendKeys("3");
             driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[2]/div/button")).click();
     	
             
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
               
             break;

             
             //auctions
             
         case "/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/div[1]/div[1]/div[6]":
             iconElement4.click();
             
             
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
     		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3000));
     		
     		
     		//switch to new tab
     		
     		String mainWindow4 = driver.getWindowHandle();
     		for (String handle : driver.getWindowHandles())
     		{
     			if(!handle.equals(mainWindow4)) {
     				driver.switchTo().window(handle);
     				break;
     			}
     		}
     		
     		
     		Thread.sleep(3000);
     		
     	WebElement searchInput4 =	driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div/div/div[4]/div[1]/form/div/div[1]/div/input"));
     	searchInput4.sendKeys("T shirt");
     	searchInput4.submit();
     	Thread.sleep(3000);
     	
     	String sourceWebsiteURL4 = driver.getCurrentUrl();
     	Thread.sleep(3000);
     	
     	System.out.println("Current URL: " + sourceWebsiteURL4);
     	
     	Thread.sleep(3000);

     	
     	driver.switchTo().window(mainWindow4);
     	Thread.sleep(3000);
     	
     	 WebElement urlInput4 = driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[1]/div/input"));
             urlInput4.sendKeys(sourceWebsiteURL4);
             
             driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[2]/div/input")).sendKeys("3");
             driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[2]/div/button")).click();
     	
             
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
               
             break;
             
             //Digimart
            
         case "/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/div[1]/div[1]/div[7]":
             iconElement5.click();
             
             
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
     		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3000));
     		
     		
     		//switch to new tab
     		
     		String mainWindow5 = driver.getWindowHandle();
     		for (String handle : driver.getWindowHandles())
     		{
     			if(!handle.equals(mainWindow5)) {
     				driver.switchTo().window(handle);
     				break;
     			}
     		}
     		
     		
     		Thread.sleep(3000);
     		
     	WebElement searchInput5 =	driver.findElement(By.className("keyword"));
     	searchInput5.sendKeys("T shirt");
     	searchInput5.submit();
     	Thread.sleep(3000);
     	
     	String sourceWebsiteURL5 = driver.getCurrentUrl();
     	Thread.sleep(3000);
     	
     	System.out.println("Current URL: " + sourceWebsiteURL5);
     	
     	Thread.sleep(3000);

     	
     	driver.switchTo().window(mainWindow5);
     	Thread.sleep(3000);
     	
     	 WebElement urlInput5 = driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[1]/div/input"));
         urlInput5.sendKeys(sourceWebsiteURL5);
             
             driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[2]/div/input")).sendKeys("3");
             driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[2]/div/button")).click();
     	
             
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
               
             break;
             
             
             //net mall
           
         case "/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/div[1]/div[1]/div[8]":
             iconElement6.click();
             
             
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
     		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3000));
     		
     		
     		//switch to new tab
     		
     		String mainWindow6 = driver.getWindowHandle();
     		for (String handle : driver.getWindowHandles())
     		{
     			if(!handle.equals(mainWindow6)) {
     				driver.switchTo().window(handle);
     				break;
     			}
     		}
     		
     		
     		Thread.sleep(3000);
     		
     	WebElement searchInput6 =	driver.findElement(By.className("searchbox__input"));
     	searchInput6.sendKeys("T shirt");
     	searchInput6.submit();
     	Thread.sleep(3000);
     	
     	String sourceWebsiteURL6 = driver.getCurrentUrl();
     	Thread.sleep(3000);
     	
     	System.out.println("Current URL: " + sourceWebsiteURL6);
     	
     	Thread.sleep(3000);

     	
     	driver.switchTo().window(mainWindow6);
     	Thread.sleep(3000);
     	
     	 WebElement urlInput6 = driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[1]/div/input"));
             urlInput6.sendKeys(sourceWebsiteURL6);
             
             driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[2]/div/input")).sendKeys("3");
             driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[2]/div/button")).click();
     	
             
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
               
             break;    
             
             
             
            //...rakuten mobile
         case "/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/div[1]/div[1]/div[9]":
             iconElement7.click();
             
             
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
     		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3000));
     		
     		
     		//switch to new tab
     		
     		String mainWindow7 = driver.getWindowHandle();
     		for (String handle : driver.getWindowHandles())
     		{
     			if(!handle.equals(mainWindow7)) {
     				driver.switchTo().window(handle);
     				break;
     			}
     		}
     		
     		
     		Thread.sleep(3000);
     		
     	WebElement searchInput7 =	driver.findElement(By.className("query"));
     	searchInput7.sendKeys("T shirt");
     	driver.findElement(By.className("submit")).click();
     	Thread.sleep(3000);
     	
     	String sourceWebsiteURL7 = driver.getCurrentUrl();
     	Thread.sleep(3000);
     	
     	System.out.println("Current URL: " + sourceWebsiteURL7);
     	
     	Thread.sleep(3000);

     	
     	driver.switchTo().window(mainWindow7);
     	Thread.sleep(3000);
     	
     	 WebElement urlInput7 = driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[1]/div/input"));
             urlInput7.sendKeys(sourceWebsiteURL7);
             
             driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[2]/div/input")).sendKeys("3");
             driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[2]/div/button")).click();
     	
             
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
               
             break;
             
           
         default:
             System.out.println("Icon not found.");
     	}
     
     	Thread.sleep(9000);
		
		driver.findElement(By.className("extract-button-text")).click();
	    
	    Thread.sleep(9000);
	    
	    driver.findElement(By.className("action-btn-yes")).click();
		
	    //check success toast
	  

	  WebElement toastElement =  driver.findElement(By.xpath("//div[@class='toast-top-right toast-container']"));
	 String toastMessage = toastElement.getText();
     String expectedMessage = "商品抽出を開始しました";
     
//	    Verify if the actual message matches the expected message
     
     if (toastMessage.equals(expectedMessage)) 
     {
	        System.out.println("Success message is correct: " + toastMessage);
    } 
     else 
     {
	     System.out.println("Success message is incorrect: " + toastMessage);
	  }
		
     
     Thread.sleep(9000);
    // scroll until this text : 抽出中 is visible .print it and wait until it turns to text : 抽出が完了しました
    
  Duration customTimeout = Duration.ofSeconds(10);
	WebDriverWait wait = new WebDriverWait(driver,customTimeout);
//     
    String textToScrollTo = "抽出中";
    String textToWaitFor  = "抽出が完了しました";
    scrollDownUntilTextIsVisible(driver, textToScrollTo, wait);
   
// Find and print the text
     WebElement textElement = driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-dashboard/div/div[3]/div[1]/div[1]/div/button"));
     String foundText = textElement.getText();
     System.out.println("Found text: " + foundText);
    
}
//
	public static void scrollDownUntilTextIsVisible(WebDriver driver, String textToScrollTo, WebDriverWait wait) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		while (true) {
            // Check if the text is present in the page source
            if (driver.getPageSource().contains(textToScrollTo)) {
                break;
            }
            // Scroll down using JavaScript
            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
	}

		// Wait for the text to become visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-dashboard/div/div[3]/div[1]/div[1]/div/button")));
	}
   
}


