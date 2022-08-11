package Gun08;

import Gun07._03_PlaceOrderElements;
import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _01_WishList extends GenelWebDriver {

    /*
    Senaryo ;
    1- Siteye gidiniz..
   2- "ipod" ürününü aratınız."ipod" u xml den gönderiniz
   3- çıkan elamnlardan random bir elelamnı Add Wish butonuna tıklayınız.
   4- Daha sonra WishList e tıklatınız
   5- Burada çıkan ürünle tıklanan ürünün isminin aynı olup olmadığını doğrulayınız.
 */

    @Test
    @Parameters("ipod")
    void wishList(String gelenmesaj){


       Gun07._03_PlaceOrderElements poe=new _03_PlaceOrderElements(driver);

        poe.search.sendKeys(gelenmesaj);
        poe.button.click();

       _02_WishListElements elements=new _02_WishListElements(driver);

       int rndnmbr= Tools.RandomGenerator(elements.searchResults.size());
       String rndurunAd=elements.searchResults.get(rndnmbr).getText();
       elements.addWish.get(rndnmbr).click();

       elements.btnwish.click();


       boolean bulundu=false;
       for (WebElement e: elements.tablenames){
           if (e.getText().equals(rndurunAd)){

               bulundu=true;
               break;
           }

       }

        Assert.assertTrue(bulundu);

    }


}
