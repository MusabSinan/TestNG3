package Gun05;

import Utils.GenelWebDriver;
import Utils.ParametreliWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class _04_SearchFunctionality2 extends ParametreliWebDriver {

    /*
       Senaryo ;
       1- Siteyi açınız.
       2- mac kelimesini göndererek aratınız.
       3- Çıkan sonuçlarda mac kelimesinin geçtiğini doğrulayınız.
       4- aynı işlemi samsung için de yapınız
     */


    @Test
    @Parameters("aranankelime")
    void search(String mesaj){


        WebElement search= driver.findElement(By.cssSelector("[name='search']"));
        search.sendKeys(mesaj);

        WebElement button= driver.findElement(By.cssSelector("[type='button'][class='btn btn-default btn-lg']"));
        wait.until(ExpectedConditions.elementToBeClickable(button));
        button.click();


        List<WebElement> captions = driver.findElements(By.cssSelector("[class='product-thumb'] [class='caption'] a"));

        for (WebElement e : captions) {
            Assert.assertTrue(e.getText().toLowerCase().contains(mesaj));
        }

    }


}
