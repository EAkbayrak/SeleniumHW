package HomeWork.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonMethods {

    public static WebDriver driver = new ChromeDriver();
    public static void open (String url){

        driver.get(url);
    }
    public static void quit (){
        driver.quit();
    }


}
