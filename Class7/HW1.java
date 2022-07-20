package HomeWork.Class7;

/*
        Go to https://demoqa.com/browser-windows

        click on New Tab and print the text from new tab in the console
        click on New Window and print the text from new window in the console
        click on New Window Message and print the text from new window in the console

        Verify (compare) the titles for each page
        Print out the title of the all pages

 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class HW1 {
    public static String url = "https://demoqa.com/browser-windows";
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        String mainPage = driver.getWindowHandle();


        //  click on New Tab and print the text from new tab in the console
        WebElement newTabButton = driver.findElement(By.id("tabButton"));
        WebElement newWindowButton = driver.findElement(By.id("windowButton"));
       // WebElement newWindowMessageButton = driver.findElement(By.id("messageWindowButton"));

        newTabButton.click();
        newWindowButton.click();
        //   newWindowMessageButton.click();

        Set<String> allHandles = driver.getWindowHandles();
        Iterator <String> i= allHandles.iterator();

        mainPage = i.next();
        //   String child3 = i.next();
        String newWindow = i.next();
        String newTab = i.next();

        driver.switchTo().window(newTab);
        WebElement newTabText=driver.findElement(By.id("sampleHeading"));
        String newTabTitle = driver.getTitle();
        System.out.println(newTabText.getText());

        driver.switchTo().window(newWindow);
        WebElement newWindowText = driver.findElement(By.id("sampleHeading"));
        String newWindowTitle = driver.getTitle();
        System.out.println(newWindowText.getText());

        //This below doesn't work

  //     driver.switchTo().window(child3);
  //     WebElement newWindowMessageText = driver.findElement(By.xpath("//*[contains(text(),'sharing but']"));
  //     driver.close();

           if(newTabTitle.isEmpty()){
               System.out.println("The New Tab title is empty");
           }else System.out.println(newTabTitle);

           if(newWindowTitle.isEmpty()){
               System.out.println("The New Window Title is Empty");
           }else System.out.println(newWindowTitle);




      //  driver.quit();




















    }
}
