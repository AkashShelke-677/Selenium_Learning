package ex03_Selenium_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium015_Project02_Locator_selenium_ID_Name_ClassName {


    @Description("Verify that with the invalid login error message is website")
    @Owner("Akash Shelke")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void test_vwo_invalid_login() {

        //To maximize the Browser using Option class
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://app.vwo.com/#/login");

        //Maximize the Window
        // driver.manage().window().maximize();


        // Step 1 - Find the EMAIL ID and enter the admin@admin.com.
        // Step 2 - Find the Password  and enter the 1234.
        // Step 3 - Find the Submit  and click on the button.
        // Step 4 - Wait some time.
        // Step 5 - Verify the message error message.



        // Step 1 - Find the EmailID input text Box and Enter the admin@admin.in into the textbox
//        <input type = "email"
//        class="text-input W(100%)"
//        name = "username"
//        id = "login-username"
//        data - qa = "hocewoqisi" >

        WebElement email_input_box = driver.findElement(By.id("login-username"));
        email_input_box.sendKeys("admin@admin.in");

        // Step 2 - Find the Password input text Box and Enter the admin123 into the textbox
//        <<input type="password"
//        class="text-input W(100%)"
//        name="password" id="login-password"
//        data-qa="jobodapuxe">

        WebElement Pass_input_box = driver.findElement(By.name("password"));
        Pass_input_box.sendKeys("admin123");

        //Step 3 - Find  the Submit button and Clickon it.
//        <button type = "submit" id = "js-login-btn"
//        class="btn btn--primary btn--inverted W(100%) H(48px) Fz(16px)"
//        onclick = "login.login(event)"
//        data - qa = "sibequkica" >

        WebElement button_submit = driver.findElement(By.id("js-login-btn"));
        button_submit.click();

       // Step 4 - Wait for Some time
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e.getMessage());
        }

        // Step 5- Verify the Error message
//        <div class="notification-box-description"
//    id="js-notification-box-msg"
//    data-qa="rixawilomi">Your email, password, IP address or location did not match
//        </div>

        WebElement error_message = driver.findElement(By.className("notification-box-description"));
        System.out.println(error_message.getText());

        // Step 6, we have added the TestNG assertion to verify.
        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");




        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        driver.quit();
    }
}
