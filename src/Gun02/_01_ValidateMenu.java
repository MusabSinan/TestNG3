package Gun02;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class _01_ValidateMenu extends GenelWebDriver {


    /*
        Senaryo;
        1- Siteyi açınız
        2- Top Menudeki menu elemanlarının olduğunu doğrulayınız.
     */




       @Test
       void menuValidation(){

           List<String> menu=new ArrayList<>();
           menu.add("Desktops");
           menu.add("Laptops & Notebooks");
           menu.add("Components");
           menu.add("Tablets");
           menu.add("Software");
           menu.add("Phones & PDAs");
           menu.add("Cameras");
           menu.add("MP3 Players");


          List<WebElement> menuActuallist=driver.findElements(By.cssSelector("ul[class='nav navbar-nav']>li"));

           Tools.compareToList(menu,menuActuallist); //bu bir metod Tools clasına bak Utils içindeki


       }




}
