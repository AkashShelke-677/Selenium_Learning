package ex011_Selenium_Ifram_Window;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v137.audits.model.SRIMessageSignatureError;
import org.testng.annotations.Test;
import utils.CommonToAll;

import java.util.Set;

public class lab_0_Windows_Part1 extends CommonToAll {

    @Test
    public  void test_windows(){

        WebDriver driver =new ChromeDriver();
        String URL = "https://the-internet.herokuapp.com/windows";
        driver.get(URL);

        String parent_id = driver.getWindowHandle(); // Single window Handel
        System.out.println(parent_id);  // It will give the Tab ID ex- "7992CE88E29BA901C913E1C8B0AAAEFB"

       WebElement link_parent =  driver.findElement(By.xpath("//a[text()='Click Here']"));
       link_parent.click(); // after clicking it will open new window


        Set<String> windows_handles_ids = driver.getWindowHandles(); // using list bcoz we dont want duplicate tab id
        System.out.println(windows_handles_ids);

        // How do I switch to the child window and
        //Verify that the text with the name of new window

        for (String windw: windows_handles_ids){
            driver.switchTo().window(windw);  // Switching the Window
            if (driver.getPageSource().contains("New Window")) // verify the text present on window
            {
                System.out.println("Test Case is Passed ");
            }
        }

        driver.switchTo().window(parent_id);// it will take back to the parent class

        closeBrowser(driver);


    }
}
