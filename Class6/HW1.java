package HomeWork.Class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    /*
    Navigate to https://syntaxprojects.com/bootstrap-iframe.php
    verify the header text Sorry, We Couldn't Find Anything For "Asksn" is displayed
    verify enroll today button is enabled
     */

    public static String url = "https://syntaxprojects.com/bootstrap-iframe.php";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        driver.manage().window().maximize();
        driver.switchTo().frame("FrameOne");
        String extectedHeader = "Sorry, We Couldn't Find Anything For “Asksn”";

        WebElement actualHeader = driver.findElement(By.xpath("//h1[@class='heading-13']"));

        if(actualHeader.isDisplayed()){
            System.out.println("The header is displayed");
        }else {
            System.out.println("The header is not displayed");
        }

        System.out.println(actualHeader.getText());
        System.out.println(extectedHeader);

        if(actualHeader.getText().equals(extectedHeader)){
            System.out.println("The header is displaying the expected text");
        }else System.out.println("The header needs to change");

        driver.switchTo().defaultContent();
        driver.switchTo().frame("FrameTwo");

        WebElement enrollButton = driver.findElement(By.className("text-block-2"));

        if(enrollButton.isEnabled()){
            System.out.println("The Enroll today button is enabled and clickable");
        }

        enrollButton.click();



    }
}
