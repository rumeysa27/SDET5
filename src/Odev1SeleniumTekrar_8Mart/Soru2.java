package Odev1SeleniumTekrar_8Mart;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Soru2 extends BaseDriver {
    @Test
    public void Soru2(){
        //Senaryo
        //1- https://www.youtube.com/ adresine gidiniz
        //2- "Selenium" kelimesi ile video aratınız.
        //3- Listelenen sonuçlarda 80 videoaya kadar lsiteyi uzatınız.
        //4- Son videonun title ını yazdırınız.

        driver.get("https://www.youtube.com/");


        MyFunc.Bekle(1);
        WebElement inputbutton=driver.findElement(By.cssSelector("input[id='search']"));
        inputbutton.sendKeys("Selenium");

        MyFunc.Bekle(1);
        WebElement searchBox=driver.findElement(By.xpath("//*[@id='search-icon-legacy']/yt-icon"));
        searchBox.click();

       // JavascriptExecutor js=(JavascriptExecutor) driver;

//    ("arguments[0].scrollIntoView(true);", element)       -> Verilen elemente kadar gider.





        BekleKapat();


    }
}
