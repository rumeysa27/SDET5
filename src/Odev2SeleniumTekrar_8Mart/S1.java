package Odev2SeleniumTekrar_8Mart;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class S1 extends BaseDriver {
    @Test
    public void Soru1(){
        //Bu web sitesine gidin
        //[https://testpages.herokuapp.com/styled/index.html]
        // (https://testpages.herokuapp.com/styled/index.html)
        //Alerts e tıklayınız //URL'i yazdırınız.

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        MyFunc.Bekle(1);
        WebElement alerts=driver.findElement(By.xpath("//*[@id='alerts']"));
        alerts.click();

       /* String currentUrl = driver.getCurrentUrl();
        System.out.println("current Url:"+ currentUrl); böyle de olur   */
        MyFunc.Bekle(1);
        System.out.println(driver.getCurrentUrl());


        BekleKapat();
    }
}
