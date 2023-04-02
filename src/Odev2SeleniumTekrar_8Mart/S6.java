package Odev2SeleniumTekrar_8Mart;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class S6 extends BaseDriver {
    @Test
    public void Soru6(){
        //Bu websitesine gidiniz.  [https://testpages.herokuapp.com/styled/index.html]
        // (https://testpages.herokuapp.com/styled/index.html)
        //Fake Alerts' tıklayınız.
        //Show Alert Box'a tıklayınız.
        //Ok'a tıklayınız.
        //Alert kapanmalıdır.

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement fakeAl=driver.findElement(By.xpath("//a[@id='fakealerttest']"));
        fakeAl.click();
        MyFunc.Bekle(2);

        WebElement showAl=driver.findElement(By.xpath("//input[@class='styled-click-button'][@id='fakealert']"));
        showAl.click();
        MyFunc.Bekle(2);

        WebElement ok=driver.findElement(By.xpath("//button[@id='dialog-ok']"));
        ok.click();
        MyFunc.Bekle(1);


        //driver.switchTo().alert().accept();//alerti kapatıver gari:)

        BekleKapat();
    }
}
