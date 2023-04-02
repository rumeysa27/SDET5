package Odev2SeleniumTekrar_8Mart;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class S11 extends BaseDriver {
    @Test
    public void Soru11(){
        //Bu web sitesine gidiniz.   http://demo.seleniumeasy.com/basic-select-dropdown-demo.html
        //Select a day dropdown'ından rastgele bir seçenek seçiniz.
        //5 kere wednesday seçtikten sonra döngüyü durdurun.
        //Kaç kere Wednesday seçtiğinizi yazdırınız.
        //Sonuç 5 olmalıdır.

        driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");

        MyFunc.Bekle(1);
        WebElement dropDown=driver.findElement(By.id("select-demo"));
        Select day =new Select(dropDown);

        MyFunc.Bekle(1);
        int carsambaToplam=0;
        do {

            int randomNumber = (int) (Math.random() * 7)+1;
            day.selectByIndex(randomNumber);
            WebElement gun=driver.findElement(By.className("selected-value"));//day selected kısmının locatorı
            if (gun.getText().contains("Wednesday")){
                carsambaToplam++;
            }
        }while (carsambaToplam !=5);
        System.out.println("seçilen sayısı: "+ carsambaToplam);

       // BekleKapat();


    }
}
