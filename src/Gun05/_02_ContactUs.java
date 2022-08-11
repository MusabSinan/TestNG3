package Gun05;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _02_ContactUs extends GenelWebDriver {

/*
  1- ContactUs a tıklayınız
  2- Mesaj kutusuna en az 10 karakterlik bir mesaj yazınız.
  3- Submit ettikten sonra Contact US yazısını doğrulayınız.
 */


    @Test
    @Parameters("mesaj")//burası parameters methodunun isminin verldiği yer
    void  contactUs(String gelenmesaj){


        driver.manage().window().maximize(); //buradaa sayfanın boyutu tam ekran yaptık butona
            //erişebilmek için yoksa çalışmıyordu sayfada bir elementin altında kalıyordu
        WebElement contactus= driver.findElement(By.linkText("Contact Us"));
        contactus.click();

        WebElement enquiry= driver.findElement(By.id("input-enquiry"));
        enquiry.sendKeys(gelenmesaj);

        WebElement submit= driver.findElement(By.cssSelector("[value='Submit']"));
        wait.until(ExpectedConditions.elementToBeClickable(submit));
        submit.click();

        WebElement contactUslabel = driver.findElement(By.cssSelector("[id='content']>h1"));
        System.out.println(contactUslabel.getText());

        Assert.assertEquals("Contact Us",contactUslabel.getText(),"Karşılaştırma sonucu : ");

    }



}
