package logintest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class java {

    @Test
    public void setup() {
        System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.flipkart.com");

    }}


