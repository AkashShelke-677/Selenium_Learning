package ex02_Selenium_Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium012_Interview_Qution {
    public static void  main(String [] args) {

        FirefoxDriver driver = new FirefoxDriver();
        driver.get("google.com");  // Qution This code will it work? Ans>> NO without HTTP
    }
}
