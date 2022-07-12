package HomeWork.Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.plugin.javascript.navig.Link;

import java.util.ArrayList;
import java.util.List;

public class task2 {

    /*
    TC 1: Amazon link count:
    Open chrome browser
    Go to "https://www.amazon.com/"
    Get all links
    Get number of links that has text
    Print to console only the links that has text
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com/");

        List<WebElement> allLinks =  driver.findElements(By.tagName("a"));

        List <String> allLinksWithText = new ArrayList<>();

        for (WebElement li:allLinks){
            if(!li.getText().isEmpty()){
                allLinksWithText.add(li.getText());
            }
        }

        System.out.println(allLinksWithText);

    }
}
