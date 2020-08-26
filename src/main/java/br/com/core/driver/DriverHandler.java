package br.com.core.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverHandler {
    public static WebDriver getDriver()
    {
       // System.setProperty("webdriver.chrome.driver", "C:\\AutomacaoPOC\\src\\test\\resources\\mobile\\chromedriver.exe");
        System.setProperty("webdriver.firefox.bin","C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        //ChromeOptions options = new ChromeOptions();
        //options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
        //WebDriver driver = new ChromeDriver();
        WebDriver driver = new FirefoxDriver();
        return driver;
    }
}
