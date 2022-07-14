package HomeWork.Class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TC1Facebook {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        Thread.sleep(1000);

        WebElement popUp = driver.findElement(By.xpath("//button[text()='Allow essential and optional cookies']"));
        popUp.click();

        WebElement createNewAccountButton = driver.findElement(By.xpath("//a[text()='Create New Account']"));
        createNewAccountButton.click();         Thread.sleep(1000);

        WebElement dobDay = driver.findElement(By.cssSelector("select[aria-label='Day']"));
        Select selectDay = new Select(dobDay);

        int sizeOfDays =selectDay.getOptions().size();
        System.out.println("There are "+sizeOfDays+" options for days");

        WebElement dobMonth = driver.findElement(By.id("month"));
        Select selectMonth = new Select(dobMonth);
        int sizeOfMonths =  selectMonth.getOptions().size();
        System.out.println("There are "+sizeOfMonths+ " options for months");

        WebElement dobYear = driver.findElement(By.id("year"));
        Select selectYear = new Select(dobYear);
        int sizeOfYears =  selectYear.getOptions().size();
        System.out.println("There are "+sizeOfYears+ " options for years");

        WebElement day = driver.findElement(By.id("day"));
        selectDay.selectByValue("8");

        WebElement month = driver.findElement(By.id("month"));
        selectMonth.selectByVisibleText("May");

        WebElement year = driver.findElement(By.id("year"));
        selectYear.selectByValue("1995");



    }
}
