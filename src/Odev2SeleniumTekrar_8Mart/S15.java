package Odev2SeleniumTekrar_8Mart;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class S15 extends BaseDriver {
    @Test
    public void Soru15(){
        //Bu web sitesine gidiniz. [http://demo.seleniumeasy.com/basic-first-form-demo.html](http://demo.seleniumeasy.com/basic-first-form-demo.html)
        //"Enter a" ya bir değer giriniz. //"Enter b" ye bir değer giriniz //Get Total'a basınız.
        // Web sitesindeki sonucu yazdırınız.

        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement enterA=driver.findElement(By.id("sum1"));
        enterA.sendKeys("123");

        WebElement enterB=driver.findElement(By.id("sum2"));
        enterB.sendKeys("345");

        WebElement getTotal=driver.findElement(By.xpath("//button[text()='Get Total']"));
        getTotal.click();

        WebElement sonuc=driver.findElement(By.id("displayvalue"));
        System.out.println("Sonucunuz: "+sonuc.getText());

        BekleKapat();

    }
}
