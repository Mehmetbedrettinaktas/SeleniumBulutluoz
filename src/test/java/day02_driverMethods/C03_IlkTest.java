package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_IlkTest {
    public static void main(String[] args) {
        /*
        1- https://www.amazon.com url'ine gidin
        2- basligin Amazon kelimesini incerdigini test edin
        3- url'in "https://www.amazon.com" 'a esit oldugunu test edin
        4- sayfayi kapatin
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        // 1- https://www.amazon.com url'ine gidin
        driver.get("https://www.amazon.com");

        //  2- basligin Amazon kelimesini incerdigini test edin
        String actualTitle=  driver.getTitle();
        String ararnanKelime="Amazon";
        if (actualTitle.contains(ararnanKelime)){
            System.out.println("Title testi PASSED");
        }else System.out.println("Title "+ ararnanKelime+" 'yi icermiyor, title testi FAILEd");
        // Title testi PASSED

        //  3- url'in "https://www.amazon.com" 'a esit oldugunu test edin
        String actualUrl= driver.getCurrentUrl();
        String expectedUrl="https://www.amazon.com";
        if (actualUrl.equals(expectedUrl)){
            System.out.println("Url testi PASSED");
        }else System.out.println("actusl Url :"+actualUrl+" beklenen URL'den farkli, test FAILED");
        // actusl Url :https://www.amazon.com/ beklenen URL'den farkli, test FAILED
        //  4- sayfayi kapatin
        driver.close();

    }
}
