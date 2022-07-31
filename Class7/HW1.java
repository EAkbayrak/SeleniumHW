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
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.Set;

public class HW1 {
    public static String url = "https://demoqa.com/browser-windows";
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","Drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get(url);

        String mainPage = driver.getWindowHandle();


        //  click on New Tab and print the text from new tab in the console
        WebElement newTabButton = driver.findElement(By.id("tabButton"));
        WebElement newWindowButton = driver.findElement(By.id("windowButton"));
        WebElement newWindowMessageButton = driver.findElement(By.id("messageWindowButton"));

        newTabButton.click();
        newWindowButton.click();
        newWindowMessageButton.click();

        Set<String> allHandles = driver.getWindowHandles();
        Iterator <String> i= allHandles.iterator();

        mainPage = i.next();
        String newTab = i.next();
        String newWindow = i.next();
        String  newWindowMessage = i.next();

        String mainTitle = driver.getTitle();
        System.out.println("Man title should be "+ mainTitle);

        //click on New Tab and print the text from new tab in the console

        driver.switchTo().window(newWindow);
        WebElement newTabText=driver.findElement(By.cssSelector("h1#sampleHeading"));
        String newTabTitle = driver.getTitle();
        System.out.println(newTabText.getText());

        // click on New Window and print the text from new window in the console

      driver.switchTo().window(newWindow);
      WebElement newWindowText = driver.findElement(By.id("sampleHeading"));
      String newWindowTitle = driver.getTitle();
      System.out.println(newWindowText.getText());

//       click on New Window Message and print the text from new window in the console

       driver.switchTo().window(newWindowMessage);
       driver.manage().window().maximize();
       WebElement newWindowMessageText = driver.findElement(By.xpath("//*[contains(text(),'by')]"));
       String newWindowMessageTitle = driver.getTitle();
        System.out.println(newWindowMessageText.getText());

      //  Verify (compare) the titles for each page
      //  Print out the title of the all pages

        Set<String> allWindowsHandles = driver.getWindowHandles();
        Iterator<String> iteratorHandles= allWindowsHandles.iterator();

        while(iteratorHandles.hasNext()){
            String nextTab = iteratorHandles.next();
            driver.switchTo().window(nextTab);
            String title = driver.getTitle();
           String url = driver.getCurrentUrl();

            if(title.isEmpty()) System.out.println("The following URL ("+url+") doesn't have a tab title");
            else System.out.println("The url ("+url+") has a title of "+title);

            }

        }




    //    if(newTabTitle.isEmpty()) System.out.println("The New Tab title is empty");
    //      else System.out.println(newTabTitle);
//
    //      if(newWindow.isEmpty()) System.out.println("The New Window Title is empty");
    //      else System.out.println(newWindowTitle);
//
    //      if(newWindowMessageTitle.isEmpty()) System.out.println("The New Window Message is empty");
    //      else System.out.println(newWindowMessageTitle);
//
    //      if(mainTitle.isEmpty()) System.out.println("Main page's title is empty");
    //      else System.out.println(mainTitle);
//

      //  driver.quit();



    }

