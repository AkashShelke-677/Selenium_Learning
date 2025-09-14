package ex011_Selenium_Ifram_Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.Set;

public class TestProject {

    @Test
    public  void test_interview_vwo_project() throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        String URL = "https://app.vwo.com/#/analyze/heatmap/3/reports?token=eyJhY2NvdW50X2lkIjoxMTM0NTkxLCJleHBlcmltZW50X2lkIjozLCJjcmVhdGVkX29uIjoxNzU2MDA4MDkyLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiZTlmNmY0ZGZlMGJhMGIxNmQxMjZmMGJlOTUyMDQ3MmEiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&accountId=1134591";
        driver.get(URL);
        driver.manage().window().maximize();

        String parentWindowHandle = driver.getWindowHandle();
        System.out.println("Parent ->"+ parentWindowHandle);

        WebElement url_input = driver.findElement(By.name("primaryUrl"));
        url_input.clear(); // removieng the already added text
        url_input.sendKeys("https://thetestingacademy.com");

        WebElement view_heatmap = driver.findElement(By.xpath("//button[text()=\" View Heatmap \"]"));
        view_heatmap.click();

        // apply wait here
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Set<String> allHandles = driver.getWindowHandles();
        System.out.println(allHandles);

        // itrating the windows
        for(String handle: allHandles){
            if (!handle.equals(parentWindowHandle)) {
                driver.switchTo().window(handle);// going into the childe
                driver.switchTo().frame("heatmap-iframe"); //Switching to the Iframe
                Thread.sleep(2000);
                System.out.println(driver.getPageSource()); //  to chck i frame is correct verify

                WebElement  compare_button = driver.findElement(By.xpath("//span[text()='Compare']")); // Locating the button on IFRAME

                Actions action = new Actions(driver); // Using Action class
                action.moveToElement(compare_button); // Navigating to the button usig action class function

                driver.quit();

            }
        }
    }
}
