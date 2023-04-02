package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {
    public static WebDriver driver;

     static {

         //HOKUS POKUS
         // Eğer extend edilen classtaki fonksiyon main de ilk olarak kullanılıyorsa
         //mainde fonksyion adını yazmaya gerek yoktur. fakat fonksiyonun yazılmadan
         // kullanılabilmesi için metodun yazıldı classta metod adı silinmeli sadece
         // static olarak bırakılmalır.

         KalanOncekileriKapat();

        Logger logger= Logger.getLogger(""); // output  ait bütün logları üreten objeye/servise ulaştım ""
        logger.setLevel(Level.SEVERE); // Sadece errorları göster

        //gerekmeyen logları kaldıracağız (çalıştırınca
        //aşağıda çıkan kırmızı yazılar)

        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

        ChromeOptions options=new ChromeOptions(); //google ı güncellerse bu 3 satırı aç 36yı yoruma al
         options.addArguments("--remote-allow-origins=*");
         driver=new ChromeDriver(options);
       // driver=new ChromeDriver();//güncelleme olduğu için bunu kaldırdık

        driver.manage().window().maximize(); //ekranı tam ekran yapıyor

        Duration dr=Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(dr);
        // sadece tüm sayfanın kodlarının bilgisayarınıza inmesiyle süresiyle ilgili
        //bu eklenmezse Selenium sayfa yüklenene kadar (sonsuza) bekler.:
        // 30 sn süresince sayfanın yüklenmesini bekle yüklenmezse hata ver
        // eğer 2 sn yüklerse 30 sn. beklemez.

        driver.manage().timeouts().implicitlyWait(dr);
        // Bütün weblementlerin element bazında, elemente özel işlem yapılmadan önce
        // hazır hale gelmesi verilen mühlet yani süre.
        // eğer 2 sn yüklerse 30 sn. beklemez.



    }
    public static void BekleKapat(){
        MyFunc.Bekle(3);
        driver.quit();
    }
    public static void KalanOncekileriKapat(){

         //kullanılmayan sayfaları kapatarak hafıza gereksiz yer kaplamasını önler
        // böylece bilgisayar daha performanslı çalışıyor


        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        } catch (Exception ignored) {


        }
     }

}
