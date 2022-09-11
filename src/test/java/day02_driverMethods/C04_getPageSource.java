package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_getPageSource {
    public static void main(String[] args) {
        // amazon sitesinde  gidip kaynak kodlarinda "Geteway" yazdigini test edin
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com"); // amazon sayfasinda strg + u kaynak codlari bize verir
       String sayfaKaynakKodlari= driver.getPageSource();
        String arananKelime="Gateway";
        if (sayfaKaynakKodlari.contains(arananKelime)){
            System.out.println("Kaynak kodu testi PASSED");
        } else System.out.println("Kaynak Kodlarinda "+ arananKelime +" yok, test FAILED");
        driver.close();
    }
}