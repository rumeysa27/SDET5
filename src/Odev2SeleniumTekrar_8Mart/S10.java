package Odev2SeleniumTekrar_8Mart;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class S10 extends BaseDriver {
    @Test
    public void Soru10(){
        //Bu web sitesine gidiniz.  http://demo.seleniumeasy.com/basic-checkbox-demo.html
        //check all button'a tıklayınız.
        //Uncheck All button'da " Uncheck All" yazısını yazdırınız.

        driver.get("http://demo.seleniumeasy.com/basic-checkbox-demo.html");

        MyFunc.Bekle(1);
        WebElement checkAllBttn=driver.findElement(By.id("check1"));
        checkAllBttn.click();

        MyFunc.Bekle(1);
        WebElement uncheckBttn=driver.findElement(By.xpath("//input[@value='Uncheck All']"));
        String text=uncheckBttn.getAttribute("value");
        System.out.println("uncheck All button:"+ text);
       // ** //*[@id="isChkd"]          //*[@id="check1"]

        BekleKapat();




    }
}
