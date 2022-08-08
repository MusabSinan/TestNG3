package Gun03;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class _02_AddressFunctionality extends GenelWebDriver {

    //1-siteyi açınız
    //2-addres ekleyiniz

    //3- En son eklenen adresi edit yaparak ad ve soyadı değiştirip kaydediniz.
    //       4- En son eklenen adresi siliniz.

    @Test
    void createAddress(){


        WebElement adresbook= driver.findElement(By.linkText("Address Book"));
        adresbook.click();

        WebElement newadres= driver.findElement(By.linkText("New Address"));
        newadres.click();

        WebElement firstname=driver.findElement(By.cssSelector("[id='input-firstname']"));
        firstname.sendKeys("sinan");

        WebElement lastname=driver.findElement(By.cssSelector("[id='input-lastname']"));
        lastname.sendKeys("haciboncuk");

        WebElement company=driver.findElement(By.cssSelector("[id='input-company']"));
        company.sendKeys("Boncuk A.Ş.");

        WebElement adres1=driver.findElement(By.cssSelector("[id='input-address-1']"));
        adres1.sendKeys("hacıbaba mahallesi dızolar caddesi");


        WebElement adres2=driver.findElement(By.cssSelector("[id='input-address-2']"));
        adres2.sendKeys("pıçağı atarlar sokak no:31");


        WebElement city=driver.findElement(By.cssSelector("[id='input-city']"));
        city.sendKeys("gaziantep");

        WebElement postcode=driver.findElement(By.cssSelector("[id='input-postcode']"));
        postcode.sendKeys("27000");


        WebElement cntry=driver.findElement(By.cssSelector("[id='input-country']"));
        Select slctcntry=new Select(cntry);
        slctcntry.selectByValue("215");

        wait.until(ExpectedConditions.elementToBeClickable(cntry));

        WebElement state=driver.findElement(By.cssSelector("[id='input-zone']"));
        Select slctstate=new Select(state);
        slctstate.selectByValue("3347");

        //wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.cssSelector("select[id='input-zone']>option"))))
        // bu elemanın bayatlamış hali gidene kadar bekle


        WebElement defadres=driver.findElement(By.cssSelector("label [name='default'][value='0']"));
        defadres.click();                                  //default olarak seçmedim sonra silebileyim diye

        WebElement cnt=driver.findElement(By.cssSelector("[type='submit']"));
        cnt.click();


        Tools.successMessageValidation();


    }

    @Test(dependsOnMethods = {"createAddress"})
    void editAddress(){



        WebElement adresbook= driver.findElement(By.linkText("Address Book"));
        adresbook.click();

        List<WebElement> editAll=driver.findElements(By.linkText("Edit"));
        WebElement sonEdit=editAll.get(editAll.size()-1);  // sonuncu edit liinktextt li eleman
        sonEdit.click();


        WebElement firstname=driver.findElement(By.cssSelector("[id='input-firstname']"));
        firstname.clear();
        firstname.sendKeys("sinan");

        WebElement lastname=driver.findElement(By.cssSelector("[id='input-lastname']"));
        lastname.clear();
        lastname.sendKeys("haciboncuk");


        WebElement cnt=driver.findElement(By.cssSelector("[type='submit']"));
        cnt.click();


        Tools.successMessageValidation();

    }

    @Test(dependsOnMethods = {"editAddress"})
    void deleteAddress(){

        WebElement adresbook= driver.findElement(By.linkText("Address Book"));
        adresbook.click();

        List<WebElement> deleteAll=driver.findElements(By.linkText("Delete"));
        WebElement sonDelete=deleteAll.get(deleteAll.size()-1);  // sonuncu edit linktext li eleman
        sonDelete.click();



    }

}
