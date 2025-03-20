package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class InteractWithDiffAlert extends DriverSetup {

    @Test
    public void testAlert() throws InterruptedException {
        driver.get("https://testing-and-learning-hub.vercel.app/Selenium/pages/javascript_alerts.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        Thread.sleep(3000);
        alert.accept();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@class='btn btn-warning']")).click();
        System.out.println(alert.getText());
        Thread.sleep(3000);
        alert.dismiss();
        Thread.sleep(3000);
        alert.accept();
        driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
        System.out.println(alert.getText());
        Thread.sleep(3000);
        alert.sendKeys("Xoxo");
        Thread.sleep(3000);
        alert.accept();
        Thread.sleep(3000);
    }
}

