package Gun03;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_Dependency {

/*
   interviewlarda sorulan bir konu : testlere öncelikleri nasıl verirsin ?
   priority, dependecy;   Nasıl kullanırsın ?
   1- priority =1 gibi sıralı rakamlar vererek bununla çalışma sırasını belirtirim.
   2- dependOnMethods : bununla kendinden önce hangi metod çalışması gerekiyor ise onu belirtirim.
   -Bir metodu direkt çalıştırdğınızda kendinden önce bağımlı olduğu 1 metod var ise ilk onları çalıştırrı sonra kendi çalışır
   fakat 2 veya daha fazla metod  varsa çalışmaz
 */


    @Test
    void startCar(){

        System.out.println("car started");

    }

    @Test(dependsOnMethods = {"startCar"}) //bu testin çalışması startCar testinin hatasız çalışmasına bağlı
    void driveCar(){

        System.out.println("car drive");

        Assert.fail();//burada hata verdirdik özellikle aşağıdaki alwaysRun metodunun çalışmasını gördük ve SKIP durumunu görmek için


    }


    @Test(dependsOnMethods = {"startCar","driveCar"})//bu testin çalışabilmesi için ilk ik testin hatasız çalışması gerekiyor
    void parkCar(){

        System.out.println("car parked");

    }

    @Test(dependsOnMethods = {"parkCar"},alwaysRun = true)//alwaysRun=true bağımlılıkları var ama hata çıksa bile çalışır
    void stpCar(){

        System.out.println("car stop");
    }


}
