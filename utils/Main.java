package HomeWork.utils;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        CommonMethods.open("https://www.google.com/");
        CommonMethods.quit();
    }
}
