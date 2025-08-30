package ex02_Selenium_Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium11_OptionClasses {

//    Options Classes
//            Every browser have option class it helps you to give option to start browser in perticular options like incognito mode,
//            customize or configure browser behavior during test  (Headless mode(without UI), Add extension, Guest mode )
//    1. ChromeOptions 2 .EdgeOptions 3. FirefoxOptions

    public static void main(String[] args) {
        ChromeOptions chromeOption = new ChromeOptions();
        chromeOption.addArguments("--headless");  // No UI will visible,  it is used to run more test case 5000, which i dont want to see
        chromeOption.addArguments("--incognito"); // open browser in incognito mode

        WebDriver driver = new ChromeDriver(chromeOption); //  here need to mention in argument to use option class
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
    }

}
