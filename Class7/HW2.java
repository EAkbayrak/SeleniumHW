package HomeWork.Class7;

/*
        navigate to http://www.uitestpractice.com/Students/Contact
        click on the link
        get text
        print out in the console
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW2 {
    public static String url = "http://www.uitestpractice.com/Students/Contact";
    public static void main(String[] args) {

       System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
       WebDriver driver = new ChromeDriver();

       driver.get(url);
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

       driver.manage().window().maximize();

       WebElement ajaxLink = driver.findElement(By.linkText("This is a Ajax link"));
       ajaxLink.click();

       WebElement allText = driver.findElement(By.xpath("//p[contains(text(), 'Selenium')]"));
       
       System.out.println(allText.getText());

    }
}
