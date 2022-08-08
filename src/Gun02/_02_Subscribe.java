package Gun02;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_Subscribe extends GenelWebDriver {


    /*
  Senaryo
  1- Siteyi açınız.
  2- Newsletter  Subscribe ve UnSubscribe işlemlerini ayrı ayı testlerde yapınız.
   3- Newsletter  üyelik işlemini, üye ise , üyelikten çıkma, değilse ekleme şeklinde yapınız
 */



    By link=By.partialLinkText("Newsletter");

    By yes=By.cssSelector("[value='1']");

    By no=By.cssSelector("[value='0']");

    By cnt=By.cssSelector("[type='submit']");



    @Test(priority = 1)
    void Subscribe(){



        WebElement newsettler= driver.findElement(link);
        newsettler.click();

        WebElement accept= driver.findElement(yes);
        accept.click();

        WebElement cont= driver.findElement(cnt);
        cont.click();

        Tools.successMessageValidation();

    }


    @Test(priority = 2)
    void UnSubscribe(){


        wait.until(ExpectedConditions.elementToBeClickable(link));

        WebElement newsettler= driver.findElement(link);
        newsettler.click();

        WebElement accept= driver.findElement(no);
        accept.click();

        WebElement cont= driver.findElement(cnt);
        cont.click();

       Tools.successMessageValidation();

    }


    @Test(priority = 3)
    void Change(){

        wait.until(ExpectedConditions.elementToBeClickable(link));

        WebElement newsettler= driver.findElement(link);
        newsettler.click();

        WebElement yesRadioButton= driver.findElement(yes);
        WebElement noRadioButton= driver.findElement(no);

        if (yesRadioButton.isSelected())
            noRadioButton.click();

        else
            yesRadioButton.click();




        WebElement cont= driver.findElement(cnt);
        cont.click();

        Tools.successMessageValidation();


    }




}
