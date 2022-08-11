package Gun07;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_PlaceOrder extends GenelWebDriver {
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

        driver.manage().window().maximize();

        WebElement search = driver.findElement(By.cssSelector("[name='search']"));
        search.sendKeys("ipod");

        WebElement button = driver.findElement(By.cssSelector("[type='button'][class='btn btn-default btn-lg']"));
        wait.until(ExpectedConditions.elementToBeClickable(button));
        button.click();

        WebElement ipod= driver.findElement(By.linkText("iPod Classic"));
        wait.until(ExpectedConditions.elementToBeClickable(ipod));
        ipod.click();

        WebElement cart=driver.findElement(By.id("button-cart"));
        cart.click();

        WebElement checkoutbutton= driver.findElement(By.xpath("(//*[@class='hidden-xs hidden-sm hidden-md'])[6]"));
        checkoutbutton.click();


        WebElement cnt1=driver.findElement(By.id("button-payment-address"));
        wait.until(ExpectedConditions.elementToBeClickable(cnt1));
        cnt1.click();

        WebElement cnt2=driver.findElement(By.id("button-shipping-address"));
        wait.until(ExpectedConditions.elementToBeClickable(cnt2));
        cnt2.click();

        WebElement cnt3=driver.findElement(By.id("button-shipping-method"));
        wait.until(ExpectedConditions.elementToBeClickable(cnt3));
        cnt3.click();

        WebElement terms= driver.findElement(By.cssSelector("[name='agree']"));
        wait.until(ExpectedConditions.elementToBeClickable(terms));
        terms.click();

        WebElement cnt4= driver.findElement(By.id("button-payment-method"));
        cnt4.click();

        WebElement confirm= driver.findElement(By.id("button-confirm"));
        wait.until(ExpectedConditions.elementToBeClickable(confirm));
        confirm.click();

        wait.until(ExpectedConditions.urlContains("success"));


        WebElement h1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id=\"content\"]>h1")));

        Assert.assertEquals(h1.getText(),"Your order has been placed!","Karşılaştırma Sonucu : ");

    }
}
