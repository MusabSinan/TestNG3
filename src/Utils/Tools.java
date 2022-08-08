package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;
import java.util.WeakHashMap;

public class Tools {


    public static void compareToList(List<String>menuExpectedList, List<WebElement>menuActualList){//static olmalı  ki heryerdden çağırabilelim


        for (int i = 0; i < menuExpectedList.size(); i++) {

            Assert.assertEquals(menuExpectedList.get(i),menuActualList.get(i).getText(),"Karşılaştırma Sonucu");


        }
    }


   public static void successMessageValidation(){//static olmalı  ki heryerdden çağırabilelim

       WebElement validate= GenelWebDriver.driver.findElement(By.cssSelector("[class='alert alert-success alert-dismissible']"));

       Assert.assertTrue(validate.getText().toLowerCase().contains("success"));

   }

    public static void Bekle(int saniye)
    {

        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
