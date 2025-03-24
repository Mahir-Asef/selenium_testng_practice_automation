package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
    public WebElement getElement(By locator) {
        return driver.findElement(locator);
    }

    public void loadPage(String url){
        driver.get(url);
    }

    public void clickOnElement(By locator){
        getElement(locator).click();
    }

    public void writeOnElement(By locator, String text){
        getElement(locator).sendKeys(text);
    }

    public String getAttributeValue(By locator, String attributeName){
        return getElement(locator).getAttribute(attributeName);
    }

    public Boolean isVisible(By locator){
        return getElement(locator).isDisplayed();
    }

    public String getElementText(By locator){
        return getElement(locator).getText();
    }

}
