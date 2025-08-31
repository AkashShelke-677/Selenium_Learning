package ex03_Selenium_Locators;

import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.CommonToAll;

public class TestSlenium017_Mini_Project02_TagName extends CommonToAll {

    @Owner("Akash Shelke")
    @Severity(SeverityLevel.BLOCKER)
    @TmsLink("https://bugz.atlassian.net/browse/BUG-17")
    @Description("Verify that the error message comes with invalid email on signup page.")
    @Test
    public void vwo_free_trail_error_verify() {

        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        //driver.get("https://app.vwo.com");
        // Instead of mentioning here Open browser code created function in CommontoAll class in Utils and fetching here
        openBrowser(driver, "https://app.vwo.com");

        WebElement a_tag_partial_match = findElementByPartialText(driver, "trial"); // Created the function in Utils and fetching here
        a_tag_partial_match.click();

        System.out.println(driver.getCurrentUrl());
        //Assert.assertTrue(driver.getCurrentUrl().contains("free-trail"));

        WebElement email = driver.findElement(By.id("page-v1-step1-email"));
        email.sendKeys("admin@");

        WebElement checkbox = driver.findElement(By.name("gdpr_consent_checkbox"));
        checkbox.click();

        WebElement button = driver.findElement(By.tagName("button")); //Should not use Tagname it is worst practice
        button.click();


//        <div class="C(--color-red) Fz(--font-size-12) Trsp(--Op) Trsdu(0.15s) Op(0) invalid-input+Op(1) invalid-reason">
//                The email address you entered is incorrect.</div>
        //By Using class we are finding the element for error message
        WebElement error_msg = driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(error_msg.getText(), "The email address you entered is incorrect.");

      // Created the Util package and inside that kept the Common to all class inside this class mentioned the close browser here we are ffetching it
        closeBrowser(driver);

    }
}
