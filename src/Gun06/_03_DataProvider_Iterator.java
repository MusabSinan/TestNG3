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
}
