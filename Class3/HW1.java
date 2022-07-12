package HomeWork.Class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {

    /*
    Navigate to http://syntaxprojects.com
    Click on start practicing
    click on simple form demo
    enter any text on first text box
    click on show message
    quit the browser
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/index.php");
        driver.manage().window().maximize();

       WebElement startPractising = driver.findElement(By.xpath("//a[text() = ' Start Practising ']"));
       startPractising.click();

        Thread.sleep(2000);

        WebElement simpleFormDemo = driver.findElement(By.xpath("//a[text() = 'Check Box Demo']/preceding-sibling::a"));
        simpleFormDemo.click();

        Thread.sleep(2000);

        WebElement enterMessage = driver.findElement(By.xpath("//input[contains(@placeholder,'Message')]"));
        enterMessage.sendKeys("Eazy Peazy");

        WebElement showMessage = driver.findElement(By.xpath("//button[@onclick = 'showInput();']"));

        showMessage.click();

        Thread.sleep(5000);
        driver.quit();






    }



}
