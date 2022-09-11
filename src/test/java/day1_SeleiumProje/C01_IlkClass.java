package day1_SeleiumProje;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) {
        /*
        En ilkel haliyle bir otomasyon yapmak icin Class'imiza otomasyon icin
        gerekli olan webdriver'in yerine gostermemiz gerekir bunun icin Java
        kutuphanesinden System.setProperty() methodu kullaniriz.
        Ilk kullanacagimiz driver :  webdriver.chrome.driver
        ikincisi ise bu driverin fiziksel yolu :
         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com"); // gitmek istedigimiz internet adresini bu sekilde yaziyoruz
       // driver.get("https://www.facebook.com");
        driver.close();

    }


}
