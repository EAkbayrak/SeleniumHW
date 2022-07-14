package HomeWork.Class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/*
        Go to ebay.com
        get all the categories and print them in the console
        select Computers/Tables & Networking
        click on search
        verify the header
 */

public class HW2 {

    public static String url="https://www.ebay.com/";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.get(url);

        WebElement categories = driver.findElement(By.id("gh-cat"));

        Select selectCat = new Select(categories);

        List<WebElement> categoriesList = selectCat.getOptions();

        for(WebElement cat:categoriesList) {
            System.out.println(cat.getText());
        }

        selectCat.selectByValue("58058");

        WebElement searchButton = driver.findElement(By.cssSelector("input#gh-btn"));
        searchButton.click();

        String expectedHeader = "Computers, Tablets & Network Hardware";
        WebElement actualHeader = driver.findElement(By.xpath("//span[@class ='b-pageheader__text']"));

        if(actualHeader.getText().equals(expectedHeader)){
            System.out.println("This is the expected header");
        }else{
            System.out.println("The head is incorrect");
        }


    }

}
