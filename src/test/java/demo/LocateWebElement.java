package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import javax.swing.*;

public class LocateWebElement extends DriverSetup {

    @Test
     public void testLocateWebElement() throws InterruptedException {
        driver.get("https://www.google.com");

        Thread.sleep(3000);

//        WebElement text_input_box = driver.findElement(By.id("APjFqb"));
//        WebElement text_input_box = driver.findElement(By.name("q"));
//        WebElement text_input_box = driver.findElement(By.className("gLFyf"));
//        WebElement text_input_box = driver.findElement(By.tagName("textarea"));
//        WebElement text_input_box = driver.findElement(By.cssSelector("textarea[id='APjFqb']"));
//        WebElement text_input_box = driver.findElement(By.cssSelector("textarea[name='q']"));
//        WebElement text_input_box = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
//         text_input_box.sendKeys("Web Automation");
        WebElement langSelectEnglish = driver.findElement(By.linkText("English"));
        langSelectEnglish.click();
        Thread.sleep(3000);

        WebElement langSelectBangla = driver.findElement(By.linkText("বাংলা"));
        langSelectBangla.click();
        Thread.sleep(3000);
        WebElement langSelect = driver.findElement(By.partialLinkText("lish"));
        langSelect.click();
         Thread.sleep(3000);

    }
}
