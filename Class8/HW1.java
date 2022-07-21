package HomeWork.Class8;

/*
        go to https://the-internet.herokuapp.com/dynamic_controls
        click on checkbox and click on remove
        verify the text
        click on enable verify the textbox is enabled
        enter text and click disable
        verify the textbox is disabled
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HW1 {
    public static String url = "https://the-internet.herokuapp.com/dynamic_controls";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        //click on checkbox and click on remove

        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();

        WebElement removeButton = driver.findElement(By.xpath("//button[text() = 'Remove']"));
        removeButton.click();

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector("p#message"))));

        //verify the text

        WebElement goneText = driver.findElement(By.cssSelector("p#message"));
        System.out.println("Is the text visible: "+goneText.isDisplayed());

        //click on enable verify the textbox is enabled

        WebElement enableButton = driver.findElement(By.cssSelector("button[onclick='swapInput()']"));
        enableButton.click();

        WebElement enableTextBox = driver.findElement(By.xpath("//input[@type = 'text']"));

        wait.until(ExpectedConditions.elementToBeClickable(enableTextBox));

        System.out.println("Is the text box enabled?");
        System.out.println(enableButton.isEnabled());

        wait.until(ExpectedConditions.elementToBeClickable(enableTextBox));

        //enter text and click disable
        enableTextBox.sendKeys("Emre was here");

        WebElement disableButton = driver.findElement(By.xpath("//button[@onclick = 'swapInput()']"));
        disableButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(), 'disabled!')]")));

        //verify the textbox is disabled

        System.out.println("Is the text box still enabled?");
        System.out.println(enableTextBox.isEnabled());

    }
}
