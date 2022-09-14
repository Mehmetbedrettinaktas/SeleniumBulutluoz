package day1_SeleiumProje.day04_xpaht_Css_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_AmazonSearchTest {
    public static void main(String[] args) {
        /*
        1. Bir class oluşturun : AmazonSearchTest
        2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        a.web sayfasına gidin. https://www.amazon.com/
        b. Search(ara) “city bike”
        c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        d. Sonra karşınıza çıkan ilk sonucun resmine tıklayın
         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //a. amazon web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        // b. Search(ara) “city bike”
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike", Keys.ENTER);

        // c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> istenenElementListesi=driver.findElements(By.className("sg-col-inner"));
        WebElement sonucYazisiElenti=istenenElementListesi.get(0);
        System.out.println(sonucYazisiElenti.getText());

        // d. Sonra karşınıza çıkan ilk sonucun resmine tıkla
        List<WebElement> urunResimlistesi =driver.findElements(By.className("s-image"));
        WebElement ilkUrunResmi=urunResimlistesi.get(0);
        ilkUrunResmi.click();

        driver.close();





    }

}
