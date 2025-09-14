package ex013_Selenium_JS_Executer_Shallow_DOM;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utils.CommonToAll;

public class lab_JS_Executer_Shallow_DOM extends CommonToAll {


    @Test
    public  void JS_Shollow_DOM (){

        WebDriver driver =new ChromeDriver();
        String URL = "https://selectorshub.com/xpath-practice-page/";
        driver.get(URL);
        driver.manage().window().maximize();


        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement piza_name = (WebElement) js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector('div#app2').shadowRoot.querySelector('div#pizza');");

        piza_name.sendKeys("Corn pasta chees pizza");

        closeBrowser(driver);

    }
}
