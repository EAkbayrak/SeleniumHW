package HomeWork.Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver chrome = new ChromeDriver();

        /*
        navigate to
        https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        fill out the form
        click on register
        close the browser
         */

        chrome.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        chrome.findElement(By.id("customer.firstName")).sendKeys("Emre");
        chrome.findElement(By.id("customer.lastName")).sendKeys("Akbayrak");
        chrome.findElement(By.id("customer.address.street")).sendKeys("Washington street");
        chrome.findElement(By.id("customer.address.city")).sendKeys("Washington DC");
        chrome.findElement(By.id("customer.address.state")).sendKeys("District of Columbia");
        chrome.findElement(By.id("customer.address.zipCode")).sendKeys("20001");
        chrome.findElement(By.id("customer.phoneNumber")).sendKeys("0750606540");
        chrome.findElement(By.id("customer.ssn")).sendKeys("5526");
        chrome.findElement(By.id("customer.username")).sendKeys("EAkbayrak");
        chrome.findElement(By.id("customer.password")).sendKeys("Password123");
        chrome.findElement(By.id("repeatedPassword")).sendKeys("Password123");
        chrome.findElement(By.className("button")).click();
        chrome.quit();


    }
}
