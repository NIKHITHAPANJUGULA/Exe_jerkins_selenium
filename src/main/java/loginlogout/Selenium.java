package loginlogout;


	import org.openqa.selenium.By;
	import org.testng.annotations.Test;

	public class Selenium<driver> extends Basetest{
	    
	    
	    @Test
	    public void verifyLogin() throws Exception {
	        
	        Thread.sleep(3000);
	        
	        driver.findElement(By.name("username")).sendKeys("Admin");
	        driver.findElement(By.name("password")).sendKeys("admin123");
	        driver.findElement(By.tagName("button")).click();
	        
	        
	        Thread.sleep(2000);
	        System.out.println("application URL after login: " + driver.getCurrentUrl());
	        
	        
	        driver.findElement(By.className("oxd-userdropdown-name")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.className("oxd-toast-container oxd-toast-container--bottom"));
	        Thread.sleep(2000);
	        driver.findElement(By.partialLinkText("ogo")).click();
	        
	        
	        Thread.sleep(3000);
	        System.out.println("application URL after logout: " + driver.getCurrentUrl());
	        
	        
	        
	    }
	}

