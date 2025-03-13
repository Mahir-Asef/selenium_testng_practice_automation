package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTest extends DriverSetup {
//    public static void main(String[] args) throws InterruptedException {
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.facebook.com");
//        Thread.sleep(2000);
//        driver.close();

//        close
//    }
    @Test
   public void testPageTitle(){
        driver.get("http://www.facebook.com");
        Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
        System.out.println(driver.getCurrentUrl());
    }
    @Test
    public void testCreateAccount(){
        driver.get("http://www.facebook.com");
        driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
        Assert.assertEquals(driver.getTitle(), "Sign up for Facebook");
        System.out.println(driver.getCurrentUrl());
        String expectedUrl = "https://www.facebook.com/r.php?entry_point=login"; // Replace with the actual expected URL
        String actualUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + actualUrl);
        Assert.assertEquals(actualUrl, expectedUrl, "URL does not match!");
    }
    @Test
    public void testCreatePage() {
        driver.get("http://www.facebook.com");

        // Click on 'Create a Page' link
        driver.findElement(By.xpath("//a[contains(text(),'Create a Page')]")).click();

        // Verify the page title
        Assert.assertEquals(driver.getTitle(), "Facebook");

        // Print and validate the current URL
        System.out.println(driver.getCurrentUrl());
        String expectedUrl = "https://www.facebook.com/pages/create/?ref_type=registration_form"; // Replace with actual expected URL
        String actualUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + actualUrl);
        Assert.assertEquals(actualUrl, expectedUrl, "URL does not match!");
    }

}
