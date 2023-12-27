package selenium_jekins_exerice;

	import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;

	public class TestBase_Selenium {

	    WebDriver driver;
	    Login_Selenium lp;

	    @BeforeTest
	    public void setup() throws Exception {

	        System.out.println("launching app on chrome browser -----using TestNG");
	        driver = new ChromeDriver();
	        driver.get(Constants_selenium.orangehrm);
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	        
	       
	        
	    }

	    @AfterTest
	    public void teardown() throws Exception {

	        Thread.sleep(7000);
	        driver.close();
	        System.out.println("closing an app");

	    }
	    
}
