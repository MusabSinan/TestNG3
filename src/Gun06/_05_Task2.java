package Gun06;

import Utils.ParametreliWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class _05_Task2 extends ParametreliWebDriver {

/*
 * Bir önceki task da yapılan testi PARAMETERDRIVER ile yapınız
 * sonrasında fakrlı tarayıcılar ile çalıştırınız.
 * sonrasında paralel çalıştırınız.
 */



    @Test(dataProvider = "getData")
    void search(String mesaj){


        WebElement search = driver.findElement(By.cssSelector("[name='search']"));
        search.clear();
        search.sendKeys(mesaj);

        WebElement button = driver.findElement(By.cssSelector("[type='button'][class='btn btn-default btn-lg']"));
        wait.until(ExpectedConditions.elementToBeClickable(button));
        button.click();


        List<WebElement> captions = driver.findElements(By.cssSelector("[class='product-thumb'] [class='caption'] a"));

        for (WebElement e : captions) {
            Assert.assertTrue(e.getText().toLowerCase().contains(mesaj));
        }


    }

    @DataProvider
    public Object[] getData(){


        Object[] data={"mac","samsung","ipod"};

        return data;
    }

}
