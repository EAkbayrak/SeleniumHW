package HomeWork.Class6;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {

   public static String url = "https://syntaxprojects.com/javascript-alert-box-demo.php";

    public static void main(String[] args) throws InterruptedException {
        /*
        Go to https://syntaxprojects.com/javascript-alert-box-demo.php
        click on each button and handle the alert accordingly
         */

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");

        WebElement jsAlertBox = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
        jsAlertBox.click();
        Thread.sleep(2000);
        Alert jsAlert = driver.switchTo().alert();
        jsAlert.accept();

        WebElement jsConfirmBox = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        jsConfirmBox.click();
        Thread.sleep(2000);
        Alert jsConfirm = driver.switchTo().alert();
        jsConfirm.dismiss();

        WebElement jsPromptBox = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        jsPromptBox.click();
        Thread.sleep(2000);
        Alert jsPrompt = driver.switchTo().alert();
        jsPrompt.sendKeys("Emre");
        jsPrompt.accept();

    }
}
