package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElementMethodlari {
    /*
    1- amazon.com adresine gidip arama kutusunu locate edin
    2- arama kutusunun tagname'nin input oldugunu test edin
    3- arama kutusunun name attribute'nun degerinin field-keywords oldugunu test edin
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1- amazon.com adresine gidip arama kutusunu locate edin
        driver.get("https://www.amazon.com");
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        // 2- arama kutusunun tagname'nin input oldugunu test edin
       String expectedTagName="input";
       String actualTagName= aramaKutusu.getTagName();
       if (expectedTagName.equals(actualTagName)){
           System.out.println("Tagename testi PASSED");
       }else System.out.println("Tagename testi FAILED");
        // 3- arama kutusunun name attribute'nun degerinin field-keywords oldugunu test edin
        String expectedNameDegeri= "field-keywords";
        String actualNameDegeri=aramaKutusu.getAttribute("name");
        if (expectedTagName.equals(expectedNameDegeri)){
            System.out.println("Name testi PASSED");
        }else System.out.println("Name testi FAILED");
        System.out.println(" konum = " + aramaKutusu.getLocation());
        System.out.println("webelentin yuksekligi" +aramaKutusu.getSize().height);
        driver.close();
        // webElementinIsmi.getTagName() --> daha once locate ettigimiz bir webElementin tagname'ni dondurur
        // webElementinIsmi.getAttribute(attributeIsmi) --> daha once locate ettigimiz bir webelentin
        // istedigim attribute'unun degerini dondurur
    }
}
