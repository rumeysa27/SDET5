package Odev2SeleniumTekrar_8Mart;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class S4 extends BaseDriver {
    @Test
    public void Soru4(){
        //Bu websitesine gidiniz.  [https://testpages.herokuapp.com/styled/index.html]
        // (https://testpages.herokuapp.com/styled/index.html)
        //Search'e tıklayınız.
        //Başlığı yazdırınız.
        //Search button'una tıklayınız.
        // URL'i yazdırınız.

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        MyFunc.Bekle(1);
        WebElement search=driver.findElement(By.cssSelector("#searchtest"));
        search.click();

        MyFunc.Bekle(1);
        WebElement baslik=driver.findElement(By.xpath("/html/body/div/h1"));
        baslik.getText();
        System.out.println(baslik.getText());

        MyFunc.Bekle(1);
        WebElement search2=driver.findElement(By.cssSelector("body > div > form > input[type=submit]"));
        search2.click();

        MyFunc.Bekle(1);
        System.out.println(driver.getCurrentUrl());


        BekleKapat();
    }
}
