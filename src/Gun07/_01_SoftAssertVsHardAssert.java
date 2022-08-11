package Gun07;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _01_SoftAssertVsHardAssert {

    @Test
    void hardAssert(){

        String s1="Merhaba";

        Assert.assertEquals("Merhaba123",s1,"HardAssert sonucu");


    }

    @Test
    void softAssert(){

        String str="ekmek yin mi";
        String str1="ekmek var yin mi";
        String str2="ekmek yimez misin";

        SoftAssert softassert=new SoftAssert();

        softassert.assertEquals("ekmek yin mi",str);//true
        softassert.assertEquals("ekmek var yin mi",str2);//fail
        softassert.assertEquals("ekmek yimez misin",str1);//fail

        softassert.assertAll();//bütün assert sonuçlarını gösteriyor hatalı olanları

    }

}
