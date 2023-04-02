package Odev2SeleniumTekrar_8Mart;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class S14 extends BaseDriver {
    @Test
    public void Soru14(){
        //Bu web sitesine gidiniz. [http://demo.seleniumeasy.com/basic-first-form-demo.html](http://demo.seleniumeasy.com/basic-first-form-demo.html)
        //Mesajınızı giriniz. //Show message'a tıklayınız.
        //Show message button'unun altında mesajınızı yazdırınız.

        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");

        MyFunc.Bekle(1);
        WebElement mesaj=driver.findElement(By.cssSelector("input[type='text'][class='form-control']"));
        mesaj.sendKeys("Güzel günler göreceğiz çocuklar..");

        MyFunc.Bekle(1);
        WebElement showMesaj=driver.findElement(By.cssSelector("button[type='button'][class='btn btn-default']"));
        showMesaj.click();

        MyFunc.Bekle(1);
        WebElement yourMessage=driver.findElement(By.id("display"));
        System.out.println("Mesajınız: "+ yourMessage.getText());

        BekleKapat();


    }
}
