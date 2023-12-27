package controlButton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    WebDriver driver;

    @BeforeTest
    public void setup() throws InterruptedException {

        System.out.println("launching app on chrome browser -----using TestNG");
        driver = new ChromeDriver();
        driver.get(Constants.testing);
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");

    }

    @AfterTest
    public void teardown() throws Exception {

        Thread.sleep(5000);
        driver.close();
        System.out.println("closing an app");

    }

}


