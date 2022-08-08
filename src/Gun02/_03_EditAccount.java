package Gun02;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class _03_EditAccount extends GenelWebDriver {

    /*
      1- Siteyi açınız.
      2- Edit Account a tıklatınız.
      3- Yeni isim ve soyisim göndererek Continue yapınız.
      4- İşlem sonucunu kontrol ediniz.
      5- Bu işlemi 2 kez çalıştırarak eski haline getiriniz.
     */


    By namespace=By.id("input-firstname");
    By surnamespace=By.id("input-lastname");

    By cnt=By.cssSelector("[value='Continue']");

    By edit=By.partialLinkText("Edit Account");


    @Test
    void EditAccount(){

        WebElement acc= driver.findElement(edit);
        acc.click();

        WebElement name= driver.findElement(namespace);
        name.clear();
        name.sendKeys("sinan");

        WebElement surname= driver.findElement(surnamespace);
        surname.clear();
        surname.sendKeys("haciboncuk");

        WebElement cntbtn= driver.findElement(cnt);
        cntbtn.click();



        Tools.successMessageValidation();




        WebElement acc1= driver.findElement(edit);
        acc1.click();

        WebElement name1= driver.findElement(namespace);
        name1.clear();
        name1.sendKeys("musab");

        WebElement surname1= driver.findElement(surnamespace);
        surname1.clear();
        surname1.sendKeys("sinan");

        WebElement cntbtn1= driver.findElement(cnt);
        cntbtn1.click();



        Tools.successMessageValidation();

    }

}
