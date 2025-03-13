package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverSetup {
    public WebDriver driver;

    @BeforeSuite
    public void openBrowser(){
            driver = new ChromeDriver();
    }

    @AfterSuite
    public void closeBrowser(){
        driver.quit();
    }
}
