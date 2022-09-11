package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_manageMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        /*
        illeride wait konusunu daha genis olarak ele alacagiz
        Bir safa acilirken, ilk basta sayfanin icerisinde bulunan elementlere gore
        bir yukleme suresine ihtiyac vardir.
         */
    }
}
