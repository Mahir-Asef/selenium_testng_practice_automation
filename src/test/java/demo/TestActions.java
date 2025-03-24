package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestActions extends DriverSetup {
    By mouse_hover_section = By.xpath("//legend[normalize-space()='Mouse Hover Example']");
    @Test
    public void testDiffActions() throws InterruptedException {

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        Actions actions = new Actions(driver);
        actions.scrollByAmount(0,1000).build().perform();
//        actions.scrollToElement(getElement(mouse_hover_section)).build().perform();
        Thread.sleep(3000);
        actions.moveToElement(getElement(By.xpath("//button[@id='mousehover']"))).build().perform();
        actions.click(getElement(By.xpath("//a[normalize-space()='Top']"))).build().perform();
        Thread.sleep(3000);

        actions.sendKeys(getElement(By.xpath("//input[@id='autocomplete']")),"Bangladesh").build().perform();
        Thread.sleep(3000);

        actions.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
        Thread.sleep(3000);
        actions.keyDown(Keys.CONTROL).sendKeys("x").build().perform();
        Thread.sleep(3000);
        actions.click(getElement(By.id("name"))).keyDown(Keys.CONTROL).sendKeys("v").build().perform();
        Thread.sleep(3000);
    }


}
