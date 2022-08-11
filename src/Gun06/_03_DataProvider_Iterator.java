package Gun06;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _03_DataProvider_Iterator {




    @Test(dataProvider = "getData")//burada methhod isminden dataproviderını eşleştirdik
    void UsernameTest(String username){
        System.out.println("Username= "+username);
    }

    @DataProvider
    public Iterator<Object> getData(){

        List<Object> data=new ArrayList<>();

         data.add("nurhayat");
         data.add("sinan");
         data.add("hösün");
         data.add("mamet");

        return data.iterator();
    }


    /**************************************************************/

    @Test(dataProvider="getData2")
    void UsernameTest2(String username, String password)
    {
        System.out.println("Username="+username+", password="+password);
    }

    @DataProvider
    public Iterator<Object[]> getData2()
    {
        List<Object[]> data= new ArrayList<>();
        data.add(new Object[]{"Nurhayat","12121"});
        data.add(new Object[]{"Alper","12121"});
        data.add(new Object[]{"Uğur","12121"});
        data.add(new Object[]{"Hakan","12121"});

        return data.iterator();
    }

}
