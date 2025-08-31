package ex02_Selenium_Basic;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_ProjectNo_1 {

    @Description("Verify that a particular text exist on the katalon website")
    @Test
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        // We used Hard Assertion
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"CURA Healthcare Service");

        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/");

        System.out.println(driver.getPageSource());
        if(driver.getPageSource().contains("CURA Healthcare Service")){
            Assert.assertTrue(true);
            System.out.println("Test Case Passed ");
        }else {
            Assert.fail();
            System.out.println("Test Case Failed ");
        }

        driver.quit();

    }
}
