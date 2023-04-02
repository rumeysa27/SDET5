package Gun12;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_IFrameSoru extends BaseDriver {
    @Test
    public void Test1(){
        // 1-driver.get("http://chercher.tech/practice/frames"); sayfasına gidiniz.
        //   2-Inputa ülke adı yazınız
        //   3-CheckBox ı çekleyiniz.
        //   4-Select in 4.elemanını seçiniz.

        driver.get("http://chercher.tech/practice/frames");
        driver.switchTo().frame(0);//0. indexe geçtim yani birinci frame

        WebElement input=driver.findElement(By.cssSelector("#topic+input"));
        input.sendKeys("Türkiye");


        driver.switchTo().frame(0);//1.framenin içindeki tek frame yani indexi 0, odanın içindeki başka oda ondan kaynaklı indexi 0
        WebElement checkbox=driver.findElement(By.id("a"));
        checkbox.click();

       // driver.switchTo().parentFrame();
       // driver.switchTo().parentFrame(); bu ikisiyle de gidebilirsin iki geriye
        driver.switchTo().defaultContent();//böyle daha kestirme direkt olarak anasayfay gider

        driver.switchTo().frame(1);
        WebElement webSelect=driver.findElement(By.id("animals"));
        Select nesneSelect=new Select(webSelect);
        nesneSelect.selectByIndex(3);//4.eleman


        BekleKapat();
    }
}
