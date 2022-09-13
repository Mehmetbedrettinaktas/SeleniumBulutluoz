package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazona gidip Nuttela aratalim
        driver.get("https://www.amazon.com");
        // findElement(By ...locator) --> istedigimiz web elementini bize dondurur
        // biz de o web elementini kullanmak icin bir objeye assing ederiz

       // WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox")); // Arama cubugunu Locator ettik yani yerini bulduk
        WebElement aramaKutusu= driver.findElement(By.name("field-keywords"));
        // herhangi bir webelementine istedigimiz yaziyi yollamak istersek

        /*
        WebElement aramaKutusu= driver.findElement(By.className("nav-search-field"));
        Bu locator calismadi
        Locator alirken gozumuzden kacan detaylar olabilir aldigimiz bir Locator calismazsa
        alternatif locator'lar denemeliyiz
         */

        /*
        <div class="nav-search-field ">
        <input type="text" id="twotabsearchtextbox" value="" name="field-keywords"
        autocomplete="off" placeholder="" class="nav-input nav-progressive-attribute"
        dir="auto" tabindex="0" aria-label="Search">
      </div>
         */
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        driver.close();


    }
}
