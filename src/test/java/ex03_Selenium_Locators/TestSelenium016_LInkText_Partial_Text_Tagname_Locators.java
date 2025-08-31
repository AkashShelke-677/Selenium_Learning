package ex03_Selenium_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestSelenium016_LInkText_Partial_Text_Tagname_Locators {

    @Description("Verify VWO ")
    @Owner("Akash Shelke")
    @Test
    public void test_vwo_login() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com");


        // <a
        // href="https://vwo.com/free-trial/?utm_medium=website&amp;utm_source=login-page&amp;utm_campaign=mof_eg_loginpage"
        // class="text-link"
        // data-qa="bericafeqo">
        // Start a free trial
        //
        //</a>

        // className yES -> But look kind of, you can say, most unique.

        // Scenario 1- Link Text - Full Text Match
        WebElement a_Tag_free_trail_full_match = driver.findElement(By.linkText("Start a free trial"));
        a_Tag_free_trail_full_match.click();

        // If the element locator is invalid - no such element: Unable to locate element: {"method":"link text","selector":"Start a free tria"}
        // Scenario 2 - Partial match text
        // Start a free trial
        // Start a free
        // Start a
        // Start , Trail, free, a, Star...
        // WebElement a_tag_partial_match = driver.findElement(By.partialLinkText("trial"));
        //  a_tag_partial_match.click();


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();


    }
}