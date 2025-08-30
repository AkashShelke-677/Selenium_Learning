package ex02_Selenium_Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium07_Selenium_Commands {
    public static void main(String [] args){

        WebDriver driver = new FirefoxDriver();

        // Important commands
        driver.get("https:///google.com"); //Navigate to URL

        driver.manage().window().maximize(); // maximize the browser
      //driver.manage().window().minimize(); // Minimize the browser
        System.out.println(driver.getTitle()); // get current title
        System.out.println(driver.getPageSource()); // get HTML page source
        driver.quit(); //  close all browser


    }
}
