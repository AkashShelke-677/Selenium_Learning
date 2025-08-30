package ex02_Selenium_Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium10_Navigation_get_navigation {

    public static void  main(String [] args){

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");  // get will take only string

        driver.navigate().to("https://www.wingmusic.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();


        // **navigate command is navigation Interface , navigate it will take string and URL **
        // Both commands are same but navigate have more capabilities
        // .get() >> No Option to go back, forward, refresh
        // navigate().to() >> Option have back forword and refresh
    }



}
