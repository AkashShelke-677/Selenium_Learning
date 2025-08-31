package ex02_Selenium_Basic;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestSelenium08_Assertion_TestNG {

    @Description("Verify that the Title is visible. ") // Allure report annotation
    @Test


    public static void main(String [] args){

        WebDriver driver = new FirefoxDriver( );
        driver.get("https://www.google.com");

        //Test Assertion
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com");

        //AssertJ
        assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://www.google.com");
        driver.close();


    }
}
