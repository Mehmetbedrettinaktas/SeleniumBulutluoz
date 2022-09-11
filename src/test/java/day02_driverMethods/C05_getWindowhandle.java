package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_getWindowhandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println(driver.getWindowHandle());
        // CDwindow-62673433B812F2DDAC9E2020DF3FB0AF benzersiz olarak acilan window'a ait hashcode'unu verir
        // her run ettigimizde farkli bir hashcode bize dondurur.
    }
}
