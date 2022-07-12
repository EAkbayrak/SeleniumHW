package HomeWork.Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        /*
        HRMS Application Negative Login:
        Open chrome browser
        Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
        Enter valid username
        Leave password field empty
        Click on login button
        Verify error message with text "Password cannot be empty" is displayed.
         */

       driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
       WebElement usernameText = driver.findElement(By.cssSelector("input#txtUsername"));
       usernameText.sendKeys("EAkbayrak");

       WebElement loginButton = driver.findElement(By.cssSelector("input#btnLogin"));
       loginButton.click();

       String expectedErrorMessage="Password cannot be empty";

       WebElement errorMessage = driver.findElement(By.xpath("//span[text() = 'Password cannot be empty']"));

       if(errorMessage.getText().equals(expectedErrorMessage))
           System.out.println("Error message is accurate and is " + errorMessage.isDisplayed());

    }
}
