package Gun06;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _02_DataProvider_CokBoyutlu {



    @Test(dataProvider = "getData")//burada methhod isminden dataproviderını eşleştirdik
    void UsernameTest(String username,String password){
        System.out.println("Username= "+username+", password="+password);
    }

    @DataProvider
    public Object[][] getData(){


        Object[][] data={
                {"nurhayat","123456"},
                {"sinan","gegee"},
                {"hösün","balcankebabı"},
                {"mamet","adanaspor"}
        };

        return data;
    }


}
