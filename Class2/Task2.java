package HomeWork.Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2 {

    /*
        navigate to fb.com
        click on create new account
        fill up all the textboxes
        click on sign up button
        close the pop up
        close the browser
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver fb = new ChromeDriver();

        fb.get("https://www.facebook.com/");
        Thread.sleep(5000);
        fb.findElement(By.linkText("Create New Account")).click();
        Thread.sleep(2000);
        fb.findElement(By.name("firstname")).sendKeys("Emre");
        fb.findElement(By.name("lastname")).sendKeys("Akbayrak");
        fb.findElement(By.name("reg_email__")).sendKeys("0750602448");
        fb.findElement(By.id("password_step_input")).sendKeys("IL0veJ@v@");
        WebElement day = fb.findElement(By.name("birthday_day"));
        WebElement month = fb.findElement(By.id("month"));
        WebElement year = fb.findElement(By.id("year"));

        Select select = new Select(day);
        Select selectMonth = new Select(month);
        Select selectYear = new Select(year);

        select.selectByValue("8");
        selectMonth.selectByValue("5");
        selectYear.selectByValue("1994");

        fb.findElement(By.cssSelector("input._8esa[value='2']")).click();
        Thread.sleep(4000);
        fb.findElement(By.xpath("//button[text()='Sign Up']")).click();


        fb.findElement(By.cssSelector("img[src='https://static.xx.fbcdn.net/rsrc.php/v3/y2/r/__geKiQnSG-.png']")).click();
        Thread.sleep(4000);

        fb.quit();
    }



}
