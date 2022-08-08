package Gun01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_Assertions {

    //Yeşil tik :teste hata yok
    //satı çarpı:teste hata var
    //Beyaz: test çalıştırılmadı-->skip

    @Test
    void  EqualOrnek(){

        String s1="merhaba";
        String s2="iyi akşamlar";
                       //oluşan,beklenen," hata başlığı"
        Assert.assertEquals(s1,s2,"Karşılaaştırma sonucu");

        //actual: oluşan
        //expected : beklenen

    }


    @Test
    void  NotEqualOrnek(){

        String s1="merhaba";
        String s2="iyi akşamlar";

        Assert.assertNotEquals(s1,s2,"Karşılaaştırma sonucu"); //'assertNotEquals' ibaresi eşit değil iki kelime birbirine

    }

    @Test
    void  TrueOrnek(){

        int sayi=545;
        int sayi1=55;

        Assert.assertTrue(sayi==sayi1,"karşılaştırma sonucu");

    }

    @Test
    void nullOrnek(){

        String s1=null;                                       //primitive tipler null olamaza yani int,byte gibi

        Assert.assertNull(s1,"karşılaştırma sonucu");
    }
    @Test
    void direktFail(){



        Assert.fail();
    }
}
