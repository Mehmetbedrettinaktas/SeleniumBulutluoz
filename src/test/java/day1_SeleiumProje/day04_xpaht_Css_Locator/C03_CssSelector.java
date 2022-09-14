package day1_SeleiumProje.day04_xpaht_Css_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_CssSelector {
    public static void main(String[] args) {
        /*
        1 ) Bir class oluşturun : Locators_css
        2 ) Main method oluşturun ve aşağıdaki görevi tamamlayın.
        a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        b. Locate email textbox
        c. Locate password textbox ve
        d. Locate signin button
        e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        i. Username : testtechproed@gmail.com
        ii. Password : Test1234!
        NOT: cssSelector kullanarak elementleri locate ediniz

         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");
        // b. Locate email textbox
        WebElement mailTexBox=driver.findElement(By.cssSelector("#session_email"));
        // c. Locate password textbox ve
        WebElement passwordtexBox= driver.findElement(By.cssSelector("#session_password"));
        // d. Locate signin button
        WebElement signinButonu= driver.findElement(By.cssSelector("input[value='Sign in']"));
        // e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        // i. Username : testtechproed@gmail.com
        // ii. Password : Test1234!
        mailTexBox.sendKeys("testtechproed@gmail.com");
        passwordtexBox.sendKeys("Test1234!");
        signinButonu.click();
        driver.close();
    }
}
