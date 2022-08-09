package Gun06;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _01_DataProvider {


    @Test(dataProvider = "getData")//burada methhod isminden dataproviderını eşleştirdik
    void UsernameTest(String username){
        System.out.println("Username= "+username);
    }

    @DataProvider
    public Object[] getData(){


        Object[] data={"nurhayat","sinan","hösün","mamet"};

        return data;
    }

    /***********************************************************/

    @Test(dataProvider = "userlar")
    void UsernameTest2(String username){
        System.out.println("Username= "+username);
    }

    @DataProvider(name = "userlar")//burada dataprovidera isim verdik yukarıda ismiyle çağırdık
    public Object[] getData2(){


        Object[] data={"nurhayat","sinan","hösün","mamet"};

        return data;
    }


}
