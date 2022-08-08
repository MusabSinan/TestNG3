package Gun01;

import org.testng.annotations.Test;

public class _01_Giris {
    //public static void main(String[] args) {


        //        webSitesiniAc();
       //        LoginTestIsleminiYap();        //ARTIK MAİNE İHTİYACIMIZ YOK
        //        driverıKapat();


  //  }

    // Eğer test metodlarına sıralama verilmezse alfabetik sırasına göre çalışır.

    @Test(priority = 1) //burada öncelik sırasını belirttik bu kodla sırası 1 bunun ilk bu çalıacak // annotation lar yani öncelik belirteçleri
    void webSitesiniAc(){

        System.out.println("driver tanımlandı ve web sitesi açıldı");
    }


    @Test(priority = 2)//burada öncelik sırasını belirttik bu kodla sırası 2 bunun ikinci bu çalıacak
    void LoginTestİsleminiYap(){
        System.out.println("login test işlemleri yapıdı");
    }


    @Test(priority = 3)//burada öncelik sırasını belirttik bu kodla sırası 3 bunun üçüncü bu çalıacak
    void driverikapat(){
        System.out.println("driver kapatıldı ve çıkıldı");
    }
}
