package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class IteractingWithDropdown extends DriverSetup {

    @Test
    public void testDropdown() throws InterruptedException {
         driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//         driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
         WebElement selectElement = driver.findElement(By.id("dropdown-class-example"));
         selectElement.click();

         Thread.sleep(3000);
         Select select = new Select(selectElement);
         select.selectByValue("option3");
         Thread.sleep(3000);
         select.selectByIndex(1);
         Thread.sleep(3000);
         select.selectByValue("option2");
         Thread.sleep(3000);
         System.out.println("First Selected Option: " + select.getFirstSelectedOption().getText());
         List<WebElement> options = select.getOptions();

         for (WebElement el : options) {
             System.out.println(el.getText());
             System.out.println(el.getAttribute("value"));
         }

    }
}
