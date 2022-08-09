package Gun06;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class _06_Task3 extends GenelWebDriver {

    /*
   Senaryo
   1- Siteye gidiniz
   2- Specials tiklayiniz
   3- Cikan urun sayisi ile indirimli urun sayisi ayni mi dogrulayiniz
   4- Yukarıdaki işlemden sonra her ürünün önceki fiyatının şu andaki fiyattan
      yüksek olduğunu doğrulayınız.
*/


    @Test
    void specials(){

        WebElement spc= driver.findElement(By.linkText("Specials"));
        spc.click();


        List<WebElement> products = driver.findElements(By.cssSelector("[class='caption'] a"));
        List<WebElement> oldPrices = driver.findElements(By.cssSelector("[class='price'] span[class='price-old']"));

        Assert.assertEquals(products.size(),oldPrices.size());


        /*** Eksi fiyat yeni fiyat karşılaştırması *****/
        List<WebElement> newPriceList=driver.findElements(By.cssSelector("span[class='price-new']")); // yeni fiyatlar

        for(int i=0;i< newPriceList.size() ; i++)
            Assert.assertTrue(Tools.WebElementToDouble(newPriceList.get(i)) <
                    Tools.WebElementToDouble(oldPrices.get(i))  );




    }
}
