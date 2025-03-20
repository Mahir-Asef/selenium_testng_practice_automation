package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandleIFrameElement extends DriverSetup {

    @Test
    public void testIFrameElement() {
        driver.get("https://testing-and-learning-hub.vercel.app/Selenium/pages/iframe.html");
        driver.manage().window().maximize();
         WebElement head2 = driver.findElement(By.xpath("//h2[normalize-space()='Learning Objectives']"));
        System.out.println(head2.getText());
        WebElement head3 = driver.findElement(By.xpath("//h2[normalize-space()='Google Search (Placeholder)']"));
        System.out.println(head3.getText());


//        Different way of handling iframe
//        driver.switchTo().frame(0);
//        driver.switchTo().frame("googleIframe");
        WebElement frame = driver.findElement(By.xpath("//iframe[@id='googleIframe']"));
        driver.switchTo().frame(frame);

        WebElement getStartedBtn = driver.findElement(By.xpath("//div[@class='header__aside__buttons__button']//a[@class='button '] //span[@class='text']"));
//        WebElement getStartedBtn = driver.findElement(By.xpath("//a[@href='https://programmablesearchengine.google.com/controlpanel/all']"));
        getStartedBtn.click();

//        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
        WebElement head4 = driver.findElement(By.xpath("//h2[normalize-space()='Google Search (Placeholder)']"));
        System.out.println(head4.getText());

    }
}
