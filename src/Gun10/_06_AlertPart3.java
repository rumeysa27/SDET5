package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _06_AlertPart3 extends BaseDriver {
    @Test
    public void Test1(){
        /*
      Interview sorusu
      - Alertleri nasıl kullanırsın ?
        driver.switchTo().alert()     -> alerte geçerim
        komutları:
        1- accept : OK, TAMAM botunan basmamızı sağlar.
        2- dismiss : CANCEL, HAYIR, yani olumsuz butonuna basmamızı sağlıyor.
        3- sendKeys : yazı gönderme
        4- getText : uyarı yazısını alma

 */
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickMe2=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        MyFunc.Bekle(2);
        clickMe2.click();

        MyFunc.Bekle(2);
        driver.switchTo().alert().sendKeys("rümeysa");
        driver.switchTo().alert().accept();

        MyFunc.Bekle(2);
        WebElement txtActual=driver.findElement(By.id("prompt-demo"));

        Assert.assertTrue("bekleenen yazı görüldü mü",txtActual.getText().contains("rümeysa"));
        BekleKapat();
    }
}
