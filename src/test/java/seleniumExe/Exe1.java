package seleniumExe;

	import org.junit.Test;
	import org.junit.Before;
	import org.junit.After;
	import static org.junit.Assert.*;
	import static org.hamcrest.CoreMatchers.is;
	import static org.hamcrest.core.IsNot.not;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.remote.RemoteWebDriver;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.Dimension;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.Keys;
	import java.util.*;
	import java.net.MalformedURLException;
	import java.net.URL;
	@SuppressWarnings("unused")
	public class Exe1 {
	  protected WebDriver driver;
	  private Map<String, Object> vars;
	  JavascriptExecutor js;
	  @Before
	  public void setUp() {
	    driver = new ChromeDriver();
	    js = (JavascriptExecutor) driver;
	    vars = new HashMap<String, Object>();
	  }
	  @After
	  public void tearDown() {
	    driver.quit();
	  }
	  @SuppressWarnings("deprecation")
	@Test
	  public void nopTestt() throws InterruptedException {
	    driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	    driver.manage().window().setSize(new Dimension(1050, 670));
	    driver.findElement(By.id("RememberMe")).click();
	    driver.findElement(By.cssSelector(".button-1")).click();
	    assertThat(driver.getTitle(), is("Dashboard / nopCommerce administration"));
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Logout")).click();
	  }
	}
	

