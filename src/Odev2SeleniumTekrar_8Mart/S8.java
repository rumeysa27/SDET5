package Odev2SeleniumTekrar_8Mart;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class S8 extends BaseDriver {
    @Test
    public void Soru8(){
        //Bu web sitesine gidiniz. http://demo.seleniumeasy.com/bootstrap-alert-messages-demo.html
        //Normal success message'a tıklayınız.
        //Açılan yeşil penceredeki x buttonuna tıklayınız.

        // gözümün önünde olma ihtimali yüksek ama succes message bulamıyorum!!

        driver.get("http://demo.seleniumeasy.com/bootstrap-alert-messages-demo.html");

        MyFunc.Bekle(1);
        WebElement successMsj=driver.findElement(By.xpath("//button[@id='normal-btn-success']"));
        successMsj.click();

        MyFunc.Bekle(1);
        WebElement closeClick=driver.findElement(By.xpath("//button[@class='close']"));
        closeClick.click();


        BekleKapat();


    }
}
