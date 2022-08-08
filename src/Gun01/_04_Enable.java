package Gun01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class _04_Enable {


    @Test
    void test1(){
        System.out.println("test1");
    }


    @Test(enabled = false) //bu metod test2 yi çalıştırmayacak şuan eğer bir testin koşulmasını istemiyorsak bu metodal kapatırız
    void test2(){
        System.out.println("test2");
    }



    @Test
    void test3(){
        System.out.println("test3");
    }


    public static WebDriver driver;
    public  static WebDriverWait wait;

    @BeforeClass
    void Baslangicİslemleri(){
        System.out.println("driver start..");
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");//burada drivers olacak path(yol) olarak intellijde dosya adı öylr ondan
        driver=new ChromeDriver();
        // driver.manage().window().maximize();//sayfa boyutunu büyütür
        driver.manage().deleteAllCookies();//sayfadaki cookileri temizler tekrar// bağlanbilmek için yoksa site engelleyebilir


        wait=new WebDriverWait(driver, Duration.ofSeconds(30));

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); //sadece ana sayfa yüklenirken en başta süre bitincce hata verir eğer yüklenmezse
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//bütün webElement için geçerrli

    }



    @AfterClass
    void Bitisİslemleri(){
        System.out.println("driver stop..");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }


}
