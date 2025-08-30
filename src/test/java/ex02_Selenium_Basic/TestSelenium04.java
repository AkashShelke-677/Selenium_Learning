package ex02_Selenium_Basic;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestSelenium04 {
    public static void main(String[] args){
        // WebDriver Hierarchy

        // Search context (Is Interface)  have two  functions (findElement and findElements)
        //WebDriver (is Interface) it have 10 functions  (get functions)
        // Remote WebDriver (is Class) which have 15 functions
        //Chromium Driver is also class have 25 functions


       // also we can do
//        SearchContext driver = new EdgeDriver();/
//        SearchContext driver1 = new ChromeDriver();
//        SearchContext driver2 = new FirefoxDriver();
//
//        WebDriver driver = new ChromeDriver(); // run on chrome then edge
//       RemoteWebDriver driver 1 = new ChromeDriver();  // For Multiple browser
//        ChromeDriver driver3 = new ChromeDriver(); //run on Chrome or Edge only one
    }
}
