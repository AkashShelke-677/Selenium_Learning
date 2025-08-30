package ex02_Selenium_Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium_Close_VS_Quite {
    public static void  main(String [] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        driver.get("https://www.facebook.com");

        // Wait
        try{
            Thread.sleep(5000);  // Code will wait for 5 Sec
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        driver.close();// Close only current tab


        driver.quit(); // close all tabs and session


    }
}
