package selenium_jekins_exerice;

	
	import org.openqa.selenium.By;
import org.testng.Assert;
	import org.testng.annotations.Test;



	public class Selenium extends TestBase_Selenium{
	    
	    @Test
	    public void verifyLogin() throws InterruptedException {
	        
	        
	        
	    	driver.findElement(By.name("username")).sendKeys("Admin");
	        driver.findElement(By.name("password")).sendKeys("admin123");
	        driver.findElement(By.tagName("button")).click();
	        
	        
	        Thread.sleep(2000);
	        System.out.println("application URL after login: " + driver.getCurrentUrl());
	        
	        
	        driver.findElement(By.className("oxd-userdropdown-name")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.className("oxd-toast-container oxd-toast-container--bottom"));
	        Thread.sleep(2000);
	        driver.findElement(By.partialLinkText("logo")).click();
	        
	        
	        Thread.sleep(3000);
	        System.out.println("application URL after logout: " + driver.getCurrentUrl());
	        
	        
	        
	        
	    }

	}


