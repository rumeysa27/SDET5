package Odev2SeleniumTekrar_8Mart;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class S7 extends BaseDriver {
    @Test
    public void Soru7(){
        //Bu siteye gidiniz.  https://testpages.herokuapp.com/styled/index.html
        //Fake Alerts'e tıklayınız.
        //Show modal dialog buttonuna tıklayınız.
        //Ok'a tıklayınız.
        //Alert kapanmalıdır.

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement fakeAle=driver.findElement(By.cssSelector("[id='fakealerttest']"));
        fakeAle.click();
        MyFunc.Bekle(2);

        WebElement showMod=driver.findElement(By.cssSelector("input[class='styled-click-button']"));
        showMod.click();
        MyFunc.Bekle(2);

        WebElement ok=driver.findElement(By.cssSelector("[id='dialog-ok'][class='dialog-button']"));
        ok.click();
        MyFunc.Bekle(1);


      //  driver.switchTo().alert().accept();//alerti kapatıver gari:)

        BekleKapat();
    }
}
