package ometest;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.testng.Assert;
	import org.testng.annotations.Test;

	public class Sometest1 extends BaseTest{
	    
	    
	    @Test
	    public void handleFrame() throws Exception {
	        
	    	Thread.sleep(5000);
	        
	        WebElement myFrame = driver.findElement(By.xpath("//*[contains(@data-src,'photo')]"));
	        Thread.sleep(5000);
	        driver.switchTo().frame(myFrame);
	        Thread.sleep(5000);
	        
	        //Planning the ascent
	        
	        String alt_img3 = driver.findElement(By.xpath("//*[contains(@src,'tatras3')]")).getAttribute("alt");
	        System.out.println("actual ALT img3: " + alt_img3);
	        Thread.sleep(5000);
	        Assert.assertEquals(alt_img3, "Planning the ascent", "validation of ALT image get failed !! ");
	        
	        
	        
	        
	    }

	}

