package Odev2SeleniumTekrar_8Mart;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class S2 extends BaseDriver {
    @Test
    public void Soru2(){
        //Bu web sitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
        // (https://testpages.herokuapp.com/styled/index.html)
        //Alerts'e tıklayınız.
        //        URL'i yazdırınız.
        //Geri gidin.
        //        URL'i yazıdırnız.
        //Basic Ajax'a tıklayınız.
        //         URL'i yazdırınız.

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        MyFunc.Bekle(1);
        WebElement alerts=driver.findElement(By.cssSelector("#alerts"));
        alerts.click();

        MyFunc.Bekle(1);
        System.out.println(driver.getCurrentUrl());

        MyFunc.Bekle(1);
        driver.navigate().back();

        MyFunc.Bekle(1);
        System.out.println(driver.getCurrentUrl());

        MyFunc.Bekle(1);
        WebElement basicAjax=driver.findElement(By.id("basicajax"));
        basicAjax.click();

        MyFunc.Bekle(1);
        System.out.println(driver.getCurrentUrl());


        BekleKapat();
    }
}
