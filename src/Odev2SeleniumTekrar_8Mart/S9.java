package Odev2SeleniumTekrar_8Mart;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class S9 extends BaseDriver {
    @Test
    public void Soru9(){
        //Bu web sitesine gidiniz.http://demo.seleniumeasy.com/bootstrap-alert-messages-demo.html
        //Normal success message'a tıklayınız.
        //Açılan penceredeki x buttonuna tıklayınız.
        //Mesaj görünmemelidir.

        driver.get("http://demo.seleniumeasy.com/bootstrap-alert-messages-demo.html");

        MyFunc.Bekle(1);
        WebElement successMsj=driver.findElement(By.xpath("//button[@id='normal-btn-success']"));
        successMsj.click();

        MyFunc.Bekle(1);
        WebElement closeClick=driver.findElement(By.xpath("//button[@class='close']"));
        closeClick.click();

        //msj görünmemeledir kısmını pek anlayamadım
      WebElement displayNone=driver.findElement(By.xpath("//div[@style='display: none;']"));
       String messageStyle=displayNone.getAttribute("style");
       //if (messageStyle!="display: none;");





        BekleKapat();

    }
}
