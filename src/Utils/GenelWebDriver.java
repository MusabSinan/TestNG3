package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GenelWebDriver {

    public static WebDriver driver;
    public  static WebDriverWait wait;

    @BeforeClass
   public void Baslangicİslemleri(){
        System.out.println("driver start..");
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");//burada drivers olacak path(yol) olarak intellijde dosya adı öylr ondan
        driver=new ChromeDriver();
         //driver.manage().window().maximize();//sayfa boyutunu büyütür
        driver.manage().deleteAllCookies();//sayfadaki cookileri temizler tekrar// bağlanbilmek için yoksa site engelleyebilir


        wait=new WebDriverWait(driver, Duration.ofSeconds(30));

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); //sadece ana sayfa yüklenirken en başta süre bitincce hata verir eğer yüklenmezse
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//bütün webElement için geçerrli

        driver.get("http://opencart.abstracta.us/index.php?route=account/login ");

        LoginTest();
    }



    void LoginTest(){

        WebElement inptmail= driver.findElement(By.id("input-email"));
        inptmail.sendKeys("sinanhacibon@hotmail.com");

        WebElement psswrod= driver.findElement(By.id("input-password"));
        psswrod.sendKeys("123456789");

        WebElement lgnbtn=driver.findElement(By.cssSelector("input[value='Login']"));
        lgnbtn.click();

    }


    @AfterClass
   public void Bitisİslemleri(){
        System.out.println("driver stop..");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }




}
