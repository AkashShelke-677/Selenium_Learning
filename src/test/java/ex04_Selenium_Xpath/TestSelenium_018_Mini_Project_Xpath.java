package ex04_Selenium_Xpath;

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.CommonToAll;

public class TestSelenium_018_Mini_Project_Xpath  extends CommonToAll {
    @Owner("Akash Shelke")
    @Severity(SeverityLevel.BLOCKER)
    @Test

    public  void ORHRM_Login_test (){
        WebDriver driver = new ChromeDriver();

        openBrowser(driver,"https://katalon-demo-cura.herokuapp.com/");

        WebElement makeAppointment = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        makeAppointment.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement input_user = driver.findElement(By.xpath("(//input[@placeholder='Username'])[2]"));
        WebElement input_pass = driver.findElement(By.xpath("(//input[@placeholder='Password'])[2]"));
        WebElement Login_button = driver.findElement(By.xpath("//button[text()='Login']"));

        input_user.sendKeys("John Doe");
        input_pass.sendKeys("ThisIsNotAPassword");
        Login_button.click();





       // button.click();




        System.out.println(driver.getTitle());
        //WebElement Verify_1 = driver.findElement(By.xpath());


    }
}
