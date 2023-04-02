package Gun04;

import Utility.MyFunc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_OpeningWebsite {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com");//google sayfaya gidiyor direkt
        //driver.get("website URL");
        //driver.quit(); //bu komutu bir alternatifi de close() dur.

        //1- Hepsiburada.com sayfasına git
//        2- arama kutusuna usb yaz
//        3- Ara butonuna bas
//        4- Çıkan ürünlerin açıklamasında USB kelimesi
//        ni kontrol.
// driverdan isteyeceğiz aşağıdaki kodları

//        eleman aramakutusu = aramakutusunu bul;
//        aramakutusu.yaziGonder("usb");
//        elemanlar =  urunListesiniAl;
//        for döngüsü ile kontrol et.


        //diriver.quit bütün açılmış tarayıcıları kapatır.
        //driver.close(): sadece aktif olanı kapatır. **bu ikisinin farkı interview larda soruluyormuş

        MyFunc.Bekle(5);
        driver.quit();




    }
}
