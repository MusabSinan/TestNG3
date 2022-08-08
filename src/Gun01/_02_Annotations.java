package Gun01;

import org.testng.annotations.*;

public class _02_Annotations {



    /*

      @BeforeClass --> // Her class çalışıyorken önce burası çalışır
           @BeforeMetod --> // Her metoddan(test metod) önce çalışır
              @Test     -->  testlerin çalıştığı metodlar
              @Test     -->  testlerin çalıştığı metodlar
           @AfterMetod --> // Her metoddan(test metod) sonra çalışır
         @AfterClass --> // Her class çalışıyorken sonra burası çalışır



     */


    @BeforeClass
    void beforeClass(){System.out.println("her class dan önce çalışacak : Before Class");}

    @BeforeMethod
    void BeforeMetod(){System.out.println("her test metoddan önce çalışacak : before metod");}

    @Test
    void test1(){System.out.println("test 1 çalıştı");}
    @Test
    void test2(){System.out.println("test 2 çalıştı"); }

    @AfterMethod
    void AfterMetod(){ System.out.println("her metoddan dan sonra çalışacak : after metod");}
     @AfterClass
    void afterClass(){ System.out.println("her class dan sonra çalışacak : after Class");}



}
