package Gun07;

import javafx.scene.web.WebEngineBuilder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _03_PlaceOrderElements {
 // Bu sayfadaki bütün elemenalrın driverlar bağlantısı gerekiyor
    // bunun için aşağıdaki consructor eklendi ve içine PageFatory ile
    // driver üzerinden bu (this) sayfadaki bütün elemnalar ilşkilendirildi.
    // Böylece Sayfada dan nesne türetildiği zaman değil, kullanıldığı
    // anda elemanların bulunması aktif oluyor.Bu yöntemle bütün sayfalarda
    // aynı isimde elemanlar var ise buradaki tanımlama hepsi için geçerli hale
    // gelmiş oluyor. buna yapıya Page Object Model (POM) adı veriliyor.

    public _03_PlaceOrderElements(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "[name='search']")
    public WebElement search;

    @FindBy(css = "[type='button'][class='btn btn-default btn-lg']")
    public WebElement button;

    @FindBy(linkText = "iPod Classic")
    public WebElement ipod;

    @FindBy(id = "button-cart")
    public WebElement cart;

    @FindBy(linkText = "Checkout")
    public WebElement checkoutbutton;

    @FindBy(id = "button-payment-address")
    public WebElement cnt1;

    @FindBy(id = "button-shipping-address")
    public WebElement cnt2;

    @FindBy(id = "button-shipping-method")
    public WebElement cnt3;

    @FindBy(css = "[name='agree']")
    public WebElement terms;

    @FindBy(id = "button-payment-method")
    public WebElement cnt4;

    @FindBy(id = "button-confirm")
    public WebElement confirm;

    @FindBy(css = "[id=\"content\"]>h1")
    public WebElement confirmTxt;



}
