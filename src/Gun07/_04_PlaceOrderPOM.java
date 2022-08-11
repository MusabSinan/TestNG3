package Gun07;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _04_PlaceOrderPOM extends GenelWebDriver {

     /*
   Senaryo :
   1- Siteyi açınız.
   2- Sitede "ipod" kelimesini aratınız
   3- Çıkan sonuçlardan ilkini sepete atınız.
   4- Shopping Chart a tıklatınız.
   5- Checkout yapınız.
   6- Continue butonalarına tıklatıp bilgileri giriniz.
   7- En confirm ile siparişi verdiğinizi doğrulayınız.
      doğrulamayı çıkan sayfadaki "Your order has been placed" yazısı ile yapınız.
*/

    @Test
    void ProceedToCheckout(){

        _03_PlaceOrderElements elements=new _03_PlaceOrderElements(driver);

        driver.manage().window().maximize();


        elements.search.sendKeys("ipod");
        elements.button.click();
        elements.ipod.click();
        elements.cart.click();
        elements.checkoutbutton.click();


        wait.until(ExpectedConditions.elementToBeClickable(elements.cnt1)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.cnt2)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.cnt3)).click();
        elements.terms.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.cnt4)).click();
        elements.confirm.click();

        wait.until(ExpectedConditions.urlContains("success"));
        Assert.assertEquals(elements.confirmTxt.getText(),"Your order has been placed!","Karşılaştırma Sonucu : ");

    }
}
