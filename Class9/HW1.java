package HomeWork.Class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW1 {
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement username = driver.findElement(By.cssSelector("*#txtUsername"));
        WebElement password = driver.findElement(By.cssSelector("*#txtPassword"));

        username.sendKeys("Admin");
        password.sendKeys("Hum@nhrm123");

        WebElement loginButton = driver.findElement(By.cssSelector("*#btnLogin"));
        loginButton.click();

        WebElement pimButton = driver.findElement(By.id("menu_pim_viewPimModule"));
        pimButton.click();

        WebElement addEmployeeButton = driver.findElement(By.id("menu_pim_addEmployee"));
        addEmployeeButton.click();

        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("Asghar");

        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("Ha");

        WebElement saveButton = driver.findElement(By.id("btnSave"));
        saveButton.click();

        WebElement idNumber = driver.findElement(By.id("personal_txtEmployeeId"));
        String employeeIdNumber = idNumber.getAttribute("Value");

        WebElement employeeListButton = driver.findElement(By.linkText("Employee List"));
        employeeListButton.click();


        boolean employeeNotFound = true;

        while (employeeNotFound) {

            List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id = 'resultTable']/tbody/tr"));

            for (int a = 0; a < tableRows.size(); a++) {

                WebElement nextButton = driver.findElement(By.linkText("Next"));
                String rowText = tableRows.get(a).getText();
                System.out.println(rowText);
                if (rowText.contains(employeeIdNumber)) {
                    employeeNotFound = false;
                    WebElement checkBoxes = driver.findElement(By.xpath("//table[@id = 'resultTable']/tbody/tr[" + a + "]/td[1]"));
                    checkBoxes.click();
                    WebElement deleteButton = driver.findElement(By.id("btnDelete"));
                    deleteButton.click();
                    WebElement okButton = driver.findElement(By.id("dialogDeleteBtn"));
                    okButton.click();
                    break;
                }
            }
            if (employeeNotFound) {
                WebElement nextButton = driver.findElement(By.linkText("Next"));
                nextButton.click();
            }
        }


    }}
