package Odev2SeleniumTekrar_8Mart;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class S21 extends BaseDriver {
    @Test
    public void Soru21(){
        //Bu websitesine gidiniz. [http://en.wikipedia.org/wiki/FIFA_World_Cup]
        //Contents'in içindeki All-time table for champions'a tıklayınız.
        //Argentina'nın participation(katılım) sayısını yazdırınız.
        // Not: Bu tablo zamanla değişebilir. Mutlak konumu yazdırmayın.
        //Argentina'nın participation'ını yazdırınız.

        driver.get("https://en.wikipedia.org/wiki/FIFA_World_Cup");

        Actions aksiyonlar= new Actions(driver);
        WebElement contents=driver.findElement(By.xpath("//*[@id='vector-toc']/div/h2"));

        //linkte istenilen all-time for champions seçeneğini bulamıyorum!!












       //BekleKapat();
    }
}
