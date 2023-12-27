package ometest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import xpath.Constants;

@SuppressWarnings("unused")
public class BaseTest {

    WebDriver driver;

    @BeforeTest
    public void setup() throws InterruptedException {

        System.out.println("launching app on chrome browser -----using TestNG");
        driver = new ChromeDriver();
        //driver.get(Constants.Sample);
        Thread.sleep(5000);
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

    }

    @AfterTest
    public void teardown() throws Exception {

        Thread.sleep(5000);
        driver.close();
        System.out.println("closing an app");

    }

}


