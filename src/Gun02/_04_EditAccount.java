package Gun02;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _04_EditAccount extends GenelWebDriver {



                //BU ÇÖZÜM İSMET HOCANIN ÇÖZÜMÜ BİR ÖNCEKİ CLASSIN BİR BAŞKA ÇÖZÜLME ŞEKLİ METOD OLARAK



    @Test
    void EditAccount()
    {
        editAccount("Ahmet","Demir");
        Tools.Bekle(2);
        editAccount("ismet", "temur");
    }

    void editAccount(String ad, String soyad)
    {
        WebElement edit=driver.findElement(By.linkText("Edit Account"));
        edit.click();

        WebElement firstName= driver.findElement(By.id("input-firstname"));
        firstName.clear();
        firstName.sendKeys(ad);

        WebElement lastname= driver.findElement(By.id("input-lastname"));
        lastname.clear();
        lastname.sendKeys(soyad);

        WebElement cntBtn=driver.findElement(By.cssSelector("input[value='Continue']"));
        cntBtn.click();

        Tools.successMessageValidation();
    }
}
