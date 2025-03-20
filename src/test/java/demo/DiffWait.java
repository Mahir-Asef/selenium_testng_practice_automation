package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class DiffWait extends DriverSetup {

    @Test
    public void testDelayElement() throws InterruptedException {
        driver.get("https://testing-and-learning-hub.vercel.app/Selenium/pages/slow_resources_page.html");
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
//        Thread.sleep(1500);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement successMsg = driver.findElement(By.xpath("//p[normalize-space()='Success: The slow request has completed.']"));
        Assert.assertTrue(successMsg.isDisplayed());
        Assert.assertEquals(successMsg.getText(), "Success: The slow request has completed.");

        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
//        Thread.sleep(1500);
         successMsg = driver.findElement(By.xpath("//p[normalize-space()='Success: The slow request has completed.']"));
        Assert.assertTrue(successMsg.isDisplayed());
        Assert.assertEquals(successMsg.getText(), "Success: The slow request has completed.");
    }

    @Test
    public void testExplicitWait() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://qavbox.github.io/demo/delay/");

        driver.findElement(By.xpath("//input[@name='commit']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@id='two']")));
//        WebElement clickMe = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@id='two']")));
//        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h2[@id='two']"), "I am here!"));
        WebElement clickMe = driver.findElement(By.xpath("//h2[@id='two']"));
        wait.until(ExpectedConditions.textToBePresentInElement(clickMe,"I am here!"));
        clickMe.getText();
        System.out.println(clickMe.getText());
        Assert.assertTrue(clickMe.isDisplayed());
        Assert.assertEquals(clickMe.getText(), "I am here!");

        driver.findElement(By.xpath("//input[@id='loaderStart']")).click();
        WebElement message = driver.findElement(By.xpath("//h2[@id='loaderdelay']"));
        System.out.println(message.getText());
        Assert.assertTrue(message.isDisplayed());
        Assert.assertEquals(message.getText(), "I appeared after 5 sec loading");


    }
}
