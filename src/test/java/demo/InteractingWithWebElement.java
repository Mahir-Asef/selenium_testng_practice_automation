package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InteractingWithWebElement extends DriverSetup{

    @Test
    public void testWebElementState() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement radioButtonExample = driver.findElement(By.xpath("//legend[normalize-space()='Radio Button Example']"));
        String text = radioButtonExample.getText();
        System.out.println(text);
        System.out.println(radioButtonExample.isDisplayed());
        WebElement autoCompleteInputBox = driver.findElement(By.xpath("//input[@id='autocomplete']"));
        autoCompleteInputBox.sendKeys("Bangladesh");
        Thread.sleep(3000);
        autoCompleteInputBox.clear();
        Thread.sleep(3000);
        WebElement radioBtn1 = driver.findElement(By.xpath("//input[@value='radio1']"));

        System.out.println("Radio button 1 is pressed before click: " + radioBtn1.isSelected());
        radioBtn1.click();
        Thread.sleep(3000);
        System.out.println("Radio button 1 is pressed after click: " + radioBtn1.isSelected());

        WebElement textBox = driver.findElement(By.id("displayed-text"));
        WebElement hideButton = driver.findElement(By.id("hide-textbox"));
        WebElement showButton = driver.findElement(By.id("show-textbox"));
        System.out.println("Before clicking Hide: " + textBox.isDisplayed());
        hideButton.click();
        System.out.println("After clicking Hide: " + textBox.isDisplayed());
        showButton.click();
        // Check if the element is visible again
        System.out.println("After clicking Show: " + textBox.isDisplayed());
        WebElement inputName = driver.findElement(By.xpath("//input[@id='name']"));
        String placeholderText = inputName.getAttribute("placeholder");
        System.out.println(placeholderText);

        WebElement homeBtn = driver.findElement(By.xpath("//button[normalize-space()='Home']"));
        String CssValue = homeBtn.getCssValue("background-color");
        System.out.println(CssValue);
        System.out.println(radioButtonExample.isEnabled());

    }
}
