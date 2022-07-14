package HomeWork.Class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        Thread.sleep(1000);

        WebElement popUp = driver.findElement(By.xpath("//button[text()='Allow essential and optional cookies']"));
        popUp.click();

        WebElement createNewAccountButton = driver.findElement(By.xpath("//a[text()='Create New Account']"));
        createNewAccountButton.click();         Thread.sleep(1000);

        WebElement firstNameBox = driver.findElement(By.cssSelector("input[name ^='f']"));
        firstNameBox.sendKeys("Emre");

        WebElement surnameBox = driver.findElement(By.cssSelector("input[name ^='last']"));
        surnameBox.sendKeys("Ak");

        WebElement mobileNumber = driver.findElement(By.xpath("//input[@name='reg_email__']"));
        mobileNumber.sendKeys("0155225423365");

        WebElement passwordBox = driver.findElement(By.cssSelector("input#password_step_input"));
        passwordBox.sendKeys("dlffed5f41ef");

        WebElement day = driver.findElement(By.id("day"));
        Select selectDay = new Select(day);
        selectDay.selectByValue("8");

        WebElement month = driver.findElement(By.id("month"));
        Select selectMonth = new Select(month);
        selectMonth.selectByVisibleText("May");

        WebElement year = driver.findElement(By.id("year"));
        Select selectYear = new Select(year);
        selectYear.selectByValue("1995");

        WebElement sexGender = driver.findElement(By.xpath("//input[@value='2']"));
        sexGender.click();

    }
}
